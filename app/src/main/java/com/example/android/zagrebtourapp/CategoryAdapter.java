package com.example.android.zagrebtourapp;
import android.support.v4.app.FragmentPagerAdapter;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;

/**
 * Created by Tea on 25.4.2018..
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, android.support.v4.app.FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    /**
     * Return the {@link android.support.v4.app.Fragment} that should be displayed for the given page number.
     */
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new PlacesFragment();
        } else if (position == 2) {
            return new ResideFragment();
        } else {
            return new EntertainmentFragment();
        }
    }



    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getString(R.string.category_places);
        } else if (position == 2) {
            return mContext.getString(R.string.category_reside);
        } else {
            return mContext.getString(R.string.category_entertainment);

        }
    }

}