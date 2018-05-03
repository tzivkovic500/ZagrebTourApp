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
public class EntertainmentFragment extends Fragment {
    public EntertainmentFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of entertainment places
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.alcatraz1, R.string.alcatraz, R.string.bar1, getString(R.string.loc21),getString(R.string.web21)));
        tour.add(new Tour(R.drawable.movie_pub1, R.string.movie, R.string.pub1, getString(R.string.loc22),getString(R.string.web22)));
        tour.add(new Tour(R.drawable.sokol1, R.string.sokol, R.string.club1, getString(R.string.loc23),getString(R.string.web23)));
        tour.add(new Tour(R.drawable.vintage1, R.string.vintage, R.string.pub2, getString(R.string.loc24),getString(R.string.web24)));
        tour.add(new Tour(R.drawable.punks1, R.string.punks, R.string.pub3, getString(R.string.loc25),getString(R.string.web25)));
        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.category_entertainment);
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



