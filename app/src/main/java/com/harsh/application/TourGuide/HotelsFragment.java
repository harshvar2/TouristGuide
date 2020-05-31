package com.harsh.application.TourGuide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Citydata> Hotels = new ArrayList<>();
        Hotels.add(new Citydata(getResources().getString(R.string.hotels_name1), getString(R.string.hotels_details1),R.drawable.radison));
        Hotels.add(new Citydata(getResources().getString(R.string.hotels_name2), getString(R.string.hotels_details2),R.drawable.radison));

        CitydataAdapter dataAdapter = new CitydataAdapter(getActivity(), Hotels);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(dataAdapter);

        return rootView;

    }
}
