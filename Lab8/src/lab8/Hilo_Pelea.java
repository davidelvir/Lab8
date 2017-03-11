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
public class Hilo_Pelea extends Thread{
    private boolean vive;
    private Guerrero g1;
    private Guerrero g2;

    public Hilo_Pelea(Guerrero g1, Guerrero g2) {
        this.g1 = g1;
        this.g2 = g2;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public Guerrero getG1() {
        return g1;
    }

    public void setG1(Guerrero g1) {
        this.g1 = g1;
    }

    public Guerrero getG2() {
        return g2;
    }

    public void setG2(Guerrero g2) {
        this.g2 = g2;
    }
    
    public void run(){
        adminPelea ap = new adminPelea("./peleas.txt");
        while(vive){
            while(vive){
                this.g1.atacar(g2);
                if(g1.getSalud() == 0){
                    g2.setPuntos(g2.getPuntos()+3);
                    vive = false;
                }
                if(g2.getSalud() == 0){
                    g1.setPuntos(g1.getPuntos()+3);
                    vive = false;
                }
                System.out.println(g1.getNombre()+" "+g1.getSalud());
                System.out.println(g2.getNombre()+" "+g2.getSalud());
                this.g2.atacar(g1);
                if(g1.getSalud() == 0){
                    g2.setPuntos(g2.getPuntos()+3);
                    vive = false;
                }
                if(g2.getSalud() == 0){
                    g1.setPuntos(g1.getPuntos()+3);
                    vive = false;
                }
                
                try {
                    Thread.sleep(0);
                } catch (Exception e) {
                }
            }
            ap.escribirArchivo();
        }
    }
}
