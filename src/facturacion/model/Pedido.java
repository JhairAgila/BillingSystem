/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SONY VAIO
 */
public class Pedido {
    private int id;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;
    private String nombre;
    private String direccion;
    private String fechaPedido;

    public Pedido() {
        this.fechaPedido = fechaActualSistema();
    }

    public Pedido(String descripcion, int precioUnitario, int cantidad) {
        this();
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Pedido(String descripcion, int precioUnitario, int cantidad, String nombre, String direccion) {
        this(descripcion, precioUnitario, cantidad);
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String fechaActualSistema(){
        Date date = new Date();
        SimpleDateFormat  formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatoFecha.format(date);
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pedido(int id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}
