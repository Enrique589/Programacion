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
public class Personaje {
    private int vida;
    private int defensa;
    private int fuerza;
    private String nombre;
    
    public Personaje(){
        this.vida = 10;
        this.defensa = 3;
        this.fuerza = 5;
        this.nombre = " ";
    }
    public void ShowStats(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Vida: "+this.vida);
        System.out.println("Fuerza: "+this.fuerza);
        System.out.println("Defensa: "+this.defensa);
    }
    public void NuevosStats(int hp, int def, int atq, String name){
        this.vida = hp;
        this.defensa = def;
        this.fuerza = atq;
        this.nombre = name;
    }
    public int getFuerza(){
        return this.fuerza;
    }
    public int getDefensa(){
        return this.defensa;
    }
    public int getVida(){
        return this.vida;
    }
    public String getName(){
        return this.nombre;
    }
    public void Daño(int daño){
        this.vida-=daño;
    }
    public void Heal(int cura){
        this.vida += cura;
    }
    public void setName (String nuevo){
        this.nombre = nuevo;
    }
}
