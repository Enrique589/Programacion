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
public class EJ08 {

    public static void main(String[] args) {
        int count;
        char letra;

        try {
            FileReader fichero = new FileReader("productos.txt");

            do {
                count = fichero.read();
                letra = (char) count;
                System.out.println(letra);
            } while (count != -1);
            
            fichero.close();
            
        } catch (IOException e) {
            System.out.println("Error de lectura" + e.getMessage());
        }
    }
}
