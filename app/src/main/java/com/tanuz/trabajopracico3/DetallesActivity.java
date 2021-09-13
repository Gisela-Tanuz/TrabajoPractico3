package com.tanuz.trabajopracico3;



import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.tanuz.trabajopracico3.modelo.Pelicula;

import java.util.ArrayList;


public class DetallesActivity extends AppCompatActivity {

    private TextView titulo, descripcion,actor,director;
    private ImageView foto;
    private Pelicula items;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        setTitle(getClass().getSimpleName());


        inicializarVista();
        inicializar();




    }

private void inicializarVista(){
        titulo= findViewById(R.id.tvTitulo);
        foto= findViewById(R.id.ivFoto);
        descripcion = findViewById(R.id.tvDescripcion);
        actor = findViewById(R.id.tvActor);
        director = findViewById(R.id.tvDirector);

}
   private void inicializar() {


       //String valor = getIntent().getExtras().getString("usuario");
     String  tit= getIntent().getStringExtra("tit");
     titulo.setText(tit);
       int img = getIntent().getIntExtra("img",0);
       foto.setImageResource(img);
       String desc = getIntent().getStringExtra("desc");
       descripcion.setText(desc);
       String act = getIntent().getStringExtra("act");
       actor.setText(act);
       String dir = getIntent().getStringExtra("dir");
       director.setText(dir);





   }



}