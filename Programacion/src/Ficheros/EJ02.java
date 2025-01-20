/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author enriq
 */
public class EJ02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre del archivo:");
        String name = scan.nextLine();

        System.out.println("Contenido del fichero:");
        String contenido = scan.nextLine();

        try {
            FileWriter fichero = new FileWriter(name + ".txt");
            char[] cadena = contenido.toCharArray();

            for (int i = 0; i < cadena.length; i++) {
                fichero.write(cadena[i]);
            }
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error con el fichero");
        }

    }
}
