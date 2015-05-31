package com.example.vunguyen.dahttt;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.EventLogTags;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vunguyen on 5/29/2015.
 */
public class DescriptionTabActivity extends Fragment {
    private static View mView;
    private ListView listViewDescription;
    private DescriptionAdapter descriptionAdapter = null;
    private ArrayList<DescriptionAdapter.Desciption> descriptionArrayList = null;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        mView = inflater.inflate(R.layout.activity_description, container, false);


        descriptionArrayList = new ArrayList<DescriptionAdapter.Desciption>();

        listViewDescription = (ListView)mView.findViewById(R.id.listViewDesciption);
        descriptionAdapter = new DescriptionAdapter(this.getActivity(), R.layout.desciption_item_layout, descriptionArrayList);
        listViewDescription.setAdapter(descriptionAdapter);
        descriptionArrayList.add(new DescriptionAdapter.Desciption("Hệ điều hành", "iOS"));
        descriptionArrayList.add(new DescriptionAdapter.Desciption("Hệ điều hành", "iOS"));
        descriptionArrayList.add(new DescriptionAdapter.Desciption("Hệ điều hành", "iOS"));
        descriptionArrayList.add(new DescriptionAdapter.Desciption("Hệ điều hành", "iOS"));

        descriptionAdapter.notifyDataSetChanged();

        return mView;

    }

}
