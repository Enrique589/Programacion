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
public class Ejemplo3 {

    public static void main(String[] args) {

        String ruta = "ruta a un archivo.txt";

        try {
            FileReader fichero = new FileReader(ruta);
            BufferedReader buffer = new BufferedReader(fichero);
            String linea = buffer.readLine();
            
            while (linea != null) {
                System.out.println(linea);
                linea = buffer.readLine();
            }
            
            buffer.close();
            fichero.close();
        } catch (IOException e) {

        }
    }
}
