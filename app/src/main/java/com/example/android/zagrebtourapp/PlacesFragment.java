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
        tour.add(new Tour(R.drawable.hnk1, R.string.hnk, R.string.theater1, getString(R.string.loc11),getString(R.string.web11)));
        tour.add(new Tour(R.drawable.art1, R.string.art, R.string.museum1, getString(R.string.loc12),getString(R.string.web12)));
        tour.add(new Tour(R.drawable.mimara1, R.string.mimara, R.string.museum2, getString(R.string.loc13),getString(R.string.web13)));
        tour.add(new Tour(R.drawable.arhiv1, R.string.arhiv, R.string.arhiv1, getString(R.string.loc14),getString(R.string.web14)));
        tour.add(new Tour(R.drawable.garden1, R.string.garden, R.string.garden1, getString(R.string.loc15),getString(R.string.web15)));
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




