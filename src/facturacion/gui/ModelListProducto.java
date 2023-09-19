/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.gui;

import facturacion.dao.DAOProducto;
import facturacion.model.Producto;
import javax.swing.DefaultListModel;

/**
 *
 * @author SONY VAIO
 */
public class ModelListProducto extends DefaultListModel<Producto> {
    
    public ModelListProducto(){
        DAOProducto dAOProducto = new DAOProducto();
        addAll(dAOProducto.getList());
    }
}
