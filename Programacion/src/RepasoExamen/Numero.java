/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoExamen;

/**
 *
 * @author ENRIQUEPELAYOGARCÍA
 */
public class Numero {
    private int num;
    
    Numero (){
        this.num = 0;
    }
    Numero(int n){
        this.num = n;
    }
    public void anade(int mas){
        this.num += mas;
    }
    public void resta(int menos){
        this.num -= menos;
    }
    public int getValor(){
        return this.num;
    }
    public int getDoble(){
        return 2*this.num;
    }
    public int getTriple(){
        return 3*this.num;
    }
    public void setNumero(int n){
        this.num = n;
    }
    
}
