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
public class Carteles extends AnunciosCF{
    private Persona actores;

    public Carteles(Persona actores, String fotografias, String graficos) {
        super(fotografias, graficos);
        this.actores = actores;
    }

    public Persona getActores() {
        return actores;
    }

    public void setActores(Persona actores) {
        this.actores = actores;
    }

    @Override
    public int costeReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
}
