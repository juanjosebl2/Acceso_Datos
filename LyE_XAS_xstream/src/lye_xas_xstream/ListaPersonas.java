/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lye_xas_xstream;

import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.M;

/**
 *
 * @author Juan
 */
public class ListaPersonas {
    
   private List<Persona> lista = new ArrayList<Persona>();
    
   public ListaPersonas(){}
   
   public void add(Persona per){
       lista.add(per);
   }
   public List<Persona> getListaPersonas(){
       return lista;
   }
    
}
