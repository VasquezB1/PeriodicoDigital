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
 */
public class Estructura {
    private String nombrePeriodico;
    private Date fecha;
    private String ubicacion;
    private int portada;
    private String encabezado;
    private String[] secciones;
    
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
     
     public void setSecciones(String[] secciones){
         this.secciones = secciones;
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
     
     public String[] getSecciones(){
         return this.secciones;
        }
   
}
