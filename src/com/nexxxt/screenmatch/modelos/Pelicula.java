package com.nexxxt.screenmatch.modelos;

public class Pelicula {

    public String nombre;

    public int fechaDeLanzamiento;

    public int duracionEnMinutos;

    boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

    public void muestraFichaTecnica(){
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion de la pelicula en minutos: " + duracionEnMinutos);

    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public void setSumaDeLasEvaluaciones(double sumaDeLasEvaluaciones) {
        this.sumaDeLasEvaluaciones = sumaDeLasEvaluaciones;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void setTotalDeLasEvaluaciones(int totalDeLasEvaluaciones) {
        this.totalDeLasEvaluaciones = totalDeLasEvaluaciones;
    }
}
