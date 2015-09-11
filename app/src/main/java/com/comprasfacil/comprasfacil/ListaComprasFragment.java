package com.comprasfacil.comprasfacil;

import android.app.Activity;
import android.app.AlertDialog;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.internal.widget.DialogTitle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class ListaComprasFragment extends Fragment {

    View myView;
    ListView mDrawerListView;
    private ArrayAdapter arrayAdapter;
    private String[] monthsArray = { "COMPRA 1", "COMPRA 2", "COMPRA 3", "COMPRA 4", "COMPRA 5", "COMPRA6", "COMPRA7",
            "COMPRA 8", "COMPRA 9", "COMPRA 10", "COMPRA 11", "COMPRA 12" };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //mDrawerListView = (ListView) inflater.inflate(R.layout.fragment_lista_compras, container, false);
        myView = inflater.inflate(R.layout.fragment_lista_compras, container, false);

        mDrawerListView = (ListView)myView.findViewById(R.id.lvListaCompras);
        arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_expandable_list_item_1, monthsArray);
        mDrawerListView.setAdapter(arrayAdapter);


       mDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              Toast.makeText(getContext(),"Clique na posicao"+position, Toast.LENGTH_SHORT).show();
           }
       });


        return mDrawerListView;

        //myView = inflater.inflate(R.layout.fragment_lista_compras, container, false);

        //return myView;




}


    public void clicaItemLista(View view,int position,long id){

       System.out.println("Lista pressionada "+position+" "+ id);

            }


}