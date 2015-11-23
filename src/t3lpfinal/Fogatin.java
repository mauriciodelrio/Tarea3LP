/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3lpfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Fogatin extends Fuego {
    protected String nombre="Fogatin";
    protected int vida;
    protected int tipo1=2;
    protected int tipo2=3;
    public Fogatin(int life){
        vida=life;
    }
    public int getVida(){
    
        return vida;
    }
    
    public void setVida(int v){
        if(v<0) vida=0;
        else vida = v;
    }
    public int getTipo1(){
        return tipo1;
    }
    public int getTipo2(){
        return tipo2;
    }    
    @Override
    public void ataque_principal(Plagiamon enem, int Tipo) {
        int Vida=enem.getVida();
        if (Tipo==2){
            enem.setVida(Vida-4);
            JOptionPane.showMessageDialog(null,nombre+" hizo 4 de daño.");
        }
        else if (Tipo==3){
            enem.setVida(Vida-6);
            JOptionPane.showMessageDialog(null,nombre+" hizo 6 de daño.");
        }
        else{
            enem.setVida(Vida-2);
            JOptionPane.showMessageDialog(null,nombre+" hizo 2 de daño.");
        }
    }
    
    @Override
    public void ataque_secundario(Plagiamon enem, int Tipo) {
        int Vida=enem.getVida();
        if (Tipo==3){
            enem.setVida(Vida-4);
            JOptionPane.showMessageDialog(null,nombre+" hizo 4 de daño.");
        }
        else if (Tipo==1){
            enem.setVida(Vida-5);
            JOptionPane.showMessageDialog(null,nombre+" hizo 5 de daño.");
        }
        else{
            enem.setVida(Vida-3);
            JOptionPane.showMessageDialog(null,nombre+" hizo 3 de daño.");
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
