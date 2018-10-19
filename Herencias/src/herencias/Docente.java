/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author TOSHIBA
 */
public class Docente extends Persona{
    
    private double sueldo1;
    
  public Docente(String n, String a, int e, double suel){
        super(n, a, e);
        setSueldo(suel);
    }
    
    @Override
    public void setNombre(String n){
        nombre= n.toUpperCase();    
    }
    
    public void setSueldo(double sueldo){
        sueldo1 = sueldo;
    }
    
    public double getSueldo(){
        return sueldo1;
    }
    
    /* @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    */
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
