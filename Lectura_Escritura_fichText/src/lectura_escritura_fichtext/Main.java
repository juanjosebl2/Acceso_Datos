/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_escritura_fichtext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Juan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      FileWriter fichero = null;
      PrintWriter pw = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
         String ruta="C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba.txt";
         String ruta2="C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba2.txt";
        if(args.length>0){
            System.out.println("ha entrado");
            ruta = args[0];
            ruta2 = args[1];
        }
         //archivo = new File ("C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba.txt");
         archivo = new File (ruta);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
        //fichero = new FileWriter("C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba2.txt");
        fichero = new FileWriter(ruta2);
        pw = new PrintWriter(fichero);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            System.out.println(linea);
            pw.println(linea);
         }
          
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();   
               fichero.close();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }*/
      
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      FileWriter fichero = null;
      PrintWriter pw = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
         String ruta="C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba.txt";
         String ruta2="C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba2.txt";
        if(args.length>0){
            System.out.println("ha entrado");
            ruta = args[0];
            ruta2 = args[1];
        }
         //archivo = new File ("C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba.txt");
         archivo = new File (ruta);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
        //fichero = new FileWriter("C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\prueba2.txt");
        fichero = new FileWriter(ruta2);
        pw = new PrintWriter(fichero);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            System.out.println(linea);
            pw.println(linea);
         }
          
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();   
               fichero.close();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
     
     
    }
    
}
