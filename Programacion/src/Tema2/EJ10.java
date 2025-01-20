/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class EJ10 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Por favor introduzca un número entre 1 y 10");
            int n = scan.nextInt();
        
        while(n<0||n>10){
            System.out.println("Numero incorrecto, por favor introduzca un número entre 1 y 10");
            n = scan.nextInt();
        }
        
        for(int i=0;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
