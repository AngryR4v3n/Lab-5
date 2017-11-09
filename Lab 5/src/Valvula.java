/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Francisco Molina, carne 17050
 * @author Estefania Barrio, carne 17927
 * @version 08/11/2017
 */
public class Valvula {
    
    private boolean abierto;
    private String idValvula;
    private String municipio;
    private double volumen;
    /**
    * @param abierto
    * @param idValvula
    * @param municipio
    * @param volumen
    */
    public Valvula(boolean abierto, String idValvula, String municipio, double volumen){
        this.abierto=abierto;
        this.idValvula=idValvula;
        this.municipio=municipio;
        this.volumen=volumen;
    }
    /**
    * @return
    */
    public boolean getAbierto(){
        return abierto;
    }
    public void setAbierto(){
        abierto=true;
    }
    public void setCerrado(){
        abierto=false;
    }
    /**
    * @return
    */
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
