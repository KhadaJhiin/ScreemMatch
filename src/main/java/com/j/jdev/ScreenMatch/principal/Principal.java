package com.j.jdev.ScreenMatch.principal;

import com.j.jdev.ScreenMatch.modelo.DatosSerie;
import com.j.jdev.ScreenMatch.modelo.DatosTemporada;
import com.j.jdev.ScreenMatch.service.ConsumoAPI;
import com.j.jdev.ScreenMatch.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner((System.in));
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=be3a2d77";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu(){
        System.out.println("""
                Por favor escribe el nombre de la serie que deseas buscar.
               
                """);
        var nombreSerie = teclado.nextLine();
        String json = consumoApi.obtenerDatos( URL_BASE + nombreSerie.replace(" ","+") + API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);


        List<DatosTemporada> listaTemporadas = new ArrayList<>();
        for (int i = 1; i <= datos.totalDeTemporadas(); i++) {
            json = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ","+") + "&Season=" + i + API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json,DatosTemporada.class);
            listaTemporadas.add(datosTemporadas);
        }
        listaTemporadas.forEach(System.out::println);
    }
}
