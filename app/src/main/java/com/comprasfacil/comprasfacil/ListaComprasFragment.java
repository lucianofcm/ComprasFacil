package com.comprasfacil.comprasfacil;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.internal.widget.DialogTitle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class ListaComprasFragment extends Fragment {
    private long workoutId;
    private CharSequence mTitle;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_lista_compras, container, false);

        return myView;
    }

}
