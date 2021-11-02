package com.example.ejrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //REFERENCIA DE RECYCLER
        recycler= findViewById(R.id.recyclerId);

        //DETERMINAR LAYOUT DEL RECYCLER
            //EJEMPLO LISTA
        //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            //EJEMPLO GRID
        recycler.setLayoutManager(new GridLayoutManager(this, 2)); //Número de columnas

        //LLENAR LISTA EJEMPLO
        listDatos= new ArrayList<String>();
        for (int i = 0; i<=50; i++){
            listDatos.add("Dato #" + i + " ");
        }

        //RELACIONAR CON ADAPTADOR
        AdapterDatos adapter = new AdapterDatos(listDatos); //ENVIAR LISTA AL ADAPTADOR
        recycler.setAdapter(adapter);
    }
}