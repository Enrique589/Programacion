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
public class EJ05 {
    public static void main(String[]args){
        int suma=0,con=-1,num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce numeros para la media");
        do{
            num = scan.nextInt();
            suma = suma + num;
            con++;
        }while(num>0);
        
        System.out.println("La media es "+(suma/con));
    }
}
