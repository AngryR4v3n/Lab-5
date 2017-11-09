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
    protected double volOr;
    /**
    * @param altura
    * @param porcentaje
    * @param idTanque
    */
    public Tanque(double altura, double porcentaje, String idTanque){
        this.altura=altura;
        valvulas = new ArrayList<Valvula>();
        this.porcentaje= porcentaje;
        this.idTanque=idTanque;
        this.volumenDisp=volumenDisp;
        this.volOr=volOr;
    }
    /**
    * @return
    */
    public double getAltura(){
        return altura;
    }
    /**
    * @param volumen
    */
    public void setVolumen(double volume){
        this.volOr=volume;
    }
    /**
    * @return
    */
    public double getVolumen(){
        return volumenDisp;
    }
    /**
    * @return
    */
    public String getId(){
        return idTanque;
    }
    /**
    * @param por
    */
    public void setPorcentaje(double por){
        this.porcentaje=por;
    }
    /**
    * @param val
    * @return
    */
    public Valvula buscarVal(String val){
        Valvula objTemp=null;
        for(Valvula c: valvulas){
            if(c.getIdValvula().equals(val)){
                objTemp=c;
    }
        }
        return objTemp;
    }
    /**
    * @param muni
    * @return
    */
    public double buscarValMuni(String muni){
        double suma=0;
        for(Valvula c: valvulas){
            if(c.getMunicipio().equals(muni)){
                suma=c.getVol()+suma;
            }
        }
        return suma;
    }
    /**
    * @param abierto
    * @param idValvula
    * @param municipio
    * @param vol
    */
    public void crearValvula(boolean abierto,String idValvula,String municipio, double vol){
       Valvula x= new Valvula(abierto,idValvula,municipio,vol); 
       valvulas.add(x);
    }
    public void seteoCerrar(){
        for(Valvula x: valvulas){
            x.setCerrado();
        }
    }
    /**
    * @param x
    */
    public void quitarVol(double x){
        this.volumenDisp=this.volOr-x;
    }
    /**
    * @param y
    * @return
    */
    public double metrosCubicosTotales(int y){
        double sumatoria=0;
        for(Valvula c: valvulas){
            sumatoria=c.getVol()+sumatoria;
        }
        return sumatoria;
    }
    /**
    * @return
    */
    public String printTodo(){
        String msj="";
        for(Valvula c: valvulas){
            msj="Nombre: "+c.getIdValvula()+" Volumen: "+c.getVol()+" Galones/h "+"Estado: "+c.getAbierto()+"\n";
        }
        return msj;
    }
    
}
