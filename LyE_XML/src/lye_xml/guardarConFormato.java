/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lye_xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 *
 * @author Juan
 */
public class guardarConFormato {
 
    
    public static void guardaConFormato(Document document, String URI){
        try {
            TransformerFactory transFact = TransformerFactory.newInstance();

            //Formateamos el fichero. Añadimos sangrado y la cabecera de XML
            transFact.setAttribute("indent-number", new Integer(3));
            Transformer trans = transFact.newTransformer();
            trans.setOutputProperty(OutputKeys.INDENT, "yes");
            trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");

            //Hacemos la transformación
            StringWriter sw = new StringWriter();
            StreamResult sr = new StreamResult(sw);
            DOMSource domSource = new DOMSource(document);
            trans.transform(domSource, sr);

            //Mostrar información a guardar por consola (opcional)
            //Result console= new StreamResult(System.out);
            //trans.transform(domSource, console);
            try {
                //Creamos fichero para escribir en modo texto
                PrintWriter writer = new PrintWriter(new FileWriter(URI));

                //Escribimos todo el árbol en el fichero
                writer.println(sw.toString());

                //Cerramos el fichero
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void AnadirCaracteristica(Document document, String URI) throws org.xml.sax.SAXException{
        try {
            //Obtenemos el document del fichero XML existente
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            document = db.parse(new File(URI));
            document.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Creamos un nuevo elemento en la casa
        Element terraza = document.createElement("Terraza");
        //Le añadimos una característica
        Element tamano = document.createElement("Tamano");
        //Le añadimos su valor
        Text valor = document.createTextNode("20m2");

        //Añadimos la información a la casa ya existente
        NodeList nodoRaiz = document.getDocumentElement().getElementsByTagName("Casa");
        nodoRaiz.item(0).appendChild(terraza);
        terraza.appendChild(tamano);
        tamano.appendChild(valor);

        //Guardamos la nueva estructura la fichero XML
    }
    
    public static void eliminarHabitacionAzul(Document document,String URI) throws org.xml.sax.SAXException{
        try {
            //Cargamos el document del fichero XML existente
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            document = db.parse(new File(URI));
            document.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Obtenemos todas las habitaciones de la casa
        NodeList listaNodos = document.getDocumentElement().getElementsByTagName("Habitacion");
        Node nodo;
        for(int i=0; i<listaNodos.getLength(); i++){
            nodo = listaNodos.item(i);

            //Obtenemos una lista de todas las características de cada habitación
            NodeList listaCaracteristicas = nodo.getChildNodes();
            Node caracteristica;

            for(int z=0; z<listaCaracteristicas.getLength();z++){
                //Obtenemos cada característica individual
                caracteristica = listaCaracteristicas.item(z);
                //Si la característica es el color y su valor es azul la eliminamos
                if(caracteristica.getNodeName().equals("Color") && caracteristica.getTextContent().equals("Azul")){
                    //El padre del nodo es Habitación y su padre Casa. Eliminamos Habitación de Casa.
                    caracteristica.getParentNode().getParentNode().removeChild(caracteristica.getParentNode());
                }
            }
        }
    }
    
}
