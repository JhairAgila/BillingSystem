/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.gui;

import facturacion.dao.DAOPedido;
import facturacion.dao.DAOProducto;
import facturacion.dao.DAOZona;
import facturacion.model.Pedido;
import facturacion.model.Producto;
import facturacion.model.Zona;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY VAIO
 */

public class ModelTableProducto extends DefaultTableModel{
    
    private DAOPedido dAOPedido;
    private DAOProducto dAOProducto;
    private DecimalFormat df;
    
    public ModelTableProducto() {
        dAOPedido = new DAOPedido();
        dAOProducto = new DAOProducto();
        df = new DecimalFormat("#.00");
        addColumn("Id");
        addColumn("Descripcion");
        addColumn("Precio Unitario");
        addColumn("Cantidad");
    }
    
    private void cargar(){
        List<Pedido> pedidoListaDB = dAOPedido.getList();
        for(Pedido pedido : pedidoListaDB){
            addRow(new Object[]{
               pedido.getId(),
               pedido.getDescripcion(),
               pedido.getPrecioUnitario(),
               pedido.getCantidad()
            });
        }
    }

    public void agregarPedido(Pedido pedido){
        dAOPedido.guardar(pedido);
        addRow(new Object[]{
           pedido.getId(),
           pedido.getDescripcion(),
           pedido.getPrecioUnitario(),
           pedido.getCantidad()
        });
    }
    
    public void eliminarPedido(int fila){
        if(fila >= 0 ){
            Pedido p = (Pedido) dAOPedido.getList().get(fila);
            dAOPedido.eliminar(p);
            removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }
    }
    
    public void realizarCompra(){
        List<Producto> productoListaBD =  dAOProducto.getList();
        int comprobacion = 0;
        List<Pedido> pedidoListaDB = dAOPedido.getList();
        for(Pedido pedido : pedidoListaDB){ // listaTemporal
            String indexDescripcion = pedido.getDescripcion(); //id
            for(Producto pedidoAnalizar : productoListaBD){ // list DB
                if(indexDescripcion.equals( pedidoAnalizar.getDescripcion())){
                    if(pedidoAnalizar.getStock()> 0 ){
                        if(pedidoAnalizar.getStock()>= pedido.getCantidad()){
                            if(comprobacion == 0){
                                obtenerProductoDescuentoOIncremento();
                                comprobacion=1;
                            }
                            int stockActualizar = pedidoAnalizar.getStock()- pedido.getCantidad();
                            System.out.println("Stock  " +  stockActualizar);
                            pedidoAnalizar.setStock(stockActualizar);
                            dAOProducto.guardarOActualizar(pedidoAnalizar);
                        }else{
                            JOptionPane.showConfirmDialog(null, "No hay cantidades suficientes ( " + pedidoAnalizar.getStock()+ " unidades existentes)");
                            }  
                    }else{
                        JOptionPane.showConfirmDialog( null, "No hay unidades en stock del producto" + pedido.getDescripcion() );
                    }
                }
            }
        }
    }
    
    public void obtenerProductoDescuentoOIncremento(){
        double porcentajeIncrementoOdescuento = 0;
        DAOZona daoZona = new DAOZona();
        List<Zona> zonaLista = daoZona.getList();
        List<Pedido> pedidoListaDB = dAOPedido.getList();
        for(Zona zona : zonaLista){
            for( Pedido pedido : pedidoListaDB){
               if(pedido.getDireccion().equals(zona.getNombre())){
                    if(zona.getDescuento() != 0){
                        porcentajeIncrementoOdescuento = zona.getDescuento();
                    }else{
                        porcentajeIncrementoOdescuento = zona.getIncremento();
                    }
                    pedido.setPrecioUnitario((1 - porcentajeIncrementoOdescuento ) * pedido.getPrecioUnitario());
                    System.out.println("PercioUnitario : " + df.format( pedido.getPrecioUnitario()));
               }
                
            }
        } 
    }

    public DAOPedido getdAOPedido() {
        return dAOPedido;
    }

    public void setdAOPedido(DAOPedido dAOPedido) {
        this.dAOPedido = dAOPedido;
    }

   
}
