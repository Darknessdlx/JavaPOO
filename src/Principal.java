import com.nexxxt.screenmatch.calculos.CalculadoraDeTiempo;
import com.nexxxt.screenmatch.calculos.FiltroRecomendacion;
import com.nexxxt.screenmatch.modelos.Episodio;
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

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(138);
        otraPelicula.setIncluidoEnElPlan(true);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye( miPelicula);
        calculadora.incluye(miPelicula);
        calculadora.incluye(otraPelicula);
        System.out.println(STR."Tiempo necesario para ver tus titulos estas vacaciones: \{calculadora.getTiempoTotal()} minutos");

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Codigo binario");
        episodio.setSerie(miSerie);
        episodio.setTotalVisualizaciones(50);
        System.out.println("*************************************");
        filtro.filtra(episodio);
    }



}
