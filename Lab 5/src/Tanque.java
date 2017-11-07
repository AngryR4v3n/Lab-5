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
import org.mongodb.morphia.annotations.Embedded;
@Entity
public abstract class Tanque {
    @Embedded Valvula[] listaV;
    protected double altura;
    //protected Valvula[] listaV;
    protected double porcentaje;
    protected String idTanque;
    protected double volumenDisp;
    protected int index;
    protected String municipio;
    
    public Tanque(double altura, double porcentaje, String idTanque, double volumenDisp, int index){
        this.altura=altura;
        listaV = new Valvula[10];
        this.porcentaje= porcentaje;
        this.idTanque=idTanque;
        this.volumenDisp=volumenDisp;
        this.index=index;
    }
    public abstract double calcularVol(double x, double y, double z);
    public double getAltura(){
        return altura;
    }
    public void setVolumen(double volume){
        this.volumenDisp=volume;
    }
    public double getVolumen(){
        return volumenDisp;
    }
    public String getId(){
        return idTanque;
    }
    public String getMuni(){
        return municipio;
    }
    public Valvula buscarVal(String val){
        Valvula objTemp=null;
        for(int x=0; x<=10;x++){
            if(listaV[x].getIdValvula().equals(val)){
                objTemp=listaV[x];
    }
        }
        return objTemp;
    }
    public double buscarValMuni(String muni){
        double suma=0;
        for(int x=0; x<=10; x++){
            if(listaV[x].getMunicipio().equals(muni)){
                suma=listaV[x].getVol()+suma;
            }
        }
        return suma;
    }
    public void crearValvula(int x,boolean abierto,String idValvula,String municipio, double vol){
        listaV[x]= new Valvula(abierto,idValvula,municipio,vol);    
    }
    public double metrosCubicosTotales(int y){
        double sumatoria=0;
        for(int x=0; x<=y;x++){
            sumatoria=listaV[x].getVol()+sumatoria;
        }
        return sumatoria;
    } 
    
}
