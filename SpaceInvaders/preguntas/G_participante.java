package preguntas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class G_participante extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    LinkedList y = new LinkedList();
    aleatorio u = new aleatorio();
    int ctrl = 0, auto = 0;

    public G_participante() throws IOException {

        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(null);
        initComponents();
        File fichero = new File("src/Ficheros/aleatorio.txt");
        fichero.delete();

        try {
            String cadena;
            FileReader f = new FileReader("src/Ficheros/nombres.txt");
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                y.add(cadena);
                BufferedWriter out = null;
                try {
                    out = new BufferedWriter(new FileWriter("src/Ficheros/aleatorio.txt", true));
                    out.write(cadena + "\n");
                } catch (IOException e) {
                } finally {
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException ex) {
                        }
                    }
                }
            }
            b.close();
        } catch (IOException ex) {
            Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
        }

        Naves v1 = new Naves();
        Mi.add(v1);
        v1.show();

    }

    public void removeLineFromFile(String lineToRemove) {

        try {

            File inFile = new File("src/Ficheros/aleatorio.txt");

            if (!inFile.isFile()) {
                System.out.println("no hay file");
                return;
            }

            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader("src/Ficheros/aleatorio.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;
            while ((line = br.readLine()) != null) {

                if (!line.trim().equals(lineToRemove)) {

                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();
            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }
            if (!tempFile.renameTo(inFile)) {
                System.out.println("Could not rename file");

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void mensaje(String imagen, int r, int g, int b) {

        Icon guardado;

        guardado = new ImageIcon(imagen);

        new UIManager();

        UIManager.put("OptionPane.background", new ColorUIResource(r, g, b));

        UIManager.put("Panel.background", new ColorUIResource(r, g, b));

        JOptionPane.showMessageDialog(null, "Se acabaron los participantes.", "Fail", JOptionPane.INFORMATION_MESSAGE, guardado);

    }

    public class aleatorio extends Thread {

        public void run() {
            while (true) {
                try {
                    Thread.sleep(100);
                    ctrl++;
                    try {
                        Participante.setText(y.get((int) (Math.random() * y.size())).toString());
                    } catch (IndexOutOfBoundsException e) {
                        mensaje("src/Imagenes/CORRECTO.jpg", 250, 244, 227);
                        File fichero = new File("src/Ficheros/aleatorio.txt");
                        fichero.delete();
                        Cuestionario.MostrarMenu();
                        Cuestionario.retornar();
                        auto = 1;
                        u.suspend();
                    }
                    if (ctrl >= 50) {
                        removeLineFromFile(Participante.getText());
                        u.suspend();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        Mi = new javax.swing.JDesktopPane();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        Participante = new org.edisoncor.gui.label.LabelMetric();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        Man = new javax.swing.JLabel();
        Man1 = new javax.swing.JLabel();

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

        Participante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Participante.setText("-");
        Participante.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        buttonAction2.setText("Generar");
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

        Man.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mano2.png"))); // NOI18N

        Man1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mano.png"))); // NOI18N

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addContainerGap(579, Short.MAX_VALUE)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRect1Layout.createSequentialGroup()
                                .addComponent(Man1)
                                .addGap(18, 18, 18)
                                .addComponent(Participante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Man, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Mi))))
                .addContainerGap())
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Man, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Man1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Participante, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed

        auto = 0;
        Cuestionario.MostrarMenu();
        Cuestionario.retornar();
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void buttonAction1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAction1MouseEntered
        Menu.sound();
    }//GEN-LAST:event_buttonAction1MouseEntered

    private void buttonAction2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAction2MouseEntered

    }//GEN-LAST:event_buttonAction2MouseEntered

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed

        try {
            u.start();
            ctrl = 0;
            y.clear();
            String cadena;
            FileReader f = null;
            try {
                f = new FileReader("src/Ficheros/aleatorio.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader b = new BufferedReader(f);
            try {
                while ((cadena = b.readLine()) != null) {
                    y.add(cadena);
                }
            } catch (IOException ex) {
                Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                b.close();
            } catch (IOException ex) {
                Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IllegalThreadStateException e) {
            u.resume();
            ctrl = 0;

            y.clear();
            String cadena;
            FileReader f = null;
            try {
                f = new FileReader("src/Ficheros/aleatorio.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader b = new BufferedReader(f);
            try {
                while ((cadena = b.readLine()) != null) {
                    y.add(cadena);
                }
            } catch (IOException ex) {
                Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                b.close();
            } catch (IOException ex) {
                Logger.getLogger(G_participante.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (auto != 1 || y.size() == 1) {
            Metodo_sonido.ESCUCHAR("src/Sonido/Tambores.wav");
        }
    }//GEN-LAST:event_buttonAction2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Man;
    private javax.swing.JLabel Man1;
    private javax.swing.JDesktopPane Mi;
    private org.edisoncor.gui.label.LabelMetric Participante;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    // End of variables declaration//GEN-END:variables
}
