package es.fplumara.dam.ad.p02;

import es.fplumara.dam.ad.p02.Principal;

import java.io.IOException;

import es.fplumara.dam.ad.p02.Principal.*;

import static es.fplumara.dam.ad.p02.Principal.*;


public class Main {
    public static void main(String[] args){

        // Paso 2
        System.out.println();
        comprobar(DESCARGAS);
        comprobar(DESCARGAS.resolve("leeme.txt"));


        try {
            // Paso 3
            System.out.println();
            listar(DESCARGAS);

            //Paso 4
            System.out.println();
            mostrarAtributos(DESCARGAS.resolve("astrofaro_2026-03-14_2215.png"));
            mostrarAtributos(DESCARGAS.resolve("pixelhuerto_2026-05-02_1030.png"));
            mostrarAtributos(DESCARGAS.resolve("viejas"));

            //Paso 5
            System.out.println();
            organizar();

            //Paso 6
            System.out.println();
            moverAPapelera();

            //Paso 7
            System.out.println();
            recorrer(DESCARGAS);

            //Paso 8
            System.out.println();
            borrar();
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e);
        }
    }
}
