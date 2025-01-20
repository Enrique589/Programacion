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
public class EJ06 {

    public static void main(String[] args) {
        int counter;
        char letra;

        try {
            FileReader fichero = new FileReader("alumno.txt");

            do {
                counter = fichero.read();
                letra = (char) counter;

                System.out.print(letra);
            } while (counter != -1);

            fichero.close();

        } catch (IOException e) {
            System.out.println("Error de lectura " + e.getMessage());
        }
    }
}
