/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class EJ01 {
    public static double AFarenheit(double temp){
        return (1.8*temp)+32;
    }
    public static double ACelsius (double temp){
        return (temp -32)/1.8;
    }
    public static void main (String[]args){
        double temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce una temperatura Farenheit");
        temp = scan.nextDouble();
        System.out.println(ACelsius(temp)+"ºC");
        
        System.out.println("Introduce una temperatura Cesius");
        temp = scan.nextDouble();
        System.out.println(AFarenheit(temp)+" Farenheit");
    }
}
