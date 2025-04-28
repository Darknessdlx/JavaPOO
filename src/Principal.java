public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Crazy and Stupid Love";
        miPelicula.fechaDeLanzamiento = 2016;
        miPelicula.duracionEnMinutos = 180;

        miPelicula.evalua(9);
        miPelicula.evalua(8);

        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        miPelicula.muestraFichaTecnica();

        System.out.println("miPelicula.sumaDeLasEvaluaciones = " + miPelicula.sumaDeLasEvaluaciones);
    }
}
