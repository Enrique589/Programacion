//Introducir por teclado un valor de tipo double y convertirlo en Wrapper
package Tema5;

import java.util.Scanner;

/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;

        numero = scan.nextDouble();

        Double num = new Double(numero);
    }
}
