/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package facturacion.gui;

import facturacion.model.Zona;

/**
 *
 * @author SONY VAIO
 */
public class PanelZona extends javax.swing.JPanel {

    /**
     * Creates new form PanelZona
     */
    public PanelZona() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modelListZona = new facturacion.gui.ModelListZona();
        jScrollPaneZona = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(284, 266));

        jList1.setModel(modelListZona);
        jScrollPaneZona.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneZona, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneZona, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Zona> jList1;
    private javax.swing.JScrollPane jScrollPaneZona;
    private facturacion.gui.ModelListZona modelListZona;
    // End of variables declaration//GEN-END:variables
}
