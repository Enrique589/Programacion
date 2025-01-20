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
public class Ejemplo2 {

    public static void main(String[] args) {
        int caracter = -1;
        char letra;

        try {
            FileReader fichero = new FileReader("datos.txt");

            do {
                caracter = fichero.read();
                letra = (char) caracter;
                System.out.print(letra);

            } while (caracter != -1);
            
            fichero.close();

        } catch (IOException e) {
            System.out.println("Error al crear" + e.getMessage());
        }
    }
}
