
import java.util.ArrayList;

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
public class Control {
        //public Tanque listaTanque[];
        ArrayList<Tanque> tanque = new ArrayList();
        
    
    public Control(){
        //listaTanque=new Tanque[10];
        tanque=new ArrayList<Tanque>();
        
    }
    /**
    * @param altura
    * @param porcentaje
    * @param idTanque
    */
    public void crearCubica(double altura, double porcentaje, String idTanque){
        Cubica x= new Cubica(altura, porcentaje, idTanque);
        tanque.add(x);
    }
    /**
    * @param altura
    * @param porcentaje
    * @param idTanque
    * @param apotema
    * @param perimetro
    */
    public void crearOrtogonal(double altura, double porcentaje, String idTanque,double apotema,double perimetro){
        Ortogonal x= new Ortogonal(altura,porcentaje,idTanque,apotema,perimetro);
        tanque.add(x);
    }
    /**
    * @param altura
    * @param porcentaje
    * @param idTanque
    * @param radio
    */
    public void crearCilindrica(double altura, double porcentaje, String idTanque,double radio){
        Cilindrica x= new Cilindrica(altura, porcentaje, idTanque,radio);
        tanque.add(x);
    
}
    /**
    * @param id
    * @return
    */
    public Tanque busqueda(String id){
        Tanque obj=null;
        for(Tanque c: tanque){
            if(c.getId().equals(id)){
                obj=c;
            }
        }
        
        return obj;
    }
    /**
    * @param id
    * @param idV
    * @param horas
    * @return
    */
    public double abrirVal(String id, String idV, double horas){
        double volActual=0;
            for(Tanque c: tanque){
                if(c.getId().equals(id)){
                   Valvula obj = c.buscarVal(idV);
                   obj.setAbierto();
                   volActual=c.getVolumen()-(obj.getVol()*horas);
                }
            }
            return volActual;
        
    }
    /**
    * @param id
    * @param idV
    */
    public void cerrarVal(String id, String idV){
        for(Tanque c: tanque){
            if(c.getId().equals(id)){
                Valvula obj = c.buscarVal(idV);
                obj.setCerrado();
            }
        }
    }
    /**
    * @param vol
    * @param obj
    * @return
    */
    public double porcentajeTanque(double vol, Tanque obj){
        double porcentaje=(vol/obj.getVolumen())*100;
        return porcentaje;
    }
    /**
    * @param vol
    * @param obj
    */
    public void setVolumen(double vol, Tanque obj){
        obj.setVolumen(vol);
    }
    /**
    * @param nombreT
    * @param abierto
    * @param idValvula
    * @param municipio
    * @param vol
    */
    public void crearValvula(String nombreT,boolean abierto,String idValvula, String municipio, double vol){
        this.busqueda(nombreT).crearValvula(abierto,idValvula,municipio,vol);
    }
    /**
    * @param elTanque
    * @param volumenRestante
    * @return
    */
    public boolean alerta(Tanque elTanque,double volumenRestante){
        boolean alerta1=false;
        if (this.porcentajeTanque(volumenRestante, elTanque)<=25){
            alerta1=true;
        }
        return alerta1;
    }
    /**
    * @param elTanque
    * @param volumenRestante
    * @return
    */
    public boolean alertaMax(Tanque elTanque,double volumenRestante){
        boolean alerta2=false;
        if (this.porcentajeTanque(volumenRestante, elTanque)<=10){
            alerta2=true;
        }
        return alerta2;
    }
    /**
    * @param name
    */
    public void cerrado(String name){
        for(Tanque c: tanque){
            if(c.getId().equals(name)){
                c.seteoCerrar(); 
            }
        }
    }
    /**
    * @param muni
    * @return
    */
    public double metrosRegion(String muni){
        double suma=0;
        for(Tanque c: tanque){
           suma=c.buscarValMuni(muni)+suma;
        }
        return suma;
    }
    /**
    * @return
    */
    public String printTodo(){
        String msj="";
        for(Tanque c: tanque){
            msj="Nombre: "+c.getId()+" Volumen: "+c.getVolumen()+" Galones "+"Disponible: "+"\n";
        }
        return msj;
    }
}
        
            

    
