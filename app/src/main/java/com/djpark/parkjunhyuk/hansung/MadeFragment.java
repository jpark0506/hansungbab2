package com.djpark.parkjunhyuk.hansung;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ParkJunHyuk on 2016. 6. 6..
 */
public class MadeFragment extends Fragment{
    TextView information, informations, lisence;
    public MadeFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "font.otf");
        View v = inflater.inflate(com.djpark.parkjunhyuk.hansung.R.layout.fragment_made,container,false);
        information = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.information);
        informations = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.informations);
        lisence = (TextView)v.findViewById(com.djpark.parkjunhyuk.hansung.R.id.license);
        information.setTypeface(typeface);
        informations.setTypeface(typeface);
        lisence.setTypeface(typeface);

        return v;
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
