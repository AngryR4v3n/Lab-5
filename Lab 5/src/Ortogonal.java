/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molin
 */
public class Ortogonal extends Tanque {
    //variables de instancia
    double apotema;
    /**
    * @param apotema
    */
    public Ortogonal (double apotema) {
        //super();
        this.apotema=apotema;
    }
    /**
    * @param x
    * @param y
    * @param perimetro
    */
    public double calcularVol(double x, double y, double perimetro){
    }    
    /**
    * @return
    */
    public double getApo(){
        return apotema;
    }
}
