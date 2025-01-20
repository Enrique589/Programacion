/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;
import java.io.*;
/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ07 {
    public static void main(String[]args){
        String[] productos = {"Producto1","Producto2","Producto3","Producto4","Producto5","Otro producto",
            "Mas productos","Aun mas productos","aun quedan mas productos?","Ultimo producto"};
        
        try{
            FileWriter fichero = new FileWriter("productos.txt");
            
            for(int i = 0;i<productos.length;i++){
                fichero.write(productos[i]+"\n");
            }
            fichero.close();
        }catch(IOException e){
            System.out.println("Error de escritura"+e.getMessage());
        }
    }
}
