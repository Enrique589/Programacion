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
public class Moto {
    private int velocidad;
    
    Moto(){
        velocidad = 0;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public void acelera(int mas){
        this.velocidad += mas;
    }
    public void frena(int menos){
        this.velocidad -= menos;
    }
}
