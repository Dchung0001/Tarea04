package com.example.danielchung.tarea_recyleviewer_01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class cachorro_Adaptador extends RecyclerView.Adapter<cachorro_Adaptador.CachorroViewHolder>{

    ArrayList<Cachorro_Perfil> Cachorro;
    Activity activity;

    public cachorro_Adaptador(ArrayList<Cachorro_Perfil> Cachorro, Activity activity){
            this.Cachorro=Cachorro;
            this.activity=activity;
    }

    @Override
    public cachorro_Adaptador.CachorroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view__cachorros,parent,false);
        return new CachorroViewHolder(v);
    }

    @Override
    public void onBindViewHolder(cachorro_Adaptador.CachorroViewHolder holder, int position) {
        final Cachorro_Perfil CachorroP=Cachorro.get(position);
        holder.imgfoto.setImageResource(CachorroP.getImgFoto());
        holder.tvNomCachorro.setText(CachorroP.getStrNomCahorroNomCahorro());
        //holder.tvtEstrella.setText(CachorroP.getIntEstrella());

        holder.imgfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,CachorroP.getStrNomCahorroNomCahorro(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(activity,Detalle_Cachorros.class);
                intent.putExtra("FotoCachorro",CachorroP.getImgFoto());
                intent.putExtra("NomCachorro",CachorroP.getStrNomCahorroNomCahorro());
         //       intent.putExtra("Estrella",CachorroP.getIntEstrella());
                activity.startActivity(intent);
            }
        });

        holder.imgIco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste Like a:"+CachorroP.getStrNomCahorroNomCahorro(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return Cachorro.size() ;
    }

    public static class CachorroViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgfoto;
        private ImageView imgIco;
        private TextView tvNomCachorro;
        private TextView tvtEstrella;
        public CachorroViewHolder(View itemView) {
            super(itemView);

            imgfoto=(ImageView)itemView.findViewById(R.id.ImgFotoCV);
            tvNomCachorro=(TextView)itemView.findViewById(R.id.txtNomCachorroCV);
            imgIco=(ImageView)itemView.findViewById(R.id.ImgIcono);
            //tvtEstrella=(TextView)itemView.findViewById(R.id.txtEstrellaCV);
        }
    }
}
