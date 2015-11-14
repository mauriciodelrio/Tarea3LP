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
public class Jugador implements Entrenador {
    protected String nombre;
    protected Plagiamon plg1;
    protected Plagiamon plg2;
    protected Plagiamon plg3;
    public Jugador(String name){
        nombre=name;
        plg1=null;
        plg2=null;
        plg3=null;
    }
    public boolean set_plagiamon(Plagiamon plag1, Plagiamon plag2, Plagiamon plag3){
        plg1=plag1;
        plg2=plag2;
        plg3=plag3;
        return !(plg1==null||plg2==null||plg3==null);
    }
    public Plagiamon getPlagiamon(){
        if (plg1.getVida()>0){
            return plg1;
        }
        else if (plg2.getVida()>0 && plg1.getVida()==0){
            return plg2;
        }
        else return plg3;
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
    
}
