//Introducir por teclado un valor númerico en un String y convertirlo en entero.
package Tema5;

import java.util.Scanner;

/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena = scan.nextLine();

        Integer num = new Integer(cadena);
    }
}
