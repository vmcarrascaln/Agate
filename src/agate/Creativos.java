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
import java.util.*;

public class Creativos {
    
    private ArrayList<String>notas;
    private Persona directorFinanzas;
    private Persona diseñadoresGraficos;
    private Persona fotografos;
    private Persona escritores;
    private Persona editores;
    private Persona tecnicoDeAudio;
    private Persona bibliotecario;

    public Creativos(ArrayList<String> notas, Persona directorFinanzas, Persona diseñadoresGraficos, Persona fotografos, Persona escritores, Persona editores, Persona tecnicoDeAudio, Persona bibliotecario) {
        this.notas = notas;
        this.directorFinanzas = directorFinanzas;
        this.diseñadoresGraficos = diseñadoresGraficos;
        this.fotografos = fotografos;
        this.escritores = escritores;
        this.editores = editores;
        this.tecnicoDeAudio = tecnicoDeAudio;
        this.bibliotecario = bibliotecario;
    }
    
    public String registrarCampañas(Campaña c){
        return null;
    }
    
    public ArrayList<String> setNotas(){
        return null;
    }
    
    public void registrarAnuncios(Campaña c){
        
    }
    
    public Date programarFechas(Campaña c){
        return null;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public Persona getDirectorFinanzas() {
        return directorFinanzas;
    }

    public Persona getDiseñadoresGraficos() {
        return diseñadoresGraficos;
    }

    public Persona getFotografos() {
        return fotografos;
    }

    public Persona getEscritores() {
        return escritores;
    }

    public Persona getEditores() {
        return editores;
    }

    public Persona getTecnicoDeAudio() {
        return tecnicoDeAudio;
    }

    public Persona getBibliotecario() {
        return bibliotecario;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    public void setDirectorFinanzas(Persona directorFinanzas) {
        this.directorFinanzas = directorFinanzas;
    }

    public void setDiseñadoresGraficos(Persona diseñadoresGraficos) {
        this.diseñadoresGraficos = diseñadoresGraficos;
    }

    public void setFotografos(Persona fotografos) {
        this.fotografos = fotografos;
    }

    public void setEscritores(Persona escritores) {
        this.escritores = escritores;
    }

    public void setEditores(Persona editores) {
        this.editores = editores;
    }

    public void setTecnicoDeAudio(Persona tecnicoDeAudio) {
        this.tecnicoDeAudio = tecnicoDeAudio;
    }

    public void setBibliotecario(Persona bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    
    
    
    
    
}
