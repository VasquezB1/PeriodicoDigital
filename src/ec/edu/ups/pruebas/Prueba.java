package ec.edu.ups.pruebas;

/**
 *
 * Las palabras reservadas import sirven para importar las clases declaradas
 * publicas de un paquete completo
 *
 */
import ec.edu.ups.clase.Estructura;
import ec.edu.ups.clase.Multimedia;
import ec.edu.ups.clase.Noticia;
import ec.edu.ups.clase.RedSocial;
import ec.edu.ups.clase.Seccion;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 *
 *
 * @author Byron
 */
public class Prueba {

    public static void main(String[] args) {
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
        System.out.println(facebook);

        int cod = facebook.getCodigo();
        System.out.println("Codigo: " + cod);
        String nom = facebook.getNombre();
        System.out.println("Nombre: " + nom);
        String url = facebook.getUrl();
        System.out.println("Url: " + url);
        //////////////////////////////////////////////////////////////////////////
        Noticia noticia = new Noticia();
        noticia.setTitulo("Avancez Informaticos");
        noticia.setAutor("Byron Vasquez");
        Date Date = null;
        noticia.setFecha(Date);
        noticia.setContenido("Crean relojes inteligentes para prevenir riesgos laborales");
        //noticia.setMultimedia(fecha);

        String tit = noticia.getTitulo();
        System.out.println("Titulo: " + tit);
        String aut = noticia.getAutor();
        System.out.println("Autor: " + aut);
        java.util.Date fecha2 = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(fecha2);
        System.out.println("Fecha : " + fechaFormateada);
        String conte = noticia.getContenido();
        System.out.println("Contenido: " + conte);
////////////////////////////////////////////////////////////////////////////////
        Multimedia multimedia = new Multimedia();
        multimedia.setnombreArchivo("Foto1");
        multimedia.setFormato(".png");
        multimedia.settamañoByte(12.36);
        multimedia.setpath("Libraries/Pictures/Fotos");

        String arch = multimedia.getnombreArchivo();
        System.out.println("NombreArchivo: " + arch);
        String form = multimedia.getFormato();
        System.out.println("Formato: " + form);
        double tama = multimedia.gettamañoByte();
        System.out.println("TamañoByte: " + tama + " mb");
        String pat = multimedia.getpath();
        System.out.println("Path: " + pat);
////////////////////////////////////////////////////////////////////////////////////
        Estructura estructura = new Estructura();
        estructura.setnombrePeriodico("Periodico El Comemercio");
        java.util.Date fecha4 = new Date();
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada2 = formato.format(fecha4);
        System.out.println("Fecha : " + fechaFormateada2);
        estructura.setUbicacion("Cuenca-Ecuador");
        estructura.setPortada(22);
        estructura.setEncabezado("Informando a Cuenca");
        //estructura.setSecciones(args);

        String per = estructura.getnombrePeriodico();
        System.out.println("Nombre Periodico: " + per);
        java.util.Date fecha5 = new Date();
        String fechaFormateada3 = formato.format(fecha5);
        System.out.println("Fecha : " + fechaFormateada3);
        String ubi = estructura.getUbicacion();
        System.out.println("Ubicacion: " + ubi);
        int port = estructura.getPortada();
        System.out.println("Numero de Portada: " + port);
        String enca = estructura.getEncabezado();
        System.out.println("Encabezado: " + enca);
/////////////////////////////////////////////////////////////////////////////////////
        java.util.Date fecha6 = new Date();
        Noticia noticia2 = new Noticia();
        noticia2.setTitulo("Señor detiene tranvia por pizza");
        noticia2.setAutor("Byron");
        String fechaFormateada4 = formato.format(fecha6);
        System.out.println("Fecha : " + fechaFormateada4);
        noticia2.setContenido("Señor detiene al tranvia por comprar pizza el ciudadno declaro si el espero al tranvia por 5 años porque el tranvia no lo espera 5 minutos");
        noticia2.setLugar("Cuenca");
        System.out.println(noticia2);
        
////////////////////////////////////////////////////////////////////////////////////        
       
        noticia.setTitulo("Avanzes en inteligencia artificial");
        noticia.setAutor("Peter P");
        GregorianCalendar fecha8 = new GregorianCalendar(2019, 1, 14);//El mes comienza desde el 0 siendo 0 Enero
        System.out.println("Calendario: "+ formato.format(fecha8.getTime()));
        noticia.setLugar("Internacional");
        noticia.setContenido("Hay nuevos desarrolos acerca de inteligencia artificial");
        System.out.println(noticia);
       
////////////////////////////////////////////////////////////////////////////////////////////////
        Seccion tecnologia = new Seccion();

    }
}
