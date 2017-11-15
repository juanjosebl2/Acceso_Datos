/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class usuarios {
    
    private String i;
    private String nom;
    private String ape;
    private String ed;
    
    public usuarios(String id, String nombre, String apellido, String edad){
        this.i = id;
        this.nom = nombre;
        this.ape = apellido;
        this.ed = edad;
    }

    public void setI(String i) {
        this.i = i;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public String getI() {
        return i;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public String getEd() {
        return ed;
    }
    
}
