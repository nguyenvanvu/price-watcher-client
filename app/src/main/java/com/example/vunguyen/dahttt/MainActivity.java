package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private SearchView searchView;
    private ListView listViewCategory;
    private CategoryAdapter categoryAdapter = null;
    private ArrayList<CategoryAdapter.Categoty> categotyArrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //search view
        searchView = (SearchView)findViewById(R.id.searchView);
        searchView.onActionViewExpanded();

        categotyArrayList = new ArrayList<CategoryAdapter.Categoty>();

        listViewCategory = (ListView)findViewById(R.id.listViewCategory);
        categoryAdapter = new CategoryAdapter(this, R.layout.categories_item_layout,categotyArrayList);
        listViewCategory.setAdapter(categoryAdapter);
        categotyArrayList.add(new CategoryAdapter.Categoty("SmartPhone", "category_smartphone"));
        categotyArrayList.add(new CategoryAdapter.Categoty("Tablet", "category_tablet"));
        categotyArrayList.add(new CategoryAdapter.Categoty("Laptop", "category_laptop"));
        categotyArrayList.add(new CategoryAdapter.Categoty("Television", "category_television"));
        categotyArrayList.add(new CategoryAdapter.Categoty("Headphone", "category_headphone"));
        categotyArrayList.add(new CategoryAdapter.Categoty("Camera", "category_camera"));
        categotyArrayList.add(new CategoryAdapter.Categoty("Printer", "category_printer"));
        categoryAdapter.notifyDataSetChanged();

        listViewCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),BrandActivity.class);
                startActivity(i);
            }
        });


    }




}
