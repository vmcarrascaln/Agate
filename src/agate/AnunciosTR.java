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
public abstract class AnunciosTR implements Anuncio{
    
    private Persona actores;
    private String alocuciones;
    private String musica;

    public AnunciosTR(Persona actores, String alocuciones, String musica) {
        this.actores = actores;
        this.alocuciones = alocuciones;
        this.musica = musica;
    }

    public Persona getActores() {
        return actores;
    }

    public String getAlocuciones() {
        return alocuciones;
    }

    public String getMusica() {
        return musica;
    }

    public void setActores(Persona actores) {
        this.actores = actores;
    }

    public void setAlocuciones(String alocuciones) {
        this.alocuciones = alocuciones;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
    
    
    
    
}
