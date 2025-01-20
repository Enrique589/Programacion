/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoExamen;

import java.util.Scanner;

/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class Navidad {

    public static int copa(int num) {
        int i;
        for (i = 0; i <= num; i += 2) {
            espacio(num - i / 2);
            hojas(i);
            System.out.println();
        }
        return i / 2;
    }

    public static void hojas(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print("*");
        }
    }

    public static void espacio(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(" ");
        }
    }

    public static void tronco(int num, int ancho) {
        for (int i = 0; i < num; i++) {
            espacio(ancho - 2);
            System.out.println("||||");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alto, ancho;

        System.out.println("Elige el ancho del arbol:");
        ancho = scan.nextInt();
        System.out.println("Elige la altura del arbol:");
        alto = scan.nextInt();

        tronco(alto - copa(ancho), ancho);
    }
}
