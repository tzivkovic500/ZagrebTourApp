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
public class PlacesFragment extends Fragment {


    public PlacesFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places to visit
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.hnk, R.string.hnk, R.string.theater1, String.valueOf("https://goo.gl/maps/Ti8RSh8yt752"),String.valueOf("https://www.hnk.hr/hr/")));
        tour.add(new Tour(R.drawable.art, R.string.art, R.string.museum1, String.valueOf("https://goo.gl/maps/9TjJJrY6RyF2"),String.valueOf("http://www.umjetnicki-paviljon.hr")));
        tour.add(new Tour(R.drawable.mimara, R.string.mimara, R.string.museum2, String.valueOf("https://goo.gl/maps/LYrUx5RkApy"),String.valueOf("http://www.mimara.hr/")));
        tour.add(new Tour(R.drawable.arhiv, R.string.arhiv, R.string.arhiv1, String.valueOf("https://goo.gl/maps/4norjxjpY8Q2"),String.valueOf("http://www.arhiv.hr/hr-hr//")));
        tour.add(new Tour(R.drawable.garden, R.string.garden, R.string.garden1, String.valueOf("https://goo.gl/maps/mdivU6R6myB2"),String.valueOf("http://botanickivrt.biol.pmf.hr//")));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.category_places);

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




