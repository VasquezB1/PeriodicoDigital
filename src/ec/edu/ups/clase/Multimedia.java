/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Byron
 */
public class Multimedia {
    private String formato;
    private double tamañoByte;
    private String path;
    private String nombreArchivo;
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    
    public void settamañoByte(double tamañoByte){
        this.tamañoByte = tamañoByte;
    }
    
    public void setpath(String path){
        this.path = path;
    }
    
    public void setnombreArchivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    public String getFormato(){
        return this.formato;       
    }
    
    public double gettamañoByte(){
        return this.tamañoByte;
    }
    
    public String getpath(){
        return this.path;
    }
    
    public String getnombreArchivo(){
        return this.nombreArchivo;
    }
}
