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
    public Cilindrica(double altura, double porcentaje, String idTanque,double radio) {
        super(altura, porcentaje, idTanque);
        this.radio=radio;
        this.volOr=3.14*altura*radio*radio;
        this.volumenDisp=volOr;
    }
 
}
