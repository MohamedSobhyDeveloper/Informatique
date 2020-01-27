package com.example.informatique.views;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.informatique.R;
import com.example.informatique.utlitites.Constant;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.companyNum_edt)
    EditText companyNumEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.companyLoginBtn)
    public void onViewClicked() {
        if (companyNumEdt.getText().toString().isEmpty()) {
            companyNumEdt.setError("Please Enter Company Number");
        } else if (companyNumEdt.getText().toString().equals("1234567")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra(Constant.companyNumber, companyNumEdt.getText().toString());
            startActivity(intent);
        }else {
            companyNumEdt.setError("Please Enter Correct Number");

        }
    }


}
