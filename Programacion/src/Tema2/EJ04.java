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
public class EJ04 {
    public static void main(String[]args){
        int suma=0,num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Suma números");
        do{
            num = scan.nextInt();
            suma = suma + num;
        }while(num!=0);
        
        System.out.println("La suma es "+suma);
    }
}
