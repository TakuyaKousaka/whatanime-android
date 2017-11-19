package com.takuya.whatanimu.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.takuya.whatanimu.R;
import com.takuya.whatanimu.ui.tor.Navigator;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        setupToolbar();
        setupActions();
    }

    private void setupActions() {
        findViewById(R.id.tv_app_developer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigator.goToWebBrowser(InformationActivity.this, getString(R.string.url_app_dev));
            }
        });
        findViewById(R.id.tv_api_developer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigator.goToWebBrowser(InformationActivity.this, getString(R.string.url_api_dev));
            }
        });
    }

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
