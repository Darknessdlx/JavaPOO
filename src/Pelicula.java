public class Pelicula {
    String nombre;

    int fechaDeLanzamiento;

    int duracionEnMinutos;

    boolean incluidoEnElPlan;

    double sumaDeLasEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion de la pelicula en minutos: " + duracionEnMinutos);

    }

    void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
    }
}
