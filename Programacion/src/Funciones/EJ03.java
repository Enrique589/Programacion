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
public class EJ03 {
    public static void main(String[]args){
        int[]vector = {6,2,0,75,42,18,6,82,42,24,12,27,128,255};
        
        vector = Ordena(vector);
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    public static int[] Ordena(int[]num){
        int aux;
        
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i]<num[j]){
                    aux = num[i];
                    num[i]=num[j];
                    num[j]=aux;
                }
            }
        }
        return num;
    }
}
