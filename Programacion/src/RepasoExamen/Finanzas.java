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
public class Finanzas {
    private double cambio;
    
    Finanzas(){
        cambio =1.36;
    }
    
    Finanzas(double a){
        cambio = a;
    }
    public double toEuros(double dolar){
        return dolar*this.cambio;
    }
    public double toDolar(double euro){
        return euro/this.cambio;
    }
}
