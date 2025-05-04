package com.nexxxt.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificable clasificable){
        if (clasificable.getClasificable() >= 4) {
            System.out.println("Episodio muy bien valuado en el momento");
        } else if (clasificable.getClasificable() >= 2) {
            System.out.println("Episodio popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para ver despues");
        }
    }
}

