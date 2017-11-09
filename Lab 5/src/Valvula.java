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
    
    private boolean abierto;
    private String idValvula;
    private String municipio;
    private double volumen;
    
    public Valvula(boolean abierto, String idValvula, String municipio, double volumen){
        this.abierto=abierto;
        this.idValvula=idValvula;
        this.municipio=municipio;
        this.volumen=volumen;
    }
    public Valvula(){}
    public boolean getAbierto(){
        return abierto;
    }
    public void setAbierto(){
        abierto=true;
    }
    public void setCerrado(){
        abierto=false;
    }
    
    public double getVol(){
        return volumen;
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
    public String getMunicipio(){
        return municipio;
    }
}
