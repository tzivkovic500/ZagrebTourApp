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
        tour.add(new Tour(R.drawable.alcatraz, R.string.alcatraz, R.string.bar1, String.valueOf("https://goo.gl/maps/Ttm6uZQWBpC2"),String.valueOf("https://www.facebook.com/CaffeBarAlcatrazZagreb/")));
        tour.add(new Tour(R.drawable.movie_pub, R.string.movie, R.string.pub1, String.valueOf("https://goo.gl/maps/FwAVeMh7ZP42"),String.valueOf("https://www.facebook.com/themoviepub/")));
        tour.add(new Tour(R.drawable.sokol, R.string.sokol, R.string.club1, String.valueOf("https://goo.gl/maps/mh1SBg1fwrA2"),String.valueOf("https://www.facebook.com/SOKOL-KLUB-65185621696/")));
        tour.add(new Tour(R.drawable.vintage, R.string.vintage, R.string.pub2, String.valueOf("https://goo.gl/maps/Kfubj6RJsUt"),String.valueOf("https://www.facebook.com/vintageindbar/")));
        tour.add(new Tour(R.drawable.punks, R.string.punks, R.string.pub3, String.valueOf("https://goo.gl/maps/B92fbjTqiCH2"),String.valueOf("https://www.facebook.com/pubnakrajusvijeta/")));
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



