package com.comprasfacil.comprasfacil;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HistoricoComprasFragment extends Fragment {


    private long workoutId;
    private CharSequence mTitle;
    View myView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_historico_compras, container, false);

        return myView;
    }





}
