package facturacion.gui;

import facturacion.dao.DAOCliente;
import facturacion.dao.DAOProducto;
import facturacion.dao.DAOZona;
import facturacion.dao.HibernateUtil;
import facturacion.model.Cliente;
import facturacion.model.Pedido;
import facturacion.model.Producto;
import facturacion.model.Zona;
import org.hibernate.Hibernate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SONY VAIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        
//        Cliente c1 = new Cliente("Jhair", "11021211", "Note");
//        Cliente c2 = new Cliente("Cristian", "10112122", "Sur");
//        DAOCliente dAOCliente = new DAOCliente();
//        dAOCliente.guardar(c2);
   
        Zona z1 = new Zona("Norte", 0.12, 0);
        Zona z2 = new Zona("Sur", 0, 0.20);
        Zona z3 = new Zona("Este", 0.10,0 );
        Zona z4 = new Zona("Oeste", 0.20, 0);
        
        DAOZona dAOZona = new DAOZona();
        dAOZona.guardar(z1);
        dAOZona.guardar(z2);
        dAOZona.guardar(z3);
        dAOZona.guardar(z4);
//        Producto p1 = new Producto();
//        p1.setDescripcion("Book");
//        p1.setPrecioUnitario(43.9);
//        
//        DAOProducto dAOProducto = new DAOProducto();
//        dAOProducto.guardar(p1);
//        
//        Cliente c1 = new Cliente("Loja", "12121112", "Luis Mario");
//        Producto p2 = (Producto) dAOProducto.getList().get(1);
//
////        c1.setDireccion("Loja");
////        c1.setIdentidad("12121112");
////        c1.setNombre("Luis Mario");
//        
//        Zona z1 = new Zona();
//        z1.setDescuento(10.2);
//        z1.setNombre("Norte");
//        DAOZona dAOZona = new DAOZona();
//        dAOZona.guardar(z1);
//        DAOCliente dAOCliente = new DAOCliente();
//        dAOCliente.guardar(c1);
//        System.out.println(dAOCliente.getList());
        
        
    }
    
}
