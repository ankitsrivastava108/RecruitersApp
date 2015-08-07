package com.khoslalabs.recruiters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

/**
 * Created by ankitsrivastava on 07/08/15.
 */
public class ListOfRecruiters extends FragmentActivity {
    private  ViewPager viewPager;
    private int number_of_pages=1;
private RecruiterListFragmentStatePagerAdapter recruiterListFragmentStatePagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        viewPager= (ViewPager) findViewById(R.id.activity_viewpager);
        recruiterListFragmentStatePagerAdapter= new RecruiterListFragmentStatePagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(recruiterListFragmentStatePagerAdapter);
    }

    private  class RecruiterListFragmentStatePagerAdapter extends FragmentStatePagerAdapter{
        private RecruiterListFragmentStatePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if(i==0)
            {
                Log.d("hdfgds", "First Fragment called");
             return new First_Fragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return number_of_pages;
        }
    }

}
