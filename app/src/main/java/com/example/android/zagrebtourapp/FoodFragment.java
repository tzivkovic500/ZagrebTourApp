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

        tour.add(new Tour(R.drawable.zrno, R.string.zrno_name, R.string.vegan1, String.valueOf("https://goo.gl/maps/T6qK8TKWUf42"),String.valueOf("http://www.zrnobiobistro.hr/")));
        tour.add(new Tour(R.drawable.green_point, R.string.green_point, R.string.vegan2, String.valueOf("https://goo.gl/maps/di3cGBLPLGC2"),String.valueOf("http://green-point.hr/hr/")));
        tour.add(new Tour(R.drawable.nishta, R.string.nishta, R.string.vegan3, String.valueOf("https://goo.gl/maps/YztTwqeURxK2"),String.valueOf("https://www.jutarnji.hr/dobrahrana/price/restoran-nishta-kreativno-vegetarijanstvo-kojem-treba-malo-nove-energije/5392267/")));
        tour.add(new Tour(R.drawable.vegehop, R.string.vegehop, R.string.vegan4, String.valueOf("https://goo.gl/maps/f6RUVbz5DHu"),String.valueOf("https://vegehop.hr/")));
        tour.add(new Tour(R.drawable.vindol, R.string.vinodol, R.string.mediterranean, String.valueOf("https://goo.gl/maps/nGNEqtt87qM2"),String.valueOf("http://www.vinodol-zg.hr/")));

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









