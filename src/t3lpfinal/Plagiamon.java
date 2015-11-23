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
public interface Plagiamon {
    public void setVida(int i);

    public int getVida();

    public int getTipo1();

    public int getTipo2();
/******** Metodo: ataque_principal ********************
Descripcion: Realiza el ataque principal del plagiamon
Parametros:
plag2 Plagiamon enemigo
Tipo2 Tipo del plagiamon enemigo
Retorno: 
************************************************/
    public void ataque_principal(Plagiamon plag2, int Tipo2);
/******** Metodo: ataque_secundario ********************
Descripcion: Realiza el ataque secundario del plagiamon
Parametros:
plag2 Plagiamon enemigo
Tipo2 Tipo del plagiamon enemigo
Retorno: 
************************************************/
    public void ataque_secundario(Plagiamon plag2, int Tipo2);
    public String getNombre();

}
