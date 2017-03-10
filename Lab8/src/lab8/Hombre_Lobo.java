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

    public Hombre_Lobo(String nombre, String nickname, double ataque, double defensa, double salud) {
        super(nombre, nickname, ataque, defensa, salud);
    }

    public Hombre_Lobo() {
    }

    

    @Override
    public void atacar(Guerrero p) {
        p.setSalud2(p.getSalud()-(super.getAtaque()-p.getDefensa()));
    }
    
}
