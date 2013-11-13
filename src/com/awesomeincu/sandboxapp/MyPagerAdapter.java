package com.awesomeincu.sandboxapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.awesomeincu.sandboxapp.tabs.FirstFragment;
import com.awesomeincu.sandboxapp.tabs.SecondFragment;
import com.awesomeincu.sandboxapp.tabs.ThirdFragment;

public class MyPagerAdapter extends FragmentPagerAdapter {
	 
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            return new FirstFragment();
        case 1:
            return new SecondFragment();
        case 2:
            return new ThirdFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}