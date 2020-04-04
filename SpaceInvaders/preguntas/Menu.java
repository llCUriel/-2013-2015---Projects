package preguntas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Menu extends javax.swing.JInternalFrame {

    int tmp = 0;
    public static String name = "";

    public Menu() {
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null); //retirar o painel superior
        this.setBorder(null);//retirar bordas
        initComponents();

    }

    public static void sound() {
        Metodo_sonido.ESCUCHAR("src/Sonido/Boton.wav");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        Planet = new javax.swing.JLabel();
        Nave_p1 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        Decoracion = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven5 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven6 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven7 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();

        javax.swing.GroupLayout DecoracionLayout = new javax.swing.GroupLayout(Decoracion);
        Decoracion.setLayout(DecoracionLayout);
        DecoracionLayout.setHorizontalGroup(
            DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DecoracionLayout.setVerticalGroup(
            DecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        buttonSeven3.setBackground(new java.awt.Color(0, 0, 0));
        buttonSeven3.setText("INSTRUCCIONES");
        buttonSeven3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSeven3MouseEntered(evt);
            }
        });
        buttonSeven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven3ActionPerformed(evt);
            }
        });

        buttonSeven2.setBackground(new java.awt.Color(0, 0, 0));
        buttonSeven2.setText("PUNTAJES");
        buttonSeven2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSeven2MouseEntered(evt);
            }
        });
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });

        buttonSeven5.setBackground(new java.awt.Color(0, 0, 0));
        buttonSeven5.setText("GENERAR PARTICIPANTE");
        buttonSeven5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSeven5MouseEntered(evt);
            }
        });
        buttonSeven5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven5ActionPerformed(evt);
            }
        });

        buttonSeven6.setBackground(new java.awt.Color(0, 0, 0));
        buttonSeven6.setText("AÑADIR PARTICIPANTE");
        buttonSeven6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSeven6MouseEntered(evt);
            }
        });
        buttonSeven6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven6ActionPerformed(evt);
            }
        });

        buttonSeven7.setBackground(new java.awt.Color(0, 0, 0));
        buttonSeven7.setText("AÑADIR PREGUNTA");
        buttonSeven7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSeven7MouseEntered(evt);
            }
        });
        buttonSeven7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven7ActionPerformed(evt);
            }
        });

        buttonSeven1.setBackground(new java.awt.Color(0, 0, 0));
        buttonSeven1.setText("JUGAR");
        buttonSeven1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSeven1MouseEntered(evt);
            }
        });
        buttonSeven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven1ActionPerformed(evt);
            }
        });

        buttonSeven4.setBackground(new java.awt.Color(0, 0, 0));
        buttonSeven4.setText("SALIR");
        buttonSeven4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSeven4MouseEntered(evt);
            }
        });
        buttonSeven4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSeven1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(buttonSeven2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(buttonSeven3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(buttonSeven4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(buttonSeven5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(buttonSeven6, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(buttonSeven7, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeven5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeven6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeven7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Nave_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(Planet, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Decoracion)
                .addContainerGap())
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nave_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Planet, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Decoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSeven1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven1ActionPerformed
        JFrame frame = new JFrame("Nick");
        name = JOptionPane.showInputDialog(frame, "Ingresa tu nick, por favor.");

        if (name.equalsIgnoreCase("")) {
            name = "Sin nombre.";
        }

        Cuestionario.Cora1.setVisible(true);
        Cuestionario.Cora2.setVisible(true);
        Cuestionario.Cora3.setVisible(true);
        Cuestionario.Nivel.setVisible(true);
        Cuestionario.Num.setVisible(true);

        if (tmp != 1) {
            Cuestionario.MostrarJuego();
            tmp = 0;
        } else {
            Juego.reiniciar();
        }

    }//GEN-LAST:event_buttonSeven1ActionPerformed

    private void buttonSeven1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeven1MouseEntered
        sound();
    }//GEN-LAST:event_buttonSeven1MouseEntered

    private void buttonSeven2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeven2MouseEntered
        sound();

    }//GEN-LAST:event_buttonSeven2MouseEntered

    private void buttonSeven3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeven3MouseEntered
        sound();

    }//GEN-LAST:event_buttonSeven3MouseEntered

    private void buttonSeven5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeven5MouseEntered
        sound();

    }//GEN-LAST:event_buttonSeven5MouseEntered

    private void buttonSeven4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeven4MouseEntered
        sound();

    }//GEN-LAST:event_buttonSeven4MouseEntered

    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed
        try {
            Puntajes v1 = new Puntajes();
            Cuestionario.Tarjetas.add(v1);
            v1.show();        // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSeven2ActionPerformed

    private void buttonSeven6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeven6MouseEntered
        sound();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSeven6MouseEntered

    private void buttonSeven7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeven7MouseEntered
        sound();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSeven7MouseEntered

    private void buttonSeven7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven7ActionPerformed
        try {
            A_preguntas v1 = new A_preguntas();
            Cuestionario.Tarjetas.add(v1);
            v1.show();         // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSeven7ActionPerformed

    private void buttonSeven6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven6ActionPerformed
        try {
            A_participante v1 = new A_participante();
            Cuestionario.Tarjetas.add(v1);
            v1.show();          // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSeven6ActionPerformed

    private void buttonSeven5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven5ActionPerformed
        try {
            G_participante v1 = new G_participante();
            Cuestionario.Tarjetas.add(v1);
            v1.show();           // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSeven5ActionPerformed

    private void buttonSeven4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven4ActionPerformed
       
    }//GEN-LAST:event_buttonSeven4ActionPerformed

    private void buttonSeven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven3ActionPerformed
        try {
            Instrucciones v1 = new Instrucciones();
            Cuestionario.Tarjetas.add(v1);
            v1.show();        // TODO add your handling code here:        // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSeven3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Decoracion;
    public static javax.swing.JLabel Nave_p1;
    public static javax.swing.JLabel Planet;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven5;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven6;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven7;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    public static javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
