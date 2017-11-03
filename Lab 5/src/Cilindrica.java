/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Francisco Molina, carne 17050
 * @author Estefania Barrio, carne 17927
 * @version 02/11/2017
 */
public class Cilindrica extends Tanque {
    //variables de instancia
    double radio;
    /**
    * @param radio
    */
    public Cilindrica(double radio) {
        this.radio=radio;
    }
    /**
    * @param radio
    * @param altura
    */
    public double calcularVol(double radio, double altura) {
        double pi= Math.PI;
        double volumen=pi*radio*radio*altura;
        return volumen;
    }
    /**
    *@return
    */
    public double getRadio() {
        return radio;
    }    
}
