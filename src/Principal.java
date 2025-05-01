import com.nexxxt.screenmatch.calculos.CalculadoraDeTiempo;
import com.nexxxt.screenmatch.modelos.Pelicula;
import com.nexxxt.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Crazy and Stupid Love");
        miPelicula.setFechaDeLanzamiento(2016);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9);
        miPelicula.evalua(8);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        System.out.println("************************");

        Serie miSerie = new Serie();

        miSerie.setNombre("Mr Robot");
        miSerie.setFechaDeLanzamiento(2012);
        miSerie.setIncluidoEnElPlan(true);
        miSerie.muestraFichaTecnica();
        miSerie.evalua(9);
        miSerie.evalua(8);
        miSerie.evalua(9);
        miSerie.setMinutosPorEpisodio(52);
        miSerie.setEpisodiosPorTemporada(12);
        miSerie.setTemporadas(3);
        System.out.println(miSerie.getTotalDeLasEvaluaciones());
        System.out.println(miSerie.calculaMedia());
        System.out.println(miSerie.getDuracionEnMinutos());

        System.out.println("************************");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye( miPelicula);
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());

    }
}
