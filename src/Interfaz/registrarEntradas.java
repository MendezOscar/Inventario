package Interfaz;

import Logica.transaccionEntrada;
import Logica.transaccionProducto;
import Logica.transaccionProveedor;
import Modelos.Entrada;
import Modelos.Producto;
import Modelos.Proveedor;
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
public final class registrarEntradas extends javax.swing.JFrame {

    public registrarEntradas() {
        initComponents();
        setIcon();
        llenarCajero();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jFecha = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jEntrada = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jCantidad = new javax.swing.JTextField();
        jProveedor = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jFactura = new javax.swing.JTextField();

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

        jLabel31.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel31.setText("Fecha");

        jFecha.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFechaMouseClicked(evt);
            }
        });
        jFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFechaActionPerformed(evt);
            }
        });
        jFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFechaKeyPressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel33.setText("Codigo de entrada");

        jEntrada.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEntradaMouseClicked(evt);
            }
        });
        jEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntradaActionPerformed(evt);
            }
        });
        jEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEntradaKeyPressed(evt);
            }
        });

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

        jProveedor.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel32.setText("Proveedor");

        jLabel35.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel35.setText("Factura");

        jFactura.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFacturaMouseClicked(evt);
            }
        });
        jFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFacturaActionPerformed(evt);
            }
        });
        jFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFacturaKeyPressed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jEntrada.getText();
        if ("".equals(jEntrada.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                transaccionEntrada service = new transaccionEntrada();
                if (service.findByIdEntrada(id) == null) {
                    Entrada ent;
                    ent = enviarDatos();
                    service.createEntrada(ent);
                } else {
                    JOptionPane.showMessageDialog(null, "EL empleado: " + id + " no se registro");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEntradas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = jEntrada.getText();
        if ("".equals(jEntrada.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Entrada ent;
                ent = enviarDatos();
                transaccionEntrada service = new transaccionEntrada();
                service.updateEntrada(id, ent);
            } catch (SQLException ex) {
                Logger.getLogger(registrarEntradas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String id = jEntrada.getText();
            transaccionEntrada service = new transaccionEntrada();
            service.deleteEntrada(id);
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(registrarEntradas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String id = jEntrada.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Entrada ent;
                transaccionEntrada service = new transaccionEntrada();
                ent = service.findByIdEntrada(id);
                if (ent != null) {
                    setearBusqueda(ent);
                } else {
                    JOptionPane.showMessageDialog(null, "El producto: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarEntradas.class.getName()).log(Level.SEVERE, null, ex);
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
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             setearCodigo();
             setearProducto();
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

    private void jFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaMouseClicked

    private void jFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaActionPerformed

    private void jFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaKeyPressed

    private void jEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEntradaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jEntradaMouseClicked

    private void jEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEntradaActionPerformed

    private void jEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEntradaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jEntrada.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                try {
                    Entrada ent;
                    transaccionEntrada service = new transaccionEntrada();
                    ent = service.findByIdEntrada(id);
                    if (ent != null) {
                        setearBusqueda(ent);
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto: " + id + " no existe");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(registrarEntradas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jEntradaKeyPressed

    private void jCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadMouseClicked

    private void jCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadActionPerformed

    private void jCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantidadKeyPressed

    private void jFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFacturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFacturaMouseClicked

    private void jFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFacturaActionPerformed

    private void jFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFacturaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFacturaKeyPressed

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
            java.util.logging.Logger.getLogger(registrarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registrarEntradas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JTextField jCantidad;
    private javax.swing.JTextField jEntrada;
    private javax.swing.JTextField jFactura;
    private javax.swing.JTextField jFecha;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jProducto;
    private javax.swing.JComboBox<String> jProveedor;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables

    public Entrada enviarDatos() {
        Entrada emp;
        String idEntrada = jEntrada.getText();
        String Fecha = jFecha.getText();
        String idProducto = jProducto.getText();
        String nombre = jNombre.getText();
        String descripcion = jFecha.getText();
        int numero = setearnumero();
        String factura = jFactura.getText();
        String proveedor = jProveedor.getSelectedItem().toString();
        float cantidad = Float.parseFloat(jCantidad.getText());
        emp = new Entrada(idEntrada, Fecha, idProducto, nombre, cantidad, factura, proveedor, numero);
        return emp;
    }

    public void limpiar() {
        jProducto.setText("");
        jNombre.setText("");
        jFecha.setText("");
        jEntrada.setText("");
        jCantidad.setText("");
        jFactura.setText("");
    }

    public void setearBusqueda(Entrada ent) {
        jNombre.setText(ent.getProducto());
        jProducto.setText(ent.getIdProducto());
        jProveedor.setSelectedItem(ent.getProveedor());
        jFactura.setText(ent.getFactura());
        jFecha.setText(ent.getFecha());
        jCantidad.setText(Float.toString(ent.getCantidad()));
    }

    public int setearnumero() {
        try {
            int numero;
            transaccionEntrada service = new transaccionEntrada();
            ArrayList<Entrada> depts;
            depts = (ArrayList<Entrada>) service.findAllEntrada();
            if (depts.isEmpty()) {
                numero = 1;
            } else {
                numero = depts.size() + 1;
            }
            return numero;
        } catch (SQLException ex) {
            Logger.getLogger(registrarEntradas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void setearCodigo() {
        String idEntrada;
        String idProducto = jProducto.getText();
        idEntrada = idProducto + "-" + "ENT" + "-" + setearnumero();
        jEntrada.setText(idEntrada);
    }

    public void setearProducto() {
        String id = jProducto.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Producto pro;
                transaccionProducto service = new transaccionProducto();
                pro = service.findByIdProducto(id);
                if (pro != null) {
                    setearProducto(pro);
                } else {
                    JOptionPane.showMessageDialog(null, "El producto: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void llenarCajero() {
        try {
            transaccionProveedor service = new transaccionProveedor();
            ArrayList<Proveedor> depts;
            depts = (ArrayList<Proveedor>) service.findAllProveedor();
            if (depts.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen cajeros");
            } else {
                for (int x = 0; x < depts.size(); x++) {
                    Proveedor caj = depts.get(x);
                    jProveedor.addItem(caj.getNombre());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(registrarEntradas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setearProducto(Producto pro) {
        jNombre.setText(pro.getNombre());
    }

}
