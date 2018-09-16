package com.example.danielchung.tarea_recyleviewer_01;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton flbtnFavorito;
    private Toolbar mibarra1;
    ArrayList<Cachorro_Perfil> Cachorro;
    private RecyclerView lstCachorro;
    private FloatingActionButton flbCamara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mib1=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mib1);

        flbtnFavorito=(FloatingActionButton)findViewById(R.id.flbtnFavorito);

        flbtnFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ventana1=new Intent(MainActivity.this,Detalle_Cachorros.class);
                startActivity(Ventana1);
            }
        });

        lstCachorro=(RecyclerView)findViewById(R.id.RcCachorro);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        lstCachorro.setLayoutManager(llm);

        InicializarListaCachorro();
        InicialAdaptador();

        flbCamara=(FloatingActionButton)findViewById(R.id.flbCamara);

        flbCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Icono de Camara",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mn_tarea, menu);
        return super.onCreateOptionsMenu(menu);
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
        Cachorro.add(new Cachorro_Perfil(R.drawable.cachorro6,"Lana"));

    }
}
