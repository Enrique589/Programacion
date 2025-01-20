/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema2;

/**
 *
 * @author user
 */
public class EJ08 {
    public static boolean Impar(int A){
        return A%2!=0;
    }
    public static void main(String[]args){
        int num=0,con=10,total=1;
        
        do{
            if(Impar(num)){
                con--;
                total*=num;
                //System.out.println("contador "+con+" numero "+num+" total "+total);
            }
            num++;
        }while(con>0);
        
        System.out.println(total);
    }
}
