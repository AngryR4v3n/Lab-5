/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molin
 */
public class Cubica extends Tanque {
    //variables de instancia
    double lado;
    /**
    * @param lado
    */
    public Cubica(double lado){
        this.lado=lado;
    }
    /**
    * @param lado
    * @return
    */
    public double calcularVol(double lado){
        double volumen=lado*lado*lado;
        return volumen;
    }
    /**
    * @return
    */
    public double getLado(){
        return lado;
    }    
}
