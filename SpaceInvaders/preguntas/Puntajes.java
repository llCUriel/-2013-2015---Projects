package preguntas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Puntajes extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    LinkedList t = new LinkedList();

    public Puntajes() throws IOException {

        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null); //retirar o painel superior
        this.setBorder(null);//retirar bordas
        initComponents();
        imprimir_modelo();
        MostrarDatos();

        Naves v1 = new Naves();
        Mi.add(v1);
        v1.show();
    }

    public void MostrarDatos() throws IOException {
        int con = 0;
        model.insertRow(con, new Object[]{});
        char x[] = null;
        String cadena, cad1 = "", cad2 = "";
        int u = 0;
        FileReader f = new FileReader("src/Ficheros/puntajes.txt");
        BufferedReader b = new BufferedReader(f);

        while ((cadena = b.readLine()) != null) {
            u++;
            x = cadena.toCharArray();
            for (int i = 0; i < x.length; i++) {
                if (x[i] == '|') {
                    for (int j = 0; j < i; j++) {
                        cad1 += x[j];
                    }
                    for (int j = i + 1; j < x.length; j++) {
                        cad2 += x[j];
                    }
                }
            }
            model.setValueAt(u, con, 0);
            model.setValueAt(cad1, con, 1);
            model.setValueAt(cad2, con, 2);
            con++;
            cad1 = "";
            cad2 = "";
        }
        b.close();
    }

    public void imprimir_modelo() {

        String data[][] = {
            {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
            {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}};

        String col[] = {"ID", "NOMBRE", "PUNTAJE"};
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        model = new DefaultTableModel(data, col);
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        Tabla.setModel(model);

        for (int i = 0; i < 3; i++) {
            Tabla.getColumnModel().getColumn(i).setCellRenderer(Alinear);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        Mi = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        Im1 = new javax.swing.JLabel();
        Im2 = new javax.swing.JLabel();

        labelMetric1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric1.setText("PUNTAJES");

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

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

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

        Im1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trophy.png"))); // NOI18N

        Im2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trophy.png"))); // NOI18N

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mi)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Im1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRect1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRect1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(Im2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Im2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Im1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
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

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        Cuestionario.MostrarMenu();
        Cuestionario.retornar();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void buttonAction1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAction1MouseEntered
        Menu.sound();
    }//GEN-LAST:event_buttonAction1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Im1;
    private javax.swing.JLabel Im2;
    private javax.swing.JDesktopPane Mi;
    private javax.swing.JTable Tabla;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    // End of variables declaration//GEN-END:variables
}
