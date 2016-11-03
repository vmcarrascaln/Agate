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
public class TV extends AnunciosTR{
    private String videos;
    private String peliculas;

    public TV(String videos, String peliculas, Persona actores, String alocuciones, String musica) {
        super(actores, alocuciones, musica);
        this.videos = videos;
        this.peliculas = peliculas;
    }

    public String getVideos() {
        return videos;
    }

    public String getPeliculas() {
        return peliculas;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

    public void setPeliculas(String peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public int costeReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
