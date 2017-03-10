/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class adminGuerrero {
    private ArrayList<Guerrero>listaGuerreros = new ArrayList();
    private File archivo = null;
    
    public adminGuerrero(String path){
        archivo = new File(path);
    }

    public ArrayList<Guerrero> getListaGuerreros() {
        return listaGuerreros;
    }

    public void setListaGuerreros(ArrayList<Guerrero> listaGuerreros) {
        this.listaGuerreros = listaGuerreros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setGuerrero(Guerrero a){
        listaGuerreros.add(a);
    }
    public void cargarArchivo(){
        try {
            listaGuerreros = new ArrayList();
            Guerrero temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Guerrero)objeto.readObject())!=null){
                        listaGuerreros.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for(Guerrero t : listaGuerreros){
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
