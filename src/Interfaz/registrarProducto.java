package Interfaz;

import Logica.transaccionProducto;
import Modelos.Producto;
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
public final class registrarProducto extends javax.swing.JFrame {

    public registrarProducto() {
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
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jProducto = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jDescripcion = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jUbicacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar3.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar3.setRollover(true);

        jLabel36.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel36);

        jLabel39.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel39);

        jLabel41.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar3.add(jLabel41);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("GungsuhChe", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setToolTipText("");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton3);

        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText(".......");
        jToolBar3.add(jLabel14);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("GungsuhChe", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modificar.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.setToolTipText("");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton4);

        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText(".......");
        jToolBar3.add(jLabel15);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("GungsuhChe", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.setToolTipText("");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton5);

        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setText(".......");
        jToolBar3.add(jLabel16);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("GungsuhChe", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/limpiar.png"))); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.setToolTipText("");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton6);

        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText(".......");
        jToolBar3.add(jLabel17);

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
        jLabel29.setText("Codigo");

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
        jLabel30.setText("Nombre");

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

        jLabel32.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel32.setText("Categoria");

        jTipo.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fontaneria", "Carpinteria", "Construccion", "Electronica", "Mecanica" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registro producto.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel31.setText("Descripcion");

        jDescripcion.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDescripcionMouseClicked(evt);
            }
        });
        jDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDescripcionActionPerformed(evt);
            }
        });
        jDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDescripcionKeyPressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel33.setText("Precio");

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

        jLabel34.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel34.setText("Ubicacion");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jProducto.getText();
        if ("".equals(jProducto.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                transaccionProducto service = new transaccionProducto();
                if (service.findByIdProducto(id) == null) {
                    Producto emp;
                    emp = enviarDatos();
                    service.createProducto(emp);
                } else {
                    JOptionPane.showMessageDialog(null, "EL empleado: " + id + " no se registro");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = jProducto.getText();
        if ("".equals(jProducto.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Producto pro;
                pro = enviarDatos();
                transaccionProducto service = new transaccionProducto();
                service.updateProducto(id, pro);
            } catch (SQLException ex) {
                Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String id = jProducto.getText();
            transaccionProducto service = new transaccionProducto();
            service.deleteProducto(id);
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String id = jProducto.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Producto pro;
                transaccionProducto service = new transaccionProducto();
                pro = service.findByIdProducto(id);
                if (pro != null) {
                    setearBusqueda(pro);
                } else {
                    JOptionPane.showMessageDialog(null, "El producto: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductoMouseClicked
        // TODO add your handling code here:
        setearCodigo();
    }//GEN-LAST:event_jProductoMouseClicked

    private void jProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProductoActionPerformed

    private void jProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jProductoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jProducto.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                try {
                    Producto pro;
                    transaccionProducto service = new transaccionProducto();
                    pro = service.findByIdProducto(id);
                    if (pro != null) {
                        setearBusqueda(pro);
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto: " + id + " no existe");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
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

    private void jDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDescripcionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescripcionMouseClicked

    private void jDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescripcionActionPerformed

    private void jDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDescripcionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescripcionKeyPressed

    private void jPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrecioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioMouseClicked

    private void jPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioActionPerformed

    private void jPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrecioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioKeyPressed

    private void jUbicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUbicacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jUbicacionMouseClicked

    private void jUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUbicacionActionPerformed

    private void jUbicacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUbicacionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUbicacionKeyPressed

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
            java.util.logging.Logger.getLogger(registrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registrarProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JTextField jDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JTextField jProducto;
    private javax.swing.JComboBox<String> jTipo;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTextField jUbicacion;
    // End of variables declaration//GEN-END:variables

    public Producto enviarDatos() {
        Producto emp;
        String idProducto = jProducto.getText();
        String nombre = jNombre.getText();
        String descripcion = jDescripcion.getText();
        int numero = setearnumero();
        String Tipo = jTipo.getSelectedItem().toString();
        float precio = Float.parseFloat(jPrecio.getText());
        String ubicacion = jUbicacion.getText();
        emp = new Producto(idProducto, Tipo, nombre, descripcion, precio, ubicacion, numero);
        return emp;
    }

    public void limpiar() {
        jProducto.setText("");
        jNombre.setText("");
        jDescripcion.setText("");
        jPrecio.setText("");
        jUbicacion.setText("");
    }

    public void setearBusqueda(Producto pro) {
        jNombre.setText(pro.getNombre());
        jProducto.setText(pro.getIdProducto());
        jTipo.setSelectedItem(pro.getCategotia());
        jNombre.setText(pro.getNombre());
        jDescripcion.setText(pro.getDescripcion());
        jPrecio.setText(Float.toString(pro.getPrecio()));
        jUbicacion.setText(pro.getUbicacion());
    }

    public int setearnumero() {
        try {
            int numero;
            transaccionProducto service = new transaccionProducto();
            ArrayList<Producto> depts;
            depts = (ArrayList<Producto>) service.findAllProductos();
            if (depts.isEmpty()) {
                numero = 1;
            } else {
                numero = depts.size() + 1;
            }
            return numero;
        } catch (SQLException ex) {
            Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public void setearCodigo() {
        String tipo = jTipo.getSelectedItem().toString();
        transaccionProducto service = new transaccionProducto();
        ArrayList<Producto> depts;
        depts = (ArrayList<Producto>) service.obtenerUltimoProductobyCategoria(tipo);
        if (depts.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registro, Ingrese uno nuevo");
            String code = obtenerTipo();
            jProducto.setText(code);
        } else {
            Producto p = depts.get(0); 
            jProducto.setText(p.getIdProducto());
        }
    }
    
    private String obtenerTipo() {
        String doctor = jTipo.getSelectedItem().toString();
        String doc = null;
        if (null != doctor) {
            switch (doctor) {
                case "Fontaneria":
                    doc = "FN";
                    break;
                case "Carpinteria":
                    doc = "CP";
                    break;
                case "Construccion":
                    doc = "CT";
                    break;
                case "Electronica":
                    doc = "EL";
                    break;
                case "Mecanica":
                    doc = "MC";
                    break;
                default:
                    break;
            }
        }
        return doc;
    }

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
