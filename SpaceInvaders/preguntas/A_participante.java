package preguntas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class A_participante extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    LinkedList t = new LinkedList();

    public A_participante() throws IOException {

        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null); //retirar o painel superior
        this.setBorder(null);//retirar bordas
        initComponents();
        Naves v1 = new Naves();
        Mi.add(v1);
        v1.show();

    }

    public void MostrarDatos() throws IOException {
        int con = 0;

    }

    public void imprimir_modelo() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        Mi = new javax.swing.JDesktopPane();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        Nombre = new org.edisoncor.gui.textField.TextFieldRound();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout MiLayout = new javax.swing.GroupLayout(Mi);
        Mi.setLayout(MiLayout);
        MiLayout.setHorizontalGroup(
            MiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MiLayout.setVerticalGroup(
            MiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        buttonAction1.setText("Regresar");
        buttonAction1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAction1MouseEntered(evt);
            }
        });
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        labelMetric2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric2.setText("NOMBRE :");

        labelMetric3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric3.setText("AÑADIR PARTICIPANTE");

        buttonAction2.setText("Guardar");
        buttonAction2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAction2MouseEntered(evt);
            }
        });
        buttonAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(Mi)
                        .addContainerGap())
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetric3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 329, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed

        if (Nombre.getText().equals("")) {
            Metodo_sonido.ESCUCHAR("src/Sonido/Error.wav");

        } else {
            BufferedWriter out = null;
            try {

                out = new BufferedWriter(new FileWriter("src/Ficheros/nombres.txt", true));
                out.write(Nombre.getText()+"\n");
                Metodo_sonido.ESCUCHAR("src/Sonido/Sleep.wav");

            } catch (IOException e) {

            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException ex) {
                    }
                }
            }
            
            Nombre.setText("");
        }
    }//GEN-LAST:event_buttonAction2ActionPerformed

    private void buttonAction2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAction2MouseEntered
        Menu.sound();
    }//GEN-LAST:event_buttonAction2MouseEntered

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        Cuestionario.MostrarMenu();
        Cuestionario.retornar();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void buttonAction1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAction1MouseEntered
        Menu.sound();
    }//GEN-LAST:event_buttonAction1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Mi;
    private org.edisoncor.gui.textField.TextFieldRound Nombre;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private javax.swing.JLabel jLabel2;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    // End of variables declaration//GEN-END:variables
}
