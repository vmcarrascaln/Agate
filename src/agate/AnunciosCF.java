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
public abstract class AnunciosCF implements Anuncio{
    private String fotografias;
    private String graficos;

    public AnunciosCF(String fotografias, String graficos) {
        this.fotografias = fotografias;
        this.graficos = graficos;
    }

    public String getFotografias() {
        return fotografias;
    }

    public String getGraficos() {
        return graficos;
    }

    public void setFotografias(String fotografias) {
        this.fotografias = fotografias;
    }

    public void setGraficos(String graficos) {
        this.graficos = graficos;
    }
    
    
}
