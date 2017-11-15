/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros_lye_objetos;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Juan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        
    String f ="C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\objeto.dat";
    Vector vector = new Vector();
    Vector vectorAux = new Vector();
    Scanner escan = new Scanner(System.in);
        
     FileInputStream fis = null;
    ObjectInputStream leerObjeto = null;

    try{
        
        fis = new FileInputStream( f );
        leerObjeto = new ObjectInputStream( fis );

        
        vector = (Vector)leerObjeto.readObject();
        
        int total = vector.size();
        Animal aux;
        for(int i = 0; i < total; i++){
            aux = (Animal)vector.get(i);
            System.out.println("El animal " + (i+1) + " : " + aux.getNombre() + " , " + aux.getnPatas());
        }
        
    }
    catch( Exception e ){ }
    finally
    {
        try{
            //Se cierra el archivo y listo.
            if( leerObjeto != null ) leerObjeto.close();
        }catch( Exception ex ){}
    }
    
    FileOutputStream fos = null;
    ObjectOutputStream escribirObjeto = null;
    //ArrayList<Animal> vector = new ArrayList<Animal>();
    
    /*try{
        
        fos = new FileOutputStream( f );
        escribirObjeto = new ObjectOutputStream( fos );

        //Se escribe la instancia de la clase CasaBulma
        
        Animal animal = new Animal("Perro",4);
        Animal animal2 = new Animal("Paloma",2);
        Animal animal3 = new Animal("Delfin",0);
        vector.add(animal);
        vector.add(animal2);
        vector.add(animal3);
        
        
        escribirObjeto.writeObject( vector );
    }
    catch( Exception e ){ }
    finally
    {
        try{
            //Se cierra el archivo y listo.
            if( escribirObjeto != null ) escribirObjeto.close();
        }catch( Exception ex ){}
    }*/

    
    String a;
    int b;
    String c;
    boolean exit =false;
    
    //while(exit==false){
        System.out.println("1 - Insertar");
        System.out.println("2 - Borrar");
        System.out.println("El resto - Salir");
        System.out.println("Introduzca para menu: ");
        String op = escan.nextLine();
          switch ( op ) {
          case "1":

              fos = new FileOutputStream( f );
            escribirObjeto = new ObjectOutputStream( fos );

               System.out.println("Introduce nombre: ");
                a = escan.nextLine();
                System.out.println("Introduce numero de patas: ");
                b = escan.nextInt();
                Animal animal4 = new Animal(a,b);
                vector.add(animal4);

                escribirObjeto.writeObject( vector );
               break;
          case "2":
              fos = new FileOutputStream( f );
            escribirObjeto = new ObjectOutputStream( fos );

              System.out.println("Introduce nombre para borrar: ");
            c = escan.nextLine();

            int total = vector.size();
            Animal aux;
            for(int i = 0; i < total; i++){
                aux = (Animal)vector.get(i);
                if(c == null ? aux.getNombre() == null : c.equals(aux.getNombre())){
                    
                    //vector.removeElementAt(i);
                } else {
                    vectorAux.add(aux);
                }
            }
            
            escribirObjeto.writeObject( vectorAux );
            
               break;
          default:
               System.out.println("Salir" );
               exit=true;
               break;
          }
    //}
        
   
    
    

        /*File fichero = new File("C:\\Users\\Juan\\Desktop\\2ºDAM\\Java\\objeto.dat");
        FileOutputStream fileout = new FileOutputStream(fichero);
        
        DataOutputStream dataOS = new DataOutputStream(fileout);
        
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<Integer> patas = new ArrayList<Integer>();
        nombre.add("Perro");
        nombre.add("Paloma");
        nombre.add("Pez");
        patas.add(4);
        patas.add(2);
        patas.add(0);
        
        
        for(int i=0;i<3;i++){
            dataOS.writeUTF(nombre.get(i));
            dataOS.writeInt(patas.get(i));
        }
        dataOS.close();
        
        FileInputStream filein = new FileInputStream(f);
        
        DataInputStream dataIS = new DataInputStream(filein);
        
        String n;
        int e;
        
        try{
        while(true){
            n = dataIS.readUTF();
            e = dataIS.readInt();
            System.out.println("Nombre: "+ n + ", edad: " + e);
        }
        }catch (EOFException eo){}
        dataIS.close();*/
        
    }
    
}
