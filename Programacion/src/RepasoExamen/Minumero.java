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
public class Minumero {
    private int numero;
    
    Minumero  (int num){
        numero = num;
    }
    public int Doble(){
        return this.numero * 2;
    }
    public int Triple(){
        return this.numero * 3;
    }
    public int Cuadruple(){
        return this.numero * 4;
    }
    
    public static void main(String[]args){
        Minumero num = new Minumero(5);
        
        System.out.println(num.Doble());
        System.out.println(num.Triple());
        System.out.println(num.Cuadruple());
    }
}
