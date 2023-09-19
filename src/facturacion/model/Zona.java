/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.model;

import java.text.DecimalFormat;

/**
 *
 * @author SONY VAIO
 */
public class Zona {
    private int id;
    private String nombre;
    private double descuento;
    private double incremento;

    public Zona() {
    }

    public Zona(String nombre, double descuento, double incremento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.incremento = incremento;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    @Override
    public String toString() {
        return "Zona{" + id + " | " + nombre + " | "  + descuento + " | " + incremento + '}';
    }
    
    
}
