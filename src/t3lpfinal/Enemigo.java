/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3lpfinal;

/**
 *
 * @author Mauricio
 */
public class Enemigo implements Entrenador {
    protected String nombre;
    protected Plagiamon plag1;
    protected Plagiamon plag2;
    protected Plagiamon plag3;
    public Enemigo(String name){
        nombre=name;
        plag1=null;
        plag2=null;
        plag3=null;
    }
    public boolean set_plagiamon(Plagiamon plg1, Plagiamon plg2, Plagiamon plg3){
        plag1=plg1;
        plag2=plg2;
        plag3=plg3;
        return !(plag1==null||plag2==null||plag3==null);
    }
    public Plagiamon getPlagiamon(){
        if (plag1.getVida()>0){
            return plag1;
        }
        else if (plag2.getVida()>0 && plag1.getVida()==0){
            return plag2;
        }
        else return plag3;
    }
}
