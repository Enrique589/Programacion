/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author user
 */
public class Numero {
    private int numero;
    
    public Numero(){
        this.numero = 0;
    }
    public Numero(int valor){
        this.numero = valor;
    }
    public void Anade(int sum){
        this.numero += sum;
    }
    public void Resta(int res){
        this.numero -= res;
    }
    public int getValor(){
        return this.numero;
    }
    public int getDoble(){
        return (this.numero*2);
    }
    public int getTriple(){
        return (this.numero*3);
    }
    public void setNumero(int nuevo){
        this.numero = nuevo;
    }
}
