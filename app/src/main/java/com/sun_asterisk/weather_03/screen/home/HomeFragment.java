package com.sun_asterisk.weather_03.screen.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sun_asterisk.weather_03.R;

public class HomeFragment extends Fragment {
    private TextView mNamePlace;
    private TextView mDay;
    private TextView mTemperature;
    private TextView mTemperatureDetail;
    private TextView mVelocityDetail;
    private TextView mHumidityDetail;
    private TextView mCloudDetail;
    private RecyclerView mRecyclerViewHour;
    private RecyclerView mRecyclerViewDaily;
    private CardView mCardViewTemperature;
    private ImageView mImageweather;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        mNamePlace = view.findViewById(R.id.textLocal);
        mDay = view.findViewById(R.id.textDay);
        mTemperature = view.findViewById(R.id.textTempNow);
        mTemperatureDetail = view.findViewById(R.id.textTempDetail);
        mVelocityDetail = view.findViewById(R.id.textWindDetail);
        mHumidityDetail = view.findViewById(R.id.textHumidityDetail);
        mCloudDetail = view.findViewById(R.id.textCloudDetail);
        mRecyclerViewHour = view.findViewById(R.id.recyclerviewHour);
        mRecyclerViewDaily = view.findViewById(R.id.recyclerviewDaily);
        mCardViewTemperature = view.findViewById(R.id.cardViewTemperature);
        mImageweather = view.findViewById(R.id.imageTemperature);
    }
}
