/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public abstract class Guerrero {
    private String nombre;
    private String nickname;
    private double ataque;
    private double defensa;
    private double salud;
    private int puntos;

    public Guerrero(String nombre, String nickname, int ataque, int defensa, double salud, int puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        setAtaque(ataque);
        setDefensa(defensa);
        setSalud(salud);
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        while(ataque < 200 || ataque >300){
            ataque = Integer.parseInt(JOptionPane.showInputDialog("El ataque debe estar entre 200 y 300"));
        }
        if(ataque>200 && ataque < 300){
            this.ataque = ataque;
        }
    }
    public void setAtaque2(double ataque) {
        if(ataque<200){
            this.ataque = 200;
        }
        if(ataque>300){
            this.ataque = 300;
        }
    }
    public void setDefensa2(double defensa){
        if(defensa < 25){
            this.defensa = 25;
        }
        if(defensa > 75){
            this.defensa = 75;
        }
    }
    
    public void setSalud2(double salud){
        if(salud <0){
            this.salud = 0;
        }
        if(salud > 800){
            this.salud = 800;
        }
    }
    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        while(defensa > 25 || defensa > 75){
            defensa = Integer.parseInt(JOptionPane.showInputDialog("La defensa debe estar entre 25 y 75"));
        }
        this.defensa = defensa;
    }

    

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        while (salud < 800) {
            salud = Integer.parseInt(JOptionPane.showInputDialog("La salud debe ser mayor a 800"));
        }
        if(salud > 800){
            this.salud = salud;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public abstract void atacar(Guerrero p);
}
