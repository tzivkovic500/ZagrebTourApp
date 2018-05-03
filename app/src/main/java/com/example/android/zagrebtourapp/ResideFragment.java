package com.example.android.zagrebtourapp;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 */
public class ResideFragment extends Fragment {
    public ResideFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of places to reside
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.westin1, R.string.westin_reside, R.string.hotel1, getString(R.string.loc31),getString(R.string.web31)));
        tour.add(new Tour(R.drawable.dubrovnik1, R.string.dubrovnik, R.string.hotel2, getString(R.string.loc32),getString(R.string.web32)));
        tour.add(new Tour(R.drawable.esplanada1, R.string.esplanada, R.string.hotel3, getString(R.string.loc33),getString(R.string.web33)));
        tour.add(new Tour(R.drawable.sheraton1, R.string.sheraton, R.string.hotel4, getString(R.string.loc34),getString(R.string.web34)));
        tour.add(new Tour(R.drawable.gardenh1, R.string.gardenh, R.string.hotel5, getString(R.string.loc35),getString(R.string.web35)));
        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.category_reside);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}




