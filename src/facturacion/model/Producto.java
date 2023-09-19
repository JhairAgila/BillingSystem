/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.model;

/**
 *
 * @author SONY VAIO
 */
public class Producto {
    private String descripcion;
    private int id;
    private double precioUnitario;
    private int stock;

    public Producto() {
    }

    public Producto(String descripcion, double precioUnitario, int stock) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public Producto(String descripcion, double precioUnitario, int stock, int id) {
        this();
        this.id = id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + id + " | " + descripcion + " | " + precioUnitario + " | " + '}';
    }
      
}
