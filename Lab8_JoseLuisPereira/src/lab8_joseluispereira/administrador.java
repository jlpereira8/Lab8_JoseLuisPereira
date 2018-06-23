/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_joseluispereira;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author joseph
 */
public class administrador {

    private ArrayList<mensajes> listapersonas = new ArrayList();
    private File archivo = null;

    public administrador(String path) {
        archivo = new File(path);
    }

    public ArrayList<mensajes> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<mensajes> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrador{" + "listapersonas=" + listapersonas + '}';
    }

    public void setPersona(mensajes p) {
        this.listapersonas.add(p);
    }

    public void cargarArchivo() {
        try {
            listapersonas = new ArrayList();
            mensajes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (mensajes) objeto.readObject()) != null) {
                        listapersonas.add(temp);
                    }
                } catch (Exception e) {//encontro final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribir() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (mensajes t : listapersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
