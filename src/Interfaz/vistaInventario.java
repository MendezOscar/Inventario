package Interfaz;

import Logica.transaccionInventario;
import Logica.transaccionProducto;
import Logica.transaccionSalida;
import Modelos.Inventarios;
import Modelos.Producto;
import Modelos.Salida;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public final class vistaInventario extends javax.swing.JFrame {

    public vistaInventario() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar3 = new javax.swing.JToolBar();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jProducto = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jCantidad = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jInventario = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jUbicacion = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar3.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar3.setRollover(true);

        jLabel36.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel36);

        jLabel39.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel39);

        jLabel41.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel41);

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText(".......");
        jToolBar3.add(jLabel14);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("GungsuhChe", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        jButton7.setText("Buscar");
        jButton7.setToolTipText("");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton7);

        jLabel29.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel29.setText("Codigo de Producto");

        jProducto.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductoMouseClicked(evt);
            }
        });
        jProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductoActionPerformed(evt);
            }
        });
        jProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jProductoKeyPressed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel30.setText("Producto");

        jNombre.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNombreMouseClicked(evt);
            }
        });
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNombreKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registro producto.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel34.setText("Cantidad");

        jCantidad.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCantidadMouseClicked(evt);
            }
        });
        jCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCantidadActionPerformed(evt);
            }
        });
        jCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCantidadKeyPressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel32.setText("Codigo inventario");

        jInventario.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInventarioMouseClicked(evt);
            }
        });
        jInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInventarioActionPerformed(evt);
            }
        });
        jInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jInventarioKeyPressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel35.setText("Ubicacion");

        jUbicacion.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jUbicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUbicacionMouseClicked(evt);
            }
        });
        jUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUbicacionActionPerformed(evt);
            }
        });
        jUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUbicacionKeyPressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel37.setText("Precio");

        jPrecio.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPrecioMouseClicked(evt);
            }
        });
        jPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecioActionPerformed(evt);
            }
        });
        jPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPrecioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUbicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(18, 18, 18)
                                        .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String id = jInventario.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Inventarios inv;
                transaccionInventario service = new transaccionInventario();
                inv = service.findByIdInventario(id);
                if (inv != null) {
                    setearBusqueda(inv);
                    buscarProducto();
                } else {
                    JOptionPane.showMessageDialog(null, "El producto: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(vistaInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductoMouseClicked

    }//GEN-LAST:event_jProductoMouseClicked

    private void jProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProductoActionPerformed

    private void jProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jProductoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jProductoKeyPressed

    private void jNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreMouseClicked

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreKeyPressed

    private void jCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadMouseClicked

    private void jCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadActionPerformed

    private void jCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadKeyPressed

    private void jInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInventarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jInventarioMouseClicked

    private void jInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInventarioActionPerformed

    private void jInventarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInventarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jInventario.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                try {
                    Inventarios inv;
                    transaccionInventario service = new transaccionInventario();
                    inv = service.findByIdInventario(id);
                    if (inv != null) {
                        setearBusqueda(inv);
                        buscarProducto();
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto: " + id + " no existe");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(vistaInventario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jInventarioKeyPressed

    private void jUbicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUbicacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jUbicacionMouseClicked

    private void jUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUbicacionActionPerformed

    private void jUbicacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUbicacionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUbicacionKeyPressed

    private void jPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrecioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioMouseClicked

    private void jPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioActionPerformed

    private void jPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrecioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new vistaInventario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JTextField jCantidad;
    private javax.swing.JTextField jInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JTextField jProducto;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTextField jUbicacion;
    // End of variables declaration//GEN-END:variables

    public Inventarios enviarDatos() {
        Inventarios inv;
        String idInventario = jInventario.getText();
        String idProducto = jProducto.getText();
        String nombre = jNombre.getText();
        int numero = setearnumero();
        float cantidad = Float.parseFloat(jCantidad.getText());
        inv = new Inventarios(idInventario, idProducto, nombre, cantidad, numero);
        return inv;
    }

    public void limpiar() {
        jProducto.setText("");
        jNombre.setText("");
        jCantidad.setText("");
        jInventario.setText("");
    }

    public void setearBusqueda(Inventarios inv) {
        jNombre.setText(inv.getProducto());
        jProducto.setText(inv.getIdProducto());
        jCantidad.setText(Float.toString(inv.getExistencia()));
        jInventario.setText(inv.getIdInventario());
    }

    public int setearnumero() {
        try {
            int numero;
            transaccionSalida service = new transaccionSalida();
            ArrayList<Salida> depts;
            depts = (ArrayList<Salida>) service.findAllEntrada();
            if (depts.isEmpty()) {
                numero = 1;
            } else {
                numero = depts.size() + 1;
            }
            return numero;
        } catch (SQLException ex) {
            Logger.getLogger(vistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buscarProducto(){
        try {
            String idProducto = jProducto.getText();
            transaccionProducto service = new transaccionProducto();
            Producto pro = service.findByIdProducto(idProducto);
            jUbicacion.setText(pro.getUbicacion());
            jPrecio.setText(Float.toString(pro.getPrecio()));
        } catch (SQLException ex) {
            Logger.getLogger(vistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
