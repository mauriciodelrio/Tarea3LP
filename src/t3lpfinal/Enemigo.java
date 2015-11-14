/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3lpfinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio
 */
public class Enemigo implements Entrenador {
    protected String nombre;
    protected List <Plagiamon> ListaP=new ArrayList<>();;
    public Enemigo(String name){
        nombre=name;
    }
    public void addPlagiamon(Plagiamon plag){
        ListaP.add(plag);
    }
    public Plagiamon getPlagiamon(){
        if (ListaP.get(0).getVida()>0){
            return ListaP.get(0);
        }
        else {
            return ListaP.get(1);
        }

    }
}
