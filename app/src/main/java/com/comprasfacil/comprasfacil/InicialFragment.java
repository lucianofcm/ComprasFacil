package com.comprasfacil.comprasfacil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class InicialFragment extends Fragment {
    private long workoutId;
    private CharSequence mTitle;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_main, container, false);

        return myView;
    }

}
