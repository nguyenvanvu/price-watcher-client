package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vunguyen on 4/22/2015.
 */
public class CategoryAdapter extends ArrayAdapter<CategoryAdapter.Categoty> {
    private Activity context = null;
    private int resource;
    private ArrayList<Categoty> arrayListCategory = null;

    public static class Categoty{
        public String CategoryName = "";
        public String Image = "";
        public Categoty(String CategoryName , String Image){
            this.CategoryName = CategoryName;
            this.Image = Image;
        }
    }

    public CategoryAdapter(Activity context, int resource, ArrayList<Categoty> arrayListCategory) {
        super(context, resource, arrayListCategory);
        this.context = context;
        this.resource = resource;
        this.arrayListCategory = arrayListCategory;

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(this.resource , parent, false);

        if (arrayListCategory.size() > 0 && position >= 0) {
            final Categoty categoty = arrayListCategory.get(position);
            final TextView textViewCategoty = (TextView)convertView.findViewById(R.id.textViewCategory);
            textViewCategoty.setText(categoty.CategoryName);
            final ImageView imageViewCategory = (ImageView)convertView.findViewById(R.id.imageViewCategory);
            imageViewCategory.setImageResource(context.getResources().getIdentifier(categoty.Image, "drawable", context.getPackageName()));
        }
        return convertView;
    }
}
