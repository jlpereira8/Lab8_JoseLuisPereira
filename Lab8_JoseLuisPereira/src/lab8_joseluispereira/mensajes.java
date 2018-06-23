/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_joseluispereira;
//•	Destino 
//	Fuente

/**
 *
 * @author j0c3lwiz
 */
public class mensajes {
    String Destino;
    String Fuente;
    String texto;

    public mensajes(String Destino, String Fuente, String texto) {
        this.Destino = Destino;
        this.Fuente = Fuente;
        this.texto = texto;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getFuente() {
        return Fuente;
    }

    public void setFuente(String Fuente) {
        this.Fuente = Fuente;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
    
    
    
    
}
