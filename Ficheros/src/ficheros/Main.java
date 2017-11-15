/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;

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
        String ruta=".";
        if(args.length>0){
            System.out.println("ha entrado");
            ruta = args[0];
        }
        System.out.println("Ficheros en el directorio actual: ");
        File f = new File(ruta);
        String[] archivos = f.list();
        
        for (int i = 0; i < archivos.length; i++){
            System.out.println(archivos[i]);
        }
        
        System.out.println("Nombre del fichero f.getName(): " + f.getName());
        System.out.println("Se puede escribir f.canRead(): " + f.canRead());
        System.out.println("Se puede leer f.canWrite(): " + f.canWrite());
        System.out.println("Ruta f.getPath(): " + f.getPath());
        System.out.println("Ruta absoluta f.getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println("Tamaño f.length(): " + f.length());
        System.out.println("Es un directorio f.isDirectory(): " + f.isDirectory());
        System.out.println("Es un fichero f.isFile(): " + f.isFile());
        
    }
    
}
