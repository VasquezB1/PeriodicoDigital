/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import java.util.Date;

/**
 *
 * @author Byron
 * Estructura Periodico
 * Esta estructura nos sirve para declarar las variables 
 * que se va a obtener y dar en nuestra interfaz teniendo 
 *           tipo de clas Date,string,string[].
 */
public class Estructura {
    private String nombrePeriodico;
    private Date fecha;
    private String ubicacion;
    private int portada;
    private String encabezado;
    private Seccion secciones[];
    private String[] redSocial;

    @Override
    public String toString() {
        return "Estructura{" + "nombrePeriodico=" + nombrePeriodico + ", fecha=" + fecha + ", ubicacion=" + ubicacion + ", portada=" + portada + ", encabezado=" + encabezado + ", secciones=" + secciones + ", redSocial=" + redSocial + '}';
    }
    
    
    /**
     * 
     * @param nombrePeriodico 
     * 
     */
     public void setnombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
        }
     
     public void setFecha(Date fecha){
         this.fecha = fecha;
        }
     
     public void setUbicacion(String ubicacion){
         this.ubicacion = ubicacion;
        }
     
     public void setPortada(int portada){
         this.portada = portada;
        }
     
     public void setEncabezado(String encabezado){
         this.encabezado = encabezado;
        }
     
     public void setSecciones(Seccion[] secciones){
         this.secciones = secciones;
        }
     
     public void setRedSocial(String [] redSocial){
         this.redSocial = redSocial;
     }
     
     public String[] getredSocial( ){
         return this.redSocial;
     }
          
     public String getnombrePeriodico( ){
        return this.nombrePeriodico;
        }
     
     public Date getFecha(){
         return this.fecha;
         }
     
     public String getUbicacion(){
         return this.ubicacion;
        }
     
     public int getPortada(){
         return this.portada;
        }
     
     public String getEncabezado(){
         return this.encabezado;
        }
     
     public Seccion[] getSecciones(){
         return this.secciones;
        }
   
}
