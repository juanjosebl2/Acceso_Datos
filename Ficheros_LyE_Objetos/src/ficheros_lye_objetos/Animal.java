/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros_lye_objetos;

import java.io.Serializable;

/**
 *
 * @author Juan
 */
public class Animal implements Serializable{

    
    String nombre;
    int nPatas;
    String tipo;
    
    public Animal(){
        
    }
    public Animal(String nombre, int nPatas) {
        this.nombre = nombre;
        this.nPatas = nPatas;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
