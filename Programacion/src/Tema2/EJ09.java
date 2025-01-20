/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema2;

/**
 *
 * @author Marcos
 */
public class EJ09 {
    public static int Media(int[]lista){
    int suma=lista[0];
    int i;
        
    for(i=0;i<lista.length;i++){
        suma+=lista[i];
    }
    return suma/lista.length;
    }
    public static int Recuento(int[]lista,int valor){
        int cuenta=0;
        
        for(int i=0;i<lista.length;i++){
            if(lista[i]>valor){
                cuenta++;
            }
        }
        return cuenta;
    }

    public static void main(String[] args)
    {
        int[] alturas = {180, 175, 192, 155, 167};
        int[] edades = {18, 14, 20, 15, 28};
        
        System.out.println("La altura media es "+Media(alturas));
        System.out.println("La edad media es "+Media(edades));
        System.out.println("Hay "+Recuento(alturas,175)+" que miden más de 1'75m");
        System.out.println("Hay "+Recuento(edades,18)+" mayores de 18 años");
    }
}
