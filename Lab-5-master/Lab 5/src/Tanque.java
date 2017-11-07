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
import java.util.ArrayList;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Embedded;
@Entity
public abstract class Tanque {
    //@Embedded Valvula[] listaV;
    protected double altura;
    ArrayList<Valvula> valvulas = new ArrayList();
    protected double porcentaje;
    protected String idTanque;
    protected double volumenDisp;
    protected int index;
    protected String municipio;
    
    public Tanque(double altura, double porcentaje, String idTanque, double volumenDisp, int index){
        this.altura=altura;
        valvulas = new ArrayList<Valvula>();
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
        for(Valvula c: valvulas){
            if(c.getIdValvula().equals(val)){
                objTemp=c;
    }
        }
        return objTemp;
    }
    public double buscarValMuni(String muni){
        double suma=0;
        for(Valvula c: valvulas){
            if(c.getMunicipio().equals(muni)){
                suma=c.getVol()+suma;
            }
        }
        return suma;
    }
    public void crearValvula(boolean abierto,String idValvula,String municipio, double vol){
       Valvula x= new Valvula(abierto,idValvula,municipio,vol); 
       valvulas.add(x);
    }
    public void seteoCerrar(){
        for(Valvula x: valvulas){
            x.setCerrado();
        }
    }
    public double metrosCubicosTotales(int y){
        double sumatoria=0;
        for(Valvula c: valvulas){
            sumatoria=c.getVol()+sumatoria;
        }
        return sumatoria;
    }
    
}
