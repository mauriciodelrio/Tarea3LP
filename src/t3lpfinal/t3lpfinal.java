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

import java.*;
import javax.swing.*; 
public class t3lpfinal {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Algarax algui=new Algarax(18);
        Cactaria cacti=new Cactaria(9);
        Calabalantern cali=new Calabalantern(18);
        Fogatin fogi=new Fogatin(18);
        Lavarax lavi=new Lavarax(9);
        Vaporito vapi=new Vaporito(9);
        
        System.out.println("la vida de algui es: "+algui.getVida());
        System.out.println("la vida de cacti es: "+cacti.getVida());
        // TODO code application logic here

        Jugador ash = new Jugador("felipe");
        Enemigo gay = new Enemigo("mauricio");

        System.out.println("la vida del plag de ash es: "+ash.getPlagiamon().getVida());
        System.out.println("la vida de cacti weas: "+gay.getPlagiamon().getVida());
        ash.batalla(ash.getPlagiamon(), gay.getPlagiamon(), 1, 1);
        System.out.println("la vida del plag de ash es: : "+ash.getPlagiamon().getVida());
        System.out.println("la vida de cacti es: "+gay.getPlagiamon().getVida());
        ventana_principal menuholi= new ventana_principal();
        menuholi.setVisible(true);
        int variableinutil=0;
        //holi
    }
    
    
}
