/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.*;

/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ11 {

    public static void main(String[] args) {
        int caracter;
        char letra;
        String palabra = "";
        int contador = 0;

        try {
            FileReader fichero = new FileReader("Fichero.txt");

            do {
                caracter = fichero.read();
                letra = (char) caracter;

                if (caracter != ' ') {
                    palabra += letra;
                } else {
                    if (palabra.contains("hola")) {
                        contador++;
                    }
                    palabra = "";
                }

            } while (caracter != -1);

            System.out.println(contador);
            fichero.close();

        } catch (IOException error) {
            System.out.println("Error de Fichero" + error.getMessage());
        }

    }
}
