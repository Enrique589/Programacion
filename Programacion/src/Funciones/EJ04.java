/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import java. util.Scanner;
/**
 *
 * @author user
 */
public class EJ04 {
    public static void main(String[]args){
        int DNI;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce el numero del DNI");
        DNI = scan.nextInt();
        System.out.println(Letra(DNI));
        
    }
    public static char Letra(int num){
        char[] Letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return Letra[num%23];
    }
}
