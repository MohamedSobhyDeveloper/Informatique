package com.example.informatique.views;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.informatique.R;
import com.example.informatique.models.CompanyModel;
import com.example.informatique.utlitites.Constant;
import com.example.informatique.utlitites.Loading;
import com.example.informatique.view_model.CompanyViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.companyName_tv)
    TextView companyNameTv;
    @BindView(R.id.expirtDate_tv)
    TextView expirtDateTv;
    @BindView(R.id.partner_list_more_layout)
    LinearLayout partnerListMoreLayout;
    @BindView(R.id.company_layout)
    LinearLayout companyLayout;
    CompanyModel companyModel;


    CompanyViewModel companyViewModel;

    Loading loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loading=new Loading(this);

        CallCompanyApi();


    }


    @OnClick(R.id.partner_list_more_layout)
    public void onViewClicked() {
        Intent intent=new Intent(MainActivity.this,PartnerListActivity.class);
        intent.putParcelableArrayListExtra(Constant.partnerList,companyModel.getResult().getHumanPartners());
        startActivity(intent);
    }






    //region Call Api

    private void CallCompanyApi() {
        String companyNum=getIntent().getStringExtra(Constant.companyNumber);
        loading.show();
        companyViewModel=new CompanyViewModel(this.getApplication(),companyNum);
        getCompanyInfo();



    }

    private void getCompanyInfo() {
        companyViewModel.getArticleResponseLiveData().observe(this, (companyModel) -> {
            if (companyModel!=null){
                getCompanyAction(companyModel);
            }

        });
    }
    //endregion


    //region Call Action


    @SuppressLint("SetTextI18n")
    private void getCompanyAction(CompanyModel companyModel) {
        loading.dismiss();
        this.companyModel=companyModel;
        companyNameTv.setText(companyModel.getResult().getArabicCommercialName()+"");
        expirtDateTv.setText("expiryDate:  "+companyModel.getResult().getExpiryDate());
        companyLayout.setVisibility(View.VISIBLE);
    }

    //endregion

}
