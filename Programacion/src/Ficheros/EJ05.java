/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author enriq
 */
public class EJ05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un nuevo alumno:");
        String alumno = scan.nextLine();

        try {
            FileWriter fichero = new FileWriter("alumno.txt", true);

            fichero.write(alumno);

            fichero.close();

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
