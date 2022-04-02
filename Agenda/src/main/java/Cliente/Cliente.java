/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class Cliente {
    private String Id;
    private String Nombre;
    private String Apellido;
    private ArrayList Direcciones = new ArrayList() ;
    
    
    public Cliente (String Id, String Nombre, String Apellido, ArrayList<String> Direcciones){
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

    public ArrayList getDirecciones() {
        return Direcciones;
    }

    public void setDirecciones(ArrayList Direcciones) {
        this.Direcciones = Direcciones;
    }

    
    
    
    
}
