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
public class EJ03 {
    public static void Masomenos(int adivina, int respuesta){
        if(adivina<respuesta){
            System.out.println("menor");
        }else{
            System.out.println("mayor");
        }
    }
    
    public static void main(String[] args){
        int A,B;
        A=(int)(Math.round(Math.random()*100));
        Scanner scan = new Scanner(System.in);
                    
        System.out.println("adivina el número");
        B = scan.nextInt();
        
        while (A!=B){
            /*if(B<A){
                System.out.println("mayor");
            }else{
                System.out.println("menor");
            }*/
            Masomenos(A,B);
            B = scan.nextInt();
        }
        System.out.println("enhorabuena, has adivinado el número!");
    }
}
