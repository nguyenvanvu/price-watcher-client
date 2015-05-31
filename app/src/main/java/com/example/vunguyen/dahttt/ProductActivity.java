package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vunguyen on 5/26/2015.
 */
public class ProductActivity extends Activity {

    private ListView listViewProduct;
    private ProductAdapter productAdapter = null;
    private ArrayList<ProductAdapter.Product> productArrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        productArrayList = new ArrayList<ProductAdapter.Product>();

        listViewProduct = (ListView)findViewById(R.id.listViewProduct);
        productAdapter = new ProductAdapter(this, R.layout.product_item_layout,productArrayList);
        listViewProduct.setAdapter(productAdapter);

        productArrayList.add(new ProductAdapter.Product("Apple Iphone 6", "product_iphone6"));
        productArrayList.add(new ProductAdapter.Product("Apple Iphone 6", "product_iphone6"));
        productArrayList.add(new ProductAdapter.Product("Apple Iphone 6", "product_iphone6"));
        productArrayList.add(new ProductAdapter.Product("Apple Iphone 6", "product_iphone6"));
        productArrayList.add(new ProductAdapter.Product("Apple Iphone 6", "product_iphone6"));
        productArrayList.add(new ProductAdapter.Product("Apple Iphone 6", "product_iphone6"));

        productAdapter.notifyDataSetChanged();

        final ImageButton imageButtonBack = (ImageButton) findViewById(R.id.imageButtonBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });

        listViewProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),ProductDetailActivity.class);
                startActivity(i);
            }
        });

    }
}
