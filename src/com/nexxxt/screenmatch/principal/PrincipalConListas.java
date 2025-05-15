package com.nexxxt.screenmatch.principal;

import com.nexxxt.screenmatch.modelos.Pelicula;
import com.nexxxt.screenmatch.modelos.Serie;
import com.nexxxt.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Crazy and Stupid Love", 2016);
        miPelicula.evalua(8);
        Pelicula otraPelicula = new Pelicula("Matrix", 1999);
        otraPelicula.evalua(9);
        Pelicula miPelicula2 = new Pelicula("Harry Potter y la piedra filosofal", 2000);
        miPelicula2.evalua(10);
        Serie miSerie = new Serie("Mr Robot", 2012);
        miSerie.evalua(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(miPelicula2);
        lista.add(otraPelicula);
        lista.add(miSerie);

        for (Titulo item : lista) {
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificable() > 2) {
                System.out.println("Clasificacion: " +pelicula.getClasificable());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelopa Cruz");
        listaDeArtistas.add("Antonio Balderas");
        listaDeArtistas.add("Ricadro Darin");
        
        Collections.sort(listaDeArtistas);
        System.out.println("listaDeArtistas = " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista = " + lista);

    }
}
