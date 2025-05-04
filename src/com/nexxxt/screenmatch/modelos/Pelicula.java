package com.nexxxt.screenmatch.modelos;

import com.nexxxt.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificable() {
        return (int) (calculaMedia() / 2);
    }
}
