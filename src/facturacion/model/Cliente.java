/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.model;

/**
 *
 * @author SONY VAIO
 */
public class Cliente {
    private String nombre;
    private String identidad; // Nombres direrntes no se puede contactar con DB
    private String direccion;
    private int id;

    public Cliente(){
        
    }
    
    public Cliente(String nombre, String identidad, String direccion){
        this.direccion = direccion;
        this.nombre = nombre;
        this.identidad = identidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + id + " | " + nombre + " | " + identidad + " | " + direccion + " } " ;
    }   
}
