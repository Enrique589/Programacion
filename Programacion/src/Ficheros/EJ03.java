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
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        char letra;

        System.out.println("Nombre del fichero:");
        String nombre = scan.nextLine();

        try {
            FileReader fichero = new FileReader(nombre + ".txt");

            do {
                count = fichero.read();
                letra = (char) count;
                System.out.print(letra);

            } while (count != -1);

            fichero.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
