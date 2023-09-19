/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.gui;

import facturacion.dao.DAOCliente;
import facturacion.model.Cliente;
import javax.swing.DefaultListModel;

/**
 *
 * @author SONY VAIO
 */
public class ModelListCliente extends DefaultListModel<Cliente> {
    public ModelListCliente(){
        DAOCliente dAOCliente = new DAOCliente();
        addAll(dAOCliente.getList());
    }
}
