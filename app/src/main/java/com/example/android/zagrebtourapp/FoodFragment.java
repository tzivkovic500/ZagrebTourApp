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
public class FoodFragment extends Fragment {
    public FoodFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // // Create a list of  places to eat
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.zrno1, R.string.zrno_name, R.string.vegan1, getString(R.string.loc1),getString(R.string.web1)));
        tour.add(new Tour(R.drawable.green_point1, R.string.green_point, R.string.vegan2, getString(R.string.loc2),getString(R.string.web2)));
        tour.add(new Tour(R.drawable.nishta1, R.string.nishta, R.string.vegan3, getString(R.string.loc3),getString(R.string.web3)));
        tour.add(new Tour(R.drawable.vegehop1, R.string.vegehop, R.string.vegan4, getString(R.string.loc4),getString(R.string.web4)));
        tour.add(new Tour(R.drawable.vindol1, R.string.vinodol, R.string.mediterranean, getString(R.string.loc5),getString(R.string.web5)));
        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.category_food);
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









