//Introducir por teclado un valor numérico entero en un String y convertirlo en un Wrapper
package Tema5;

import java.util.Scanner;

/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena;
        
        cadena = Integer.toString(scan.nextInt());
        
        Integer a = Integer.parseInt(cadena);
    }
}
