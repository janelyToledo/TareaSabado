/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Janely
 */
public class Herencia {

    public static void main(String[] args) {
        Animal p = new Perro("Color Negro","SI","SI","SI",4);
       //p.Sonido();
        
        Animal g = new Gato ("Blanco","SI","SI","SI",4);
       // g.Sonido();
        
        List<Animal> lista = new ArrayList<Animal>();
        lista.add(p);
        lista.add(g);
        lista.add(new Queco("NO","SI","SI","SI",4));
        for(Animal item : lista){
            item.Sonido();
            
        }
    }
}