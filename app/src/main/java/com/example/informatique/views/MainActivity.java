package com.example.informatique.views;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.informatique.R;
import com.example.informatique.models.CompanyModel;
import com.example.informatique.retrofitConfig.HandelCalls;
import com.example.informatique.retrofitConfig.HandleRetrofitResp;
import com.example.informatique.utlitites.Constant;
import com.example.informatique.utlitites.DataEnum;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sdsmdg.tastytoast.TastyToast;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements HandleRetrofitResp {

    @BindView(R.id.companyName_tv)
    TextView companyNameTv;
    @BindView(R.id.expirtDate_tv)
    TextView expirtDateTv;
    @BindView(R.id.partner_list_more_layout)
    LinearLayout partnerListMoreLayout;
    @BindView(R.id.company_layout)
    LinearLayout companyLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        CallCompanyApi();


    }


    @OnClick(R.id.partner_list_more_layout)
    public void onViewClicked() {

    }

    private void CallCompanyApi() {
        String companyNum=getIntent().getStringExtra(Constant.companyNumber);
        HashMap<String, String> meMap = new HashMap<>();
        meMap.put("cr", companyNum);
        HandelCalls.getInstance(this).call(DataEnum.CallCompanyInfo.name(), meMap, true, this);

    }

    //region Call Retrofit Response

    @Override
    public void onResponseSuccess(String flag, Object o) {

        getCompanyAction(o);


    }


    @Override
    public void onResponseFailure(String flag, String o) {

    }

    @Override
    public void onNoContent(String flag, int code) {

    }

    //endregion


    //region Call Action

    @SuppressLint("SetTextI18n")
    private void getCompanyAction(Object o) {
        CompanyModel companyModel=(CompanyModel)o;
        companyNameTv.setText(companyModel.getResult().getArabicCommercialName()+"");
        expirtDateTv.setText("expiryDate:  "+companyModel.getResult().getExpiryDate());
        companyLayout.setVisibility(View.VISIBLE);
    }

    //endregion

}
