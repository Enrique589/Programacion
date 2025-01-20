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
public class EJ01 {
    
    public static void main(String[] args) {
        int Num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        Num = scan.nextInt();
        
        while (Num>0){
            System.out.println(Num*Num);
            Num = scan.nextInt();
        }
    }
    
}
