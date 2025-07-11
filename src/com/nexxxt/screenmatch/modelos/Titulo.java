package com.nexxxt.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import com.nexxxt.screenmatch.exception.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;

    private boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;
    private int duracionEnMinutos;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nombre = tituloOmdb.Title();
        this.fechaDeLanzamiento = Integer. valueOf(tituloOmdb.Year());
        if (tituloOmdb.Runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(
                tituloOmdb.Runtime().substring(0, 3).replace(" ", "")
        );
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println(STR."Nombre de la pelicula: \{nombre}");
        System.out.println(STR."Fecha de lanzamiento: \{fechaDeLanzamiento}");
        System.out.println(STR."Duracion de la pelicula en minutos: \{getDuracionEnMinutos()}");

    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre='" + nombre +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento+
                ", duracion en minutos=" + duracionEnMinutos + ")";
    }
}
