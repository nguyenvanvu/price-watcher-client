package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vunguyen on 4/27/2015.
 */
public class BrandActivity extends Activity {

    private ListView listViewBrand;
    private CategoryAdapter brandAdapter = null;
    private ArrayList<CategoryAdapter.Categoty> brandArrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);

        brandArrayList = new ArrayList<CategoryAdapter.Categoty>();

        listViewBrand = (ListView)findViewById(R.id.listViewBrand);
        brandAdapter = new CategoryAdapter(this, R.layout.categories_item_layout,brandArrayList);
        listViewBrand.setAdapter(brandAdapter);
        brandArrayList.add(new CategoryAdapter.Categoty("Apple", "brand_apple"));
        brandArrayList.add(new CategoryAdapter.Categoty("LG", "brand_lg"));
        brandArrayList.add(new CategoryAdapter.Categoty("Samsung", "brand_samsung"));
        brandArrayList.add(new CategoryAdapter.Categoty("HTC", "brand_htc"));
        brandArrayList.add(new CategoryAdapter.Categoty("Nokia", "brand_nokia"));
        brandArrayList.add(new CategoryAdapter.Categoty("Microsoft", "brand_microsoft"));
        brandArrayList.add(new CategoryAdapter.Categoty("Blackberry", "brand_blackberry"));
        brandAdapter.notifyDataSetChanged();

      //  AsyncTaskJSON asyncTaskJSONBrand = new AsyncTaskJSONBrand(brandArrayList);
      //  asyncTaskJSONBrand.execute("https://tonghopgiacathitruong-truyenlm.c9.io/product/category/554348d3d4e95a400d2a6470");
      //  Log.i("test list", brandArrayList.get(0).CategoryName);
      //  Log.i("debug json", "sssssssssssssssssss");

       // brandAdapter.notifyDataSetChanged();

        final ImageButton imageButtonBack = (ImageButton) findViewById(R.id.imageButtonBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });



        listViewBrand.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(i);
            }
        });

    }
}
