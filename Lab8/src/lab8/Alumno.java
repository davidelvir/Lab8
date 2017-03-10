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
public class Alumno extends Guerrero{
    private int cuenta;
    private String carrera;
    private int edad;

    public Alumno(int cuenta, String carrera, int edad, String nombre, String nickname, double ataque, double defensa, double salud) {
        super(nombre, nickname, ataque, defensa, salud);
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public Alumno() {
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void atacar(Guerrero p) {
            p.setSalud2(p.getSalud() - (super.getAtaque() - p.getDefensa()));
            super.setSalud2(super.getSalud()+(super.getSalud()*0.25));
        
    }
    
}
