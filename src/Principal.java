import com.nexxxt.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Crazy and Stupid Love";
        miPelicula.fechaDeLanzamiento = 2016;
        miPelicula.duracionEnMinutos = 180;

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(9);
        miPelicula.evalua(8);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
//        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());


    }
}
