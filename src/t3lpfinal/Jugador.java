/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3lpfinal;

import java.util.ArrayList;


/**
 *
 * @author Mauricio
 */
public class Jugador implements Entrenador {
    protected String nombre;
    protected ArrayList <Plagiamon> ListaP= new ArrayList <>();
    public Jugador(String name){
        nombre=name;
    }

    public void addPlagiamon(Plagiamon plg){
        ListaP.add(plg);
    }

    @Override
    public Plagiamon getPlagiamon(){
        if (ListaP.get(0).getVida()>0){
            return ListaP.get(0);
        }
        else if (ListaP.get(1).getVida()>0 && ListaP.get(0).getVida()==0){
            return ListaP.get(1);
        }
        else return ListaP.get(2);
    }


    public void batalla(Plagiamon plag1, Plagiamon plag2, int atq1, int atq2){      
        int Tipo1 = 0;
        int Tipo2 = 0;
        if (atq1==1)Tipo1=plag1.getTipo1();
        if (atq1==2)Tipo1=plag1.getTipo2();
        if (atq2==1)Tipo2=plag2.getTipo1();
        if (atq2==2)Tipo2=plag2.getTipo2();
        if (atq1==1)plag1.ataque_principal(plag2,Tipo2);
        if (atq1==2)plag1.ataque_secundario(plag2,Tipo2);
        if (atq2==1)plag2.ataque_principal(plag1,Tipo1);
        if (atq2==2)plag2.ataque_secundario(plag1,Tipo1);
    }
    public int getVidaLastPlg(){
        return ListaP.get(2).getVida();
    }
    public int vidaPlagiamonfinal(){
        return ListaP.get(2).getVida();
    }  
}
