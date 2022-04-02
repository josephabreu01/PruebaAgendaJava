/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes.Personas;

/**
 *
 * @author josep
 */
public class Personas {
    
    private String nombre ;
    private String Apellido ;
    private String[] direcciones;
    
    public Personas(String nombre , String Apellido, String[] direcciones){
        
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.direcciones = direcciones;
        
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApellido() {
        return Apellido;
    }

    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    public String[] getDirecciones() {
        return direcciones;
    }

    
    public void setDirecciones(String[] direcciones) {
        this.direcciones = direcciones;
    }
    
    
    
}
