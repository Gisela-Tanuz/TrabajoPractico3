package com.tanuz.trabajopracico3;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.tanuz.trabajopracico3.modelo.Pelicula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder>{
private ArrayList<Pelicula> lista;
private Context context;
private LayoutInflater layoutInflater;



    public PeliculaAdapter(ArrayList<Pelicula> lista, Context context, LayoutInflater layoutInflater) {
        this.lista = lista;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= layoutInflater.inflate(R.layout.item_pelicula,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
final Pelicula items = lista.get(position);

     holder.tvTitulo.setText(items.getTitulo());
     holder.ivFoto.setImageResource(items.getImagen());
     holder.tvDescrip.setText(items.getDescripcion());
      holder.btDetalles.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(context, DetallesActivity.class);
              intent.putExtra("tit",items.getTitulo());
              intent.putExtra("img", items.getImagen());
              intent.putExtra("desc", items.getDescripcion());
              intent.putExtra("act", items.getActores());
              intent.putExtra("dir", items.getDirector());


              context.startActivity(intent);

          }
      });

    }



    @Override
    public int getItemCount() {
        return lista.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTitulo, tvDescrip, tvActor,tvDirector;
        private ImageView ivFoto;
        private Button btDetalles;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            tvDescrip = itemView.findViewById(R.id.tvDescripcion);
            btDetalles = itemView.findViewById(R.id.btDetalles);
            tvActor = itemView.findViewById(R.id.tvActor);
            tvDirector= itemView.findViewById(R.id.tvDirector);


        }
    }
}
