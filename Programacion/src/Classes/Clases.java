/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Clases {
    public static void main(String[]args){
        Personaje p1 = new Personaje();
        Personaje slime = new Personaje();
        Scanner scan = new Scanner(System.in);
        
        slime.NuevosStats(5, 3, 5, "Slime");
        
        System.out.println("Nombra a tu personaje");
        p1.setName(scan.nextLine());
        p1.ShowStats();
        
        System.out.println();
        System.out.println(slime.getName()+" salvaje apareció");
        slime.ShowStats();
        
        while(p1.getVida()>0 && slime.getVida()>0){
            System.out.println();
            System.out.println(p1.getName()+" ataca");
            System.out.println(p1.getName()+" causa "+(p1.getFuerza()-slime.getDefensa())+" daño");
            slime.Daño(p1.getFuerza()-slime.getDefensa());
            slime.ShowStats();
            
            if(slime.getVida()<=0){
                break;
            }
            
            System.out.println();
            System.out.println(slime.getName()+" ataca");
            System.out.println(slime.getName()+" causa "+(slime.getFuerza()-p1.getDefensa())+" daño");
            p1.Daño(slime.getFuerza()-p1.getDefensa());
            p1.ShowStats();
        }
        System.out.println();
        System.out.println(slime.getName()+" ha sido derrotado");
        System.out.println();
        System.out.println(p1.getName()+" ha ganado 5 Xp");
        System.out.println(p1.getName()+" usa pocion de curacion");
        p1.Heal(3);
        System.out.println(p1.getName()+" ha recuperado 3 HP");
        System.out.println();
        p1.ShowStats();
    }
}
