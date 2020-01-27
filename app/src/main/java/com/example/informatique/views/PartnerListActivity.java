package com.example.informatique.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.informatique.R;
import com.example.informatique.adapters.PartnerListAdapter;
import com.example.informatique.models.HumanPartners;
import com.example.informatique.utlitites.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PartnerListActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.partner_list_recycler)
    RecyclerView partnerListRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner_list);
        ButterKnife.bind(this);


        setupToolbar();

        listPartner();
    }



    private void setupToolbar() {
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("humanPartners");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(v -> finish());
    }


    private void listPartner() {
        List<HumanPartners> humanPartnerslist =getIntent().getParcelableArrayListExtra(Constant.partnerList);
        partnerListRecycler.setLayoutManager(new LinearLayoutManager(this));
        PartnerListAdapter partnerListAdapter = new PartnerListAdapter(humanPartnerslist, this);
        partnerListRecycler.setAdapter(partnerListAdapter);
    }


    @Override
    public void onBackPressed() {
        finish();
    }
}
