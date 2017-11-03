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
public class Tanque {
    
    protected double altura;
    protected Valvula[] listaV;
    protected double porcentaje;
    protected String idTanque;
    protected double volumenDisp;
    protected int index;
    
    public Tanque(int altura, double porcentaje, String idTanque, double volumenDisp, int index){
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
    public void crearValvula(int x){
        listaV[x]
        
    }
    
}
