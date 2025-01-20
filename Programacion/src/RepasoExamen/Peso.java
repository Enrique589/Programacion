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
public class Peso {
    private double peso;
    private String unidad;
    
    Peso(double _peso, String _medida){
        this.unidad = _medida;
        
        switch(_medida){
            case "K":
                this.peso = _peso;
                break;
                
            case "Lb":
                this.peso = _peso/2.207;
                break;
                
            case "Li":
                this.peso = _peso*14.59;
                break;
                
            case "Oz":
                this.peso = _peso/35.273;
                break;
            
            case "P":
                this.peso = _peso/645.161;
                break;
                
            case "g":
                this.peso = _peso/1000;
                break;
                
            case "Q":
                this.peso = _peso*43.3;
                break;
            
            default:
                System.out.println("Introduzca una medida válida");
        }
    }
    public double getLibras(){
        return this.peso*2.207;
    }
    public double getLingotes(){
        return this.peso/14.59;
    }
    public double getPeso(String _medida){
        switch(_medida){
            case "K":
                return this.peso;
                
            case "Lb":
                return this.peso*2.207;
                
            case "Li":
                return this.peso/14.59;
                
            case "Oz":
                return this.peso*35.273;
            
            case "P":
                return this.peso*645.161;
                
            case "g":
                return this.peso*1000;
                
            case "Q":
                return this.peso/43.3;
            
            default:
                System.out.println("Introduzca una medida válida");
        }
        return 0;
    }
}
