package ec.edu.ups.pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ec.edu.ups.clase.Estructura;
import ec.edu.ups.clase.Multimedia;
import ec.edu.ups.clase.Noticia;
import ec.edu.ups.clase.RedSocial;
import ec.edu.ups.clase.Seccion;
import java.util.Date;

/**
 *
 * @author Byron
 */
public class Prueba {
    
        public static void main(String[] args){
           RedSocial facebook = new RedSocial();
           facebook.setCodigo(1);
           facebook.setNombre("Parra Asqueroso Asqueroso");
           facebook.setUrl("www.facebook.com");  
           
           int cod = facebook.getCodigo();
            System.out.println("Codigo: "+cod);
           String nom = facebook.getNombre();
            System.out.println("Nombre: "+nom);
           String url = facebook.getUrl();
            System.out.println("Url: "+url);
 //////////////////////////////////////////////////////////////////////////
            Noticia noticia = new Noticia();
            noticia.setTitulo("Avancez Informaticos");
            noticia.setAutor("Byron Vasquez");
            Date Date = null;
            noticia.setFecha(Date);
            noticia.setContenido("Crean relojes inteligentes para prevenir riesgos laborales");
            //noticia.setMultimedia(fecha);
            
            String tit = noticia.getTitulo();
                System.out.println("Titulo: "+tit);
            String aut = noticia.getAutor();
                System.out.println("Autor: "+aut);
            Date fec = noticia.getFecha();
                java.util.Date fecha = new Date();
                System.out.println ("Fecha: "+fecha);
            String conte = noticia.getContenido();
                System.out.println("Contenido: "+conte);
////////////////////////////////////////////////////////////////////////////////
            Multimedia multimedia = new Multimedia();
            multimedia.setnombreArchivo("Foto1");
            multimedia.setFormato(".png");
            multimedia.settamañoByte(12.36);
            multimedia.setpath("Libraries/Pictures/Fotos");
           
            String arch = multimedia.getnombreArchivo();
            System.out.println("NombreArchivo: "+ arch);
            String form = multimedia.getFormato();
            System.out.println("Formato: "+ form);
            double tama = multimedia.gettamañoByte();
            System.out.println("TamañoByte: "+ tama+" mb");
            String pat = multimedia.getpath();
            System.out.println("Path: "+ pat);
////////////////////////////////////////////////////////////////////////////////////
            Estructura estructura = new Estructura();
            estructura.setnombrePeriodico("Periodico El Comemercio");
            estructura.setFecha(Date);
            estructura.setUbicacion("Cuenca-Ecuador");
            estructura.setPortada(22);
            estructura.setEncabezado("Informando a Cuenca");
            //estructura.setSecciones(args);
            
            String per = estructura.getnombrePeriodico();
            System.out.println("Nombre Periodico: "+ per);
            java.util.Date fecha1 = new Date();
            System.out.println ("Fecha: "+fecha1);
            String ubi = estructura.getUbicacion();
            System.out.println("Ubicacion: "+ubi);
            int port = estructura.getPortada();
            System.out.println("Numero de Portada: "+port);
            String enca = estructura.getEncabezado();
            System.out.println("Encabezado: "+enca);
/////////////////////////////////////////////////////////////////////////////////////
            Seccion seccion = new Seccion();
            seccion.setNombreSeccion("Tecnologia");
            //seccion.setNoticia(args);
            
            String secci = seccion.getNombreSeccion();
            System.out.println("Nombre de Seccion: "+secci);
            
            
        }    
}