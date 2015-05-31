package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vunguyen on 5/26/2015.
 */
public class ProductAdapter extends ArrayAdapter<ProductAdapter.Product> {
    private Activity context = null;
    private int resource;
    private ArrayList<Product> arrayListProduct = null;

    public ProductAdapter(Activity context, int resource, ArrayList<Product> arrayListProduct) {
        super(context, resource, arrayListProduct);
        this.context = context;
        this.resource = resource;
        this.arrayListProduct = arrayListProduct;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(this.resource , parent, false);

        if (arrayListProduct.size() > 0 && position >= 0) {
            final Product product = arrayListProduct.get(position);
            final TextView textViewProduct = (TextView)convertView.findViewById(R.id.textViewProduct);
            textViewProduct.setText(product.nameProduct);
            final ImageView imageViewCategory = (ImageView)convertView.findViewById(R.id.imageViewProduct);
            imageViewCategory.setImageResource(context.getResources().getIdentifier(product.imageProduct, "drawable", context.getPackageName()));
        }
        return convertView;
    }

    public static class Product{
        public String nameProduct = "";
        public String imageProduct = "";
        public Product(String ProductName , String Image){
            this.nameProduct = ProductName;
            this.imageProduct = Image;
        }
    }
}
