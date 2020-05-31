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
public class ExploreFragment extends Fragment {

    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Citydata> arrayList = new ArrayList<>();
        arrayList.add(new Citydata(getResources().getString(R.string.e_place_1), getResources().getString(R.string.explore1)));
        arrayList.add(new Citydata(getResources().getString(R.string.e_place_2), getResources().getString(R.string.explore2)));

        CitydataAdapter dataAdapter = new CitydataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(dataAdapter);

        return rootView;


    }
    }
