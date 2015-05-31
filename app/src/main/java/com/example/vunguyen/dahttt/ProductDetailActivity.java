package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by vunguyen on 5/31/2015.
 */
public class ProductDetailActivity extends FragmentActivity {
    ViewPager viewPager;
    TabsPagerAdapter TabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        TabAdapter = new TabsPagerAdapter(getSupportFragmentManager(), ProductDetailActivity.this);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        viewPager.setAdapter(TabAdapter);


        // Give the SlidingTabLayout the ViewPager
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        // Center the tabs in the layout
        slidingTabLayout.setDistributeEvenly(true);
        //  slidingTabLayout.setCustomTabView(R.layout.custom_tab, 0);
        slidingTabLayout.setViewPager(viewPager);

        final ImageButton imageButtonBack = (ImageButton) findViewById(R.id.imageButtonBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });

    }
}