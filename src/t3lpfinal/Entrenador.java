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
public interface Entrenador {
    public Plagiamon getPlagiamon();

    public int vidaPlagiamonfinal();

    public void batalla(Plagiamon plagiamon, Plagiamon plagiamon0, int i, int random);
}
