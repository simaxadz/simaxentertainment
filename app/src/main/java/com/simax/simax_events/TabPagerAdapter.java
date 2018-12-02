package com.simax.simax_events;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.simax.simax_events.fragments.EventsFragment;
import com.simax.simax_events.fragments.HomeFragment;
import com.simax.simax_events.fragments.PlacesFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new EventsFragment();
            case 2:
                return new PlacesFragment();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return tabCount;
    }
}
