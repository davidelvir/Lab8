/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author David
 */
public class Hombre_Lobo extends Guerrero{

    public Hombre_Lobo(String nombre, String nickname, int ataque, int defensa, double salud, int puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public void atacar(Guerrero p) {
        p.setSalud2(super.getAtaque()-p.getDefensa());
    }
    
}
