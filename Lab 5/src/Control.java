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
        public Tanque listaTanque[];
    
    public Control(){
        listaTanque=new Tanque[10];
        
    }
    public void crearCubica(double altura, double porcentaje, String idTanque, double volumenDisp, int index){
        listaTanque[index]= new Cubica(altura, porcentaje, idTanque, volumenDisp, index);
    }
    public void crearOrtogonal(double altura, double porcentaje, String idTanque, double volumenDisp, int index,double apotema,double perimetro){
        listaTanque[index]= new Ortogonal(altura, porcentaje, idTanque, volumenDisp, index, apotema, perimetro);
    }
    public void crearCilindrica(double altura, double porcentaje, String idTanque, double volumenDisp, int index,double radio){
        listaTanque[index]= new Cilindrica(altura, porcentaje, idTanque, volumenDisp, index,radio);
    
}
    
    public Tanque busqueda(String id){
        Tanque obj=null;
            for(int x=0; x<=10;x++){
                if(listaTanque[x].getId().equals(id)){
                    obj=listaTanque[x];
                
                }
            }
        return obj;
    }
    public double abrirVal(String id, String idV){
        double volActual=0;
            for(int x=0; x<=10;x++){
                if(listaTanque[x].getId().equals(id)){
                   Valvula obj = listaTanque[x].buscarVal(idV);
                   obj.setAbierto();
                   volActual=listaTanque[x].getVolumen()-obj.getVol();
                }
            }
            return volActual;
        
    }
    public void cerrarVal(String id, String idV){
        for(int x=0; x<=10;x++){
            if(listaTanque[x].getId().equals(id)){
                Valvula obj = listaTanque[x].buscarVal(idV);
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
    public boolean alerta(double vol){
        boolean report=false;
        if(vol<=25){
            report=true;
        }
        return report;
    }
    public void crearValvula(String nombreT,int index,boolean abierto,String idValvula, String municipio, double vol){
        this.busqueda(nombreT).crearValvula(index,abierto,idValvula,municipio,vol);
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
        public double metrosRegion(String muni){
            double suma=0;
            for(int x=0;x<=10;x++){
             suma=listaTanque[x].buscarValMuni(muni)+suma;
            }
            return suma;
        }
        
            
        }

    
