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
public class Cubica extends Tanque {
    //variables de instancia
    /**
    * @param lado
    */
    public Cubica(double altura, double porcentaje, String idTanque){
        super(altura, porcentaje, idTanque);
        this.volOr=altura*altura*altura;
        this.volumenDisp=volOr;
    }
    public Cubica(){}
}
