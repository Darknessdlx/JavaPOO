package com.nexxxt.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nexxxt.screenmatch.exception.ErrorEnConversionDeDuracionException;
import com.nexxxt.screenmatch.modelos.Titulo;
import com.nexxxt.screenmatch.modelos.TituloOmdb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Ingrese el nombre de la pelicula: ");
            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            String direccion = "http://www.omdbapi.com/?t=" +
                    busqueda.replace(" ", "+") +
                    "&apikey=ff2c506";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(tituloOmdb);

                Titulo mititulo = new Titulo(tituloOmdb);
                System.out.println("Titulo ya convertido: " + mititulo);

                titulos.add(mititulo);

            } catch (NumberFormatException e) {
                System.out.println("No se pudo crear el titulo");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URI, verifique la direccion");
                System.out.println(e.getMessage());
            } catch (ErrorEnConversionDeDuracionException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(titulos);

            FileWriter escritura = new FileWriter("titulos.json");
            escritura.write(gson.toJson(titulos));
            escritura.close();

            System.out.println("Finalizo la ejecucion del programa ");

        }
    }
}
