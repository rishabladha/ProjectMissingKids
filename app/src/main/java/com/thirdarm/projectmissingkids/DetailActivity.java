package com.thirdarm.projectmissingkids;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.thirdarm.projectmissingkids.databinding.ActivityDetailBinding;


public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding mDetailDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDetailDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
    }

}