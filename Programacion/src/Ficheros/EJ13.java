/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class EJ13 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int count;
        char letra;
        
        System.out.println("Introduce el nombre del archivo a copiar:");
        String archivo = scan.nextLine();
        
        System.out.println("Escribe el nuevo nombre del archivo:");
        String nuevo = scan.nextLine();
        
        try{
            FileWriter escritor = new FileWriter(nuevo, true);
            FileReader lector = new FileReader(archivo);
            
            do{
                count = lector.read();
                letra = (char) count;
                escritor.write(letra);
            }while(count != -1);

            escritor.close();
            lector.close();
            
        }catch(IOException error){
            System.out.println("Error "+error.getMessage());
        }
    }
}
