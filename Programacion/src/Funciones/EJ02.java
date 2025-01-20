/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author user
 */
public class EJ02 {
    public static String[] Vehiculos(String[]vehiculos){        
        for(int i=0;i<vehiculos.length;i++){
            switch(vehiculos[i]){
                case"A":
                    vehiculos[i]="moto";
                    break;
                case"B":
                    vehiculos[i]="coche";
                    break;
                case"C":
                    vehiculos[i]="camion";
                    break;
                case"D":
                    vehiculos[i]="autobus";
                    break;
                case"E":
                    vehiculos[i]="trailer";
                    break;
                default:
                    vehiculos[i]="Valor erroneo";
            }
        }
        return vehiculos;
    }
    public static void main(String[]args){
        String[] carne = {"A","B","F"};
        
        carne = Vehiculos(carne);
        
        for(int i=0;i<carne.length;i++){
            System.out.println(carne[i]);
        }
    }
}
