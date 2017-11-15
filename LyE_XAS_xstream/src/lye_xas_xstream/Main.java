/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lye_xas_xstream;

import com.thoughtworks.xstream.XStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Main {

static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        

        File fichero = new File("C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\FichPersona.dat");   
        FileInputStream filein = new FileInputStream(fichero);
        
        ObjectInputStream dataIS = new ObjectInputStream(filein);
        System.out.println("Conmienza el proceso de creación del xml");
        
        ListaPersonas listaper = new ListaPersonas();
        
        try {
            while (true){
                Persona persona = (Persona) dataIS.readObject();
                listaper.add(persona);
            }
        }catch (EOFException eo) {}
        dataIS.close();
        
        try {
            XStream xstream = new XStream();
            
            xstream.alias("ListaPersonasMunipio", ListaPersonas.class);
            xstream.alias("DatosPersona", Persona.class);
            
            xstream.addImplicitCollection(ListaPersonas.class, "lista");
            
            xstream.toXML(listaper, new FileOutputStream("C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\FichPersona.xml"));         
            System.out.println("Creando el fichero..");
        } catch (Exception e){}
        
    }
    
}
