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
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);


        final ArrayList<Citydata> Data=new ArrayList<>();
        Data.add(new Citydata(getString(R.string.delhi_place_1), getResources().getString(R.string.delhi_detail_1),R.drawable.ladhakj));
        Data.add(new Citydata(getString(R.string.delhi_place_2), getResources().getString(R.string.delhi_detail_2),R.drawable.radison));

        CitydataAdapter adapter=new CitydataAdapter(getActivity(),Data);

        ListView listView=rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
