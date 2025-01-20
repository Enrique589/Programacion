/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoExamen;

/**
 *
 * @author user
 */
public class Temperatura {
    public static void main(String[]args){
        
    }
    public static double toCelsius(double far){
        return (far - 32)/1.8;
    }
    public  static double toFarenheit(double cel){
        return (cel*1.8) + 32;
    }
}
