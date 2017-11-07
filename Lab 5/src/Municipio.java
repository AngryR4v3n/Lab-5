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
public class Municipio {
    public String nombre;
    public int numHabitante;
    
    public Municipio(String nombre, int numHabitante){
        this.nombre=nombre;
        this.numHabitante=numHabitante;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getNum(){
        return numHabitante;
    }
    
}
