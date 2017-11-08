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
public class Ortogonal extends Tanque {
    //variables de instancia
    double apotema;
    double perimetro;
    /**
    * @param apotema
    */
    public Ortogonal (double altura, double porcentaje, String idTanque,double apotema,double perimetro) {
        super(altura, porcentaje, idTanque);
        this.volOr=((perimetro*apotema)/2)*altura;
        this.volumenDisp=volOr;
        this.apotema=apotema;
        this.perimetro=perimetro;
    }
}
