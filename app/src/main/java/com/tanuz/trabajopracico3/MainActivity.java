package com.tanuz.trabajopracico3;


import androidx.appcompat.app.AppCompatActivity;


import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import com.tanuz.trabajopracico3.modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView rv;

private PeliculaAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rcLista);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        rv.setLayoutManager(gridLayoutManager);

        adapter = new PeliculaAdapter(ObtenerPeliculas(), this ,getLayoutInflater());
        rv.setAdapter(adapter);


    }

    public ArrayList<Pelicula> ObtenerPeliculas(){
        ArrayList<Pelicula> lista = new ArrayList<>();
        lista.add(new Pelicula("El Principe de Zamunda", R.drawable.foto1,"Esta gran película de comedia que podéis ver en Netflix, trata sobre un rico heredero de un reino africano que viaja a Nueva York para buscar pareja, rebelándose contra la tradición del matrimonio concertado de su país. No os contamos si encontrará el amor verdadero, solo diremos que no podemos justificar que dejáramos a El príncipe de Zamunda fuera de nuestro especial de cine de los 80.","Eddie Murphy,Arsenio Hall,Shari Headley","Jhon Landis"));
        lista.add(new Pelicula("Megamente",R.drawable.foto2,"A pesar de que él es el supervillano más brillante que ha tenido el mundo, Megamente es el menos exitoso. Frustrado una y otra vez por el heroico Metro Man, Megamente se sorprende cuando logra superar a un enemigo de tanto tiempo. pero sin Metro Man, Megamente no tiene ningún propósito en la vida, por lo que crea a un nuevo oponente, quien rápidamente decide que es más divertido ser el malo que el héroe.","Will Ferrell(Megamente),Brad Pitt(Metro Man),David Cross(Minion)","Tom McGrath"));
        lista.add(new Pelicula("El Lado Bueno de las cosas",R.drawable.foto3,"cuenta cómo Pat regresa a casa de sus padres, tras haber pasado ocho meses internado en un manicomio debido a que atacó al amante de su exmujer. En un intento de recuperar a su antigua pareja, Pat conocerá Tiffany, una mujer con problemas bastante gordos con la que sin embargo aprenderá a ver \"el lado bueno de las cosas\"... Así que si queréis pasar un rato viendo a este espectacular elenco tenéis una cita con esta comedia disponible en Netflix.","Jennifer Lawrence,Bradley Cooper,Robert De Niro","David O. Russell"));
        lista.add(new Pelicula("Iron Man",R.drawable.foto4,"Un empresario millonario construye un traje blindado y lo usa para combatir el crimen y el terrorismo.","Robert Downey Jr.,Jon Favreau, Gwyneth Paltrow","Jon Favreau"));
        lista.add(new Pelicula("El secreto de sus ojos",R.drawable.foto5,"Un juez tiene dudas acerca de los planes de un oficial de justicia recientemente retirado que intenta descubrir al culpable de la violación y el asesinato de una joven, crimen ocurrido varias décadas atrás.","Ricardo Darín,Soledad Villamil,Guillermo Francella"," Juan José Campanella"));
        lista.add(new Pelicula("Tomorrowland",R.drawable.foto6,"Casey investiga el pin que encuentra una niña para trasladarse a otro lugar en tiempo y espacio y conoce a un genio que ha perdido la esperanza.","Britt Robertson,Raffey Cassidy,George Clooney","Brad Bird"));



        return lista;
    }




}

