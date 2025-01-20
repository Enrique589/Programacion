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
public class Ejemplo1 {

    public static void main(String[] args) {
        try {
            FileWriter fichero = new FileWriter("datos.txt", true);
            fichero.write("hola mundo \n");
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error al crear" + e.getMessage());
        }
    }
}