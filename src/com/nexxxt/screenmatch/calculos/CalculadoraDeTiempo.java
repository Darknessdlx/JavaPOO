package com.nexxxt.screenmatch.calculos;

import com.nexxxt.screenmatch.modelos.Pelicula;
import com.nexxxt.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }


    public void incluye(Titulo titulo) {
        System.out.println("Agregando duracion en minutos de: " + titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}