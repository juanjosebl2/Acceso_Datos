/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lye_xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jdk.internal.org.xml.sax.InputSource;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Juan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        

         
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         //SAXBuilder builder = new SAXBuilder()
         //Document document = factory.parse(new InputSource(new FileInputStream("/ruta_a_fichero/fichero.xml"))); 
         String fich = "C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\xml.xml";
         File xmlFile = new File( fich );
         //Document document = (Document) factory.build( xmlFile );
         Document document = null;
         try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            document = implementation.createDocument(null, "xml", null);

            //Creación de elementos
            //creamos el elemento principal casa
            Element casa = document.createElement("Casa"); 
            //creamos un nuevo elemento. Casa contiene habitaciones
            Element habitacion= document.createElement("Habitacion");
            //creamos un nuevo elemento. Habitación tiene color
            Element color = document.createElement("Color"); 
            //Ingresamos la info. El color de esta habitación es azul
            Text valorColor = document.createTextNode("Azul"); 

            //Asignamos la versión de nuestro XML
            document.setXmlVersion("1.0"); 
            //Añadimos la casa al documento
            document.getDocumentElement().appendChild(casa); 
            //Añadimos el elemento hijo a la raíz
            casa.appendChild(habitacion); 
            //Añadimos elemento
            habitacion.appendChild(color); 
            //Añadimos valor
            color.appendChild(valorColor); 
            
            guardarConFormato guarda = new guardarConFormato();
            guarda.guardaConFormato(document,fich);
         }catch(Exception e){
             System.err.println("Error");
         }
    }
        
}
