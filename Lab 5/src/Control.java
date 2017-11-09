
import java.util.ArrayList;
import java.util.List;
import org.mongodb.morphia.query.Query;


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
    public void crearCubica(double altura, double porcentaje, String idTanque){
        Connection con = new Connection();
        Cubica x= new Cubica(altura, porcentaje, idTanque);
        tanque.add(x);
        con.ds.save(tanque);
    }
    public void crearOrtogonal(double altura, double porcentaje, String idTanque,double apotema,double perimetro){
        Connection con = new Connection();
        Ortogonal x= new Ortogonal(altura,porcentaje,idTanque,apotema,perimetro);
        tanque.add(x);
        con.ds.save(tanque);
    }
    public void crearCilindrica(double altura, double porcentaje, String idTanque,double radio){
        Connection con = new Connection();
        Cilindrica x= new Cilindrica(altura, porcentaje, idTanque,radio);
        tanque.add(x);
        con.ds.save(tanque);
    
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
        if (this.porcentajeTanque(volumenRestante, elTanque)<=25){
            alerta1=true;
        }
        return alerta1;
    }
    public boolean alertaMax(Tanque elTanque,double volumenRestante){
        boolean alerta2=false;
        if (this.porcentajeTanque(volumenRestante, elTanque)<=10){
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
            msj="Nombre: "+c.getId()+" Volumen: "+c.getVolumen()+" Galones "+"Disponible: "+"\n";
        }
        return msj;
    }
    
    public void obtenerLista(){
        Connection con = new Connection();
        
        Query<Cubica> query = con.ds.createQuery(Cubica.class);
        Query<Ortogonal> queryO = con.ds.createQuery(Ortogonal.class);
        Query<Cilindrica> queryC = con.ds.createQuery(Cilindrica.class);
        List<Cubica> cubos = query.asList();
        List<Ortogonal> octogono = queryO.asList();
        List<Cilindrica> cil = queryC.asList();
        for(Cubica tanquesCubicos: cubos){
            tanque.add(tanquesCubicos);
        }
        for(Ortogonal tanqueO: octogono){
            tanque.add(tanqueO);
        }
        for(Cilindrica tanqueC: cil){
            tanque.add(tanqueC);
        }
        
        
        
        
    }
}
        
            

    
