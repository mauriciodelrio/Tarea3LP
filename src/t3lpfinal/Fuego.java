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
public abstract class Fuego implements Plagiamon {
    abstract public void ataque_principal(Plagiamon enem, int Tipo);
    abstract public void ataque_secundario(Plagiamon enem, int Tipo);
}
