package com.example.vunguyen.dahttt;


import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vunguyen on 28/03/2015.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Description", "Comments" };
    private Context context;

    public TabsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Downlaod fragment activity
                return new DescriptionTabActivity();

            case 1:
                // Music fragment activity
                return new CommentTabActivity();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


}
