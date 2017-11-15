/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mates;

/**
 *
 * @author Juan
 */
public class Main {

    
    /*int suma(int a, int b){
        
        int res;
        res = a + b;
        return res;
        
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        sumar operacion = new sumar();
        
        int a=5;
        int b=4;
        
        System.out.println(operacion.suma(a,b));
        System.out.println(operacion.multi(a,b));
        
    }
    
}
