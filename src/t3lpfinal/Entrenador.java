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
    /******** Metodo: addplagiamon ********************
Descripcion: Agrega un plagiamon a la lista de plagiamones del entrenador
Parametros:
plag1 Plagiamon jugador
plag2 Plagiamon enemigo
atq1 entero
atq2 entero
Retorno: resultado de la operacion aritmetica de la suma entero
************************************************/
    public void addPlagiamon(Plagiamon plg);
    public Plagiamon getPlagiamon();
 /******** Metodo:vidaPlagiamonfinal ********************
Descripcion: Entrega la vida del ultimo plagiamon del entrenador
Parametros:
Retorno: Vida del ultimo plagiamon en la lista del entrenador.
************************************************/   
    public int vidaPlagiamonfinal();
/******** Metodo: batalla ********************
Descripcion: Realiza el ataque principal o secundario de los plagiamones que recibe, según la selección del jugador, y la opción al azar del oponente
Parametros:
plag1 Plagiamon jugador
plag2 Plagiamon enemigo
atq1 entero
atq2 entero
Retorno: resultado de la operacion aritmetica de la suma entero
************************************************/
    public void batalla(Plagiamon plagiamon, Plagiamon plagiamon0, int i, int random);
}
