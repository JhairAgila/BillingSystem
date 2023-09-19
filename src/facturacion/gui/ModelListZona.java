/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.gui;

import facturacion.dao.DAOZona;
import facturacion.model.Zona;
import javax.swing.DefaultListModel;

/**
 *
 * @author SONY VAIO
 */
public class ModelListZona extends DefaultListModel<Zona>{
    public ModelListZona(){
        DAOZona dAOZona = new DAOZona();
        addAll(dAOZona.getList());
    }
}
