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
public class Valvula {
    
    private double radio;
    private boolean abierto;
    private String idValvula;
    private double profundidad;
    private String municipio;
    
    public Valvula(double radio, boolean abierto, String idValvula, double profundidad, String municipio){
        this.radio=radio;
        this.abierto=abierto;
        this.idValvula=idValvula;
        this.profundidad=profundidad;
        this.municipio=municipio;
    }
    /**
    * @return
    */
    public double getRadio(){
        return radio;
    }
    /**
    * @return
    */
    public boolean getAbierto(){
        return abierto;
    }
    /**
    * @return
    */
    public String getIdValvula(){
        return idValvula;
    }
    /**
    * @return
    */
    public double profundidad(){
        return profundidad;
    }
    /**
    * @return
    */
    public String getMunicipio(){
        return municipio;
    }
}
