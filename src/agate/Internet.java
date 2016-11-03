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
public class Internet extends AnunciosPRI {
    private String animaciones;

    public Internet(String animaciones, String texto, String graficos, String fotografias) {
        super(texto, graficos, fotografias);
        this.animaciones = animaciones;
    }

    public String getAnimaciones() {
        return animaciones;
    }

    public void setAnimaciones(String animaciones) {
        this.animaciones = animaciones;
    }

    @Override
    public int costeReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
