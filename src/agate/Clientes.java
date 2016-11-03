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
public class Clientes {
    private Persona contactoPrincipal;
    private String nombre;
    private String direcciones;

    public Clientes(Persona contactoPrincipal, String nombre, String direcciones) {
        this.contactoPrincipal = contactoPrincipal;
        this.nombre = nombre;
        this.direcciones = direcciones;
    }

    public void registroCampaña(){
        
    }
    
    public Persona setContactoPrincipal(){
        return null;
    }
    
    public Campaña verificacionPresupuesto(){
        return null;
    }
    
    public double incentivoAnual(){
        return 0;
    }
    
       
    public Persona getContactoPrincipal() {
        return contactoPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirecciones() {
        return direcciones;
    }

    public void setContactoPrincipal(Persona contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }
    
    
    
    
}
