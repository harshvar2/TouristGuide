package com.harsh.application.TourGuide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class CitydataAdapter extends ArrayAdapter<Citydata> {

  public  CitydataAdapter(Context context, ArrayList<Citydata> arrayAdapter) {
        super(context, 0, arrayAdapter);
    }

    @Override
    @NonNull
    public View getView(int position, View convertVIew, ViewGroup parent) {
        View listView = convertVIew;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.data_list, parent, false);
        }
        Citydata currentdata = getItem(position);


        TextView textView_name = listView.findViewById(R.id.cityname);
        textView_name.setText(currentdata.getPlaceName());

        TextView textView_detail = listView.findViewById(R.id.citydetails);
        textView_detail.setText(currentdata.getPlaceDetails());

        ImageView imageView = listView.findViewById(R.id.imageId);
        if (currentdata.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentdata.placeImageID());
        } else {
            imageView.setVisibility(View.GONE);

        }

        return listView;
    }
}