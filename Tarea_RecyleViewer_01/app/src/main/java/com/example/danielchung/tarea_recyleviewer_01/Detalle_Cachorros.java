package com.example.danielchung.tarea_recyleviewer_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Detalle_Cachorros extends AppCompatActivity {

    ArrayList<Cachorro_Perfil> Cachorro;
    private RecyclerView lstCachorro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle__cachorros);

        Toolbar mib1=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mib1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lstCachorro=(RecyclerView)findViewById(R.id.RcData);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        lstCachorro.setLayoutManager(llm);

        InicializarListaCachorro();
        InicialAdaptador();

    }

    public void InicialAdaptador(){
        cachorro_Adaptador Adaptador=new cachorro_Adaptador(Cachorro,this);
        lstCachorro.setAdapter(Adaptador);
    }

    public void InicializarListaCachorro(){
        Cachorro =new ArrayList<Cachorro_Perfil>();

        Cachorro.add(new Cachorro_Perfil(R.drawable.cachorro1,"Kero"));
        Cachorro.add(new Cachorro_Perfil(R.drawable.cachorro2,"Rayo"));
        Cachorro.add(new Cachorro_Perfil(R.drawable.cachorro3,"Pulga"));
        Cachorro.add(new Cachorro_Perfil(R.drawable.cachorro4,"Toro"));
        Cachorro.add(new Cachorro_Perfil(R.drawable.cachorro5,"Algodon"));


    }
}
