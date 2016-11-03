/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agate;

/**
 *
 * @author Felipe
 */
public abstract class AnunciosPRI implements Anuncio{
    
    private String texto;
    private String graficos;
    private String fotografias;

    public AnunciosPRI(String texto, String graficos, String fotografias) {
        this.texto = texto;
        this.graficos = graficos;
        this.fotografias = fotografias;
    }

    public String getTexto() {
        return texto;
    }

    public String getGraficos() {
        return graficos;
    }

    public String getFotografias() {
        return fotografias;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setGraficos(String graficos) {
        this.graficos = graficos;
    }

    public void setFotografias(String fotografias) {
        this.fotografias = fotografias;
    }
    
    
    
}
