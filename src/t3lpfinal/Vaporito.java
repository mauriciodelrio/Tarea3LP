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
public class Vaporito extends Agua {
    protected String nombre="Vaporito";
    protected int vida;
    protected int tipo1=1;
    protected int tipo2=2;
    public Vaporito(int life){
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
        if (Tipo==1){
            enem.setVida(Vida-4);
        }
        else if (Tipo==2){
            enem.setVida(Vida-6);
        }
        else{
            enem.setVida(Vida-2);
        }
    }
    
    @Override
    public void ataque_secundario(Plagiamon enem, int Tipo) {
        int Vida=enem.getVida();
        if (Tipo==2){
            enem.setVida(Vida-4);
        }
        else if (Tipo==3){
            enem.setVida(Vida-5);
        }
        else{
            enem.setVida(Vida-3);
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
