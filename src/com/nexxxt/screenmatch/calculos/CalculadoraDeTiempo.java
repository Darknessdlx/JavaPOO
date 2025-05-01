package com.nexxxt.screenmatch.calculos;

import com.nexxxt.screenmatch.modelos.Pelicula;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public void incluye(Pelicula pelicula) {
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
