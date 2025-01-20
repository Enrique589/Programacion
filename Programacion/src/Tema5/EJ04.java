/*Introducir por teclado dos valores numéricos enteros y la operación que 
*queremos realizar(suma, resta o multiplicación).
*Realizar la operación y mostrar el resutado en Binario, Hexadecimal y Octal
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int num1, num2, resultado = 0;
        String operacion;
        
        System.out.print("Introduce el primer numero: ");
        num1 = scan.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = scan.nextInt();
        System.out.print("Elige la operacion a realizar(suma, resta, multiplicacion o division):");
        operacion = scan2.nextLine();
        
        System.out.println();
        
        switch (operacion){
            case "suma":
                resultado = num1+num2;
                break;
            case "resta":
                resultado = num1-num2;
                break;
            case "multiplicacion":
                resultado = num1*num2;
                break;
            default:
                System.out.println("Operacion incorrecta");
        }
        System.out.println("En binario es: "+Integer.toBinaryString(resultado));
        System.out.println("En hexadecimal es: "+Integer.toHexString(resultado));
        System.out.println("En octal es: "+Integer.toOctalString(resultado));
    }
}
