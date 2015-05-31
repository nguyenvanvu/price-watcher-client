package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vunguyen on 5/31/2015.
 */
public class DescriptionAdapter  extends ArrayAdapter<DescriptionAdapter.Desciption> {
    private Activity context = null;
    private int resource;
    private ArrayList<Desciption> arrayListDescription = null;
    public static class Desciption{
        public String property;
        public String val;
        public Desciption(String property,String val){
            this.property = property;
            this.val = val;
        }
    }
    public DescriptionAdapter(Activity context, int resource, ArrayList<Desciption> arrayListDescription) {
        super(context, resource, arrayListDescription);
        this.context = context;
        this.resource = resource;
        this.arrayListDescription = arrayListDescription;

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(this.resource , parent, false);

        if (arrayListDescription.size() > 0 && position >= 0) {
            final Desciption desciption = arrayListDescription.get(position);

            final TextView textViewProperty = (TextView)convertView.findViewById(R.id.textViewProperty);
            textViewProperty.setText(desciption.property);

            final  TextView textViewVal =  (TextView)convertView.findViewById(R.id.textViewVal);
            textViewVal.setText(desciption.val);

        }
        return convertView;
    }
}

