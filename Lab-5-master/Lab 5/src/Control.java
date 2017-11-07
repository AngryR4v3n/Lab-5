
import java.util.ArrayList;

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
public class Control {
        //public Tanque listaTanque[];
        ArrayList<Tanque> tanque = new ArrayList();
        
    
    public Control(){
        //listaTanque=new Tanque[10];
        tanque=new ArrayList<Tanque>();
        
    }
    public void crearCubica(double altura, double porcentaje, String idTanque, double volumenDisp, int index){
        Cubica x= new Cubica(altura, porcentaje, idTanque, volumenDisp, index);
        tanque.add(x);
    }
    public void crearOrtogonal(double altura, double porcentaje, String idTanque, double volumenDisp, int index,double apotema,double perimetro){
        Ortogonal x= new Ortogonal(altura, porcentaje, idTanque, volumenDisp, index, apotema, perimetro);
        tanque.add(x);
    }
    public void crearCilindrica(double altura, double porcentaje, String idTanque, double volumenDisp, int index,double radio){
        Cilindrica x= new Cilindrica(altura, porcentaje, idTanque, volumenDisp, index,radio);
        tanque.add(x);
    
}
    
    public Tanque busqueda(String id){
        Tanque obj=null;
        for(Tanque c: tanque){
            if(c.getId().equals(id)){
                obj=c;
            }
        }
        
        return obj;
    }
    public double abrirVal(String id, String idV){
        double volActual=0;
            for(Tanque c: tanque){
                if(c.getId().equals(id)){
                   Valvula obj = c.buscarVal(idV);
                   obj.setAbierto();
                   volActual=c.getVolumen()-obj.getVol();
                }
            }
            return volActual;
        
    }
    public void cerrarVal(String id, String idV){
        for(Tanque c: tanque){
            if(c.getId().equals(id)){
                Valvula obj = c.buscarVal(idV);
                obj.setCerrado();
            }
        }
    }
    public double porcentajeTanque(double vol, Tanque obj){
        double porcentaje=(vol/obj.getVolumen())*100;
        return porcentaje;
    }
    public void setVolumen(double vol, Tanque obj){
        obj.setVolumen(vol);
    }
    public void crearValvula(String nombreT,boolean abierto,String idValvula, String municipio, double vol){
        this.busqueda(nombreT).crearValvula(abierto,idValvula,municipio,vol);
    }
    public boolean alerta(Tanque elTanque,double volumenRestante){
        boolean alerta1=false;
        if (elTanque.getVolumen()<=25){
            alerta1=true;
        }
        return alerta1;
    }
    public boolean alertaMax(Tanque elTanque,double volumenRestante){
        boolean alerta2=false;
        if (elTanque.getVolumen()<=10){
            alerta2=true;
        }
        return alerta2;
    }
    public void cerrado(String name){
        for(Tanque c: tanque){
            if(c.getId().equals(name)){
                c.seteoCerrar(); 
            }
        }
    }
    public double metrosRegion(String muni){
        double suma=0;
        for(Tanque c: tanque){
           suma=c.buscarValMuni(muni)+suma;
        }
        return suma;
    }
    public String printTodo(){
        String msj="";
        for(Tanque c: tanque){
            msj="Nombre: "+c.getId()+" Volumen: "+c.getVolumen()+" Galones "+"Municipio"+c.getMuni()+"\n";
        }
        return msj;
    }
}
        
            

    
