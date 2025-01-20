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
public class EJ02 {
    public static void main(String []args){
        int con=0, num=1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce números");
        while(num>0){
            num = scan.nextInt();
            con++;
        }
        System.out.println(con+" números introducidos");
    }
}
