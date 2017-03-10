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
public class Dragon extends Guerrero{

    public Dragon(String nombre, String nickname, int ataque, int defensa, double salud, int puntos) {
        super(nombre, nickname, ataque, defensa, salud, puntos);
    }

    @Override
    public void atacar(Guerrero p) {
        p.setSalud2((super.getAtaque()*0.35)-p.getDefensa());
        p.setDefensa2(p.getDefensa()-(p.getDefensa()*0.15));
    }
    
}
