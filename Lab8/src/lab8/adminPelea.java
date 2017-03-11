/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class adminPelea {
    private ArrayList<String>peleas = new ArrayList();
    private ArrayList<Hilo_Pelea>peleas2 = new ArrayList();
    private File archivo = null;

    public adminPelea(String path){
        archivo = new File(path);
    }

    public ArrayList<String> getPeleas() {
        return peleas;
    }

    public void setPeleas(ArrayList<String> peleas) {
        this.peleas = peleas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for(Hilo_Pelea t : peleas2){
                bw.write(t.getG1().getNombre()+" "+t.getG1().getSalud()+";");
                bw.write(t.getG2().getNombre()+" "+t.getG2().getSalud()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try{
            bw.close();
            fw.close();
            }catch(Exception e){
                
            }
        }
    }
    
}
