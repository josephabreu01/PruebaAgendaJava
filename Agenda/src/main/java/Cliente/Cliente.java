/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author josep
 */
public class Cliente {
    private String Id;
    private String Nombre;
    private String Apellido;
    private HashMap<String, String> Direcciones = new HashMap<String, String>() ;
    
    
    public Cliente (String Id, String Nombre, String Apellido, HashMap<String, String> Direcciones){
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido =Apellido;
        this.Direcciones =Direcciones;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public HashMap<String, String> getDirecciones() {
        return Direcciones;
    }

    public void setDirecciones(HashMap<String, String> Direcciones) {
        this.Direcciones = Direcciones;
    }

   

    
    
    
    
}
