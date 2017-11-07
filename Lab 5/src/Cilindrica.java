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
import org.mongodb.morphia.annotations.Entity;
@Entity
public class Cilindrica extends Tanque {
    //variables de instancia
    double radio;
    /**
    * @param radio
    */
    public Cilindrica(double altura, double porcentaje, String idTanque, double volumenDisp, int index,double radio) {
        super(altura, porcentaje, idTanque, volumenDisp, index);
        this.radio=radio;
    }
    /**
    * @param radio
    * @param altura
    */
    public double calcularVol(double radio, double altura, double x) {
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
