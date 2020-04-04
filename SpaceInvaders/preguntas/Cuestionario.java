package preguntas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cuestionario extends javax.swing.JFrame implements Runnable {

    public static Integer x = 11, nivel = 0;
    public static Contador Count = new Contador();
    private int x1 = 570, y = 720, velocidad = 90;

    public Cuestionario() {

        initComponents();
        this.setSize(x, y);
        this.setLocationRelativeTo(null);

        File fichero = new File("src/Ficheros/aleatorio.txt");
        fichero.delete();
        MostrarMenu();
        Reiniciar_Imagenes();
        retornar();

        Imagen.PRUEBA("src/Imagenes/heart.png", Cora1);
        Imagen.PRUEBA("src/Imagenes/heart.png", Cora2);
        Imagen.PRUEBA("src/Imagenes/heart.png", Cora3);
        Imagen.PRUEBA("src/Imagenes/Burro.gif", Burro);
        Imagen.PRUEBA("src/Imagenes/Burro.gif", Burro1);
        Imagen.PRUEBA("src/Imagenes/Escom.png", Escom);
        Imagen.PRUEBA("src/Imagenes/Escom.png", Escom1);

        Count.start();

        this.setLocationRelativeTo(null);
    }

    public static void retornar() {
        Imagen.PRUEBA("src/Imagenes/Nave_p.png", Menu.Nave_p1);
        Imagen.PRUEBA("src/Imagenes/Planet.png", Menu.Planet);
        Imagen.PRUEBA("src/Imagenes/t.png", Menu.t);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("src/Imagenes/icono.png"));
        return retValue;
    }

    public static void Reiniciar_Imagenes() {
        Imagen.PRUEBA("src/Imagenes/Nivel.png", Nivel);
        Imagen.PRUEBA("src/Imagenes/Niveles/0.png", Cuestionario.Num);

        Imagen.PRUEBA("src/Imagenes/heart.png", Cora1);
        Imagen.PRUEBA("src/Imagenes/heart.png", Cora2);
        Imagen.PRUEBA("src/Imagenes/heart.png", Cora3);
    }

    public static void MostrarMenu() {

        Nivel.setVisible(false);
        Num.setVisible(false);
        Cora1.setVisible(false);
        Cora2.setVisible(false);
        Cora3.setVisible(false);

        Menu v = new Menu();
        Tarjetas.add(v);
        v.show();

        Naves v1 = new Naves();
        Menu.Decoracion.add(v1);
        v1.show();
    }

    public static void MostrarPausa() {
        Nivel.setVisible(false);
        Num.setVisible(false);
        Cora1.setVisible(false);
        Cora2.setVisible(false);
        Cora3.setVisible(false);
        Pausa v = new Pausa();
        Tarjetas.add(v);
        v.show();
    }

    public static void MostrarJuego() {
        Nivel.setVisible(true);
        Num.setVisible(true);

        switch (Juego.errores) {
            case 0:
                Cora1.setVisible(true);
                Cora2.setVisible(true);
                Cora3.setVisible(true);
                break;

            case 1:
                Cora1.setVisible(true);
                Cora2.setVisible(true);
                Cora3.setVisible(false);
                break;

            case 2:
                Cora1.setVisible(true);
                Cora2.setVisible(false);
                Cora3.setVisible(false);
                break;

            case 3:
                Cora1.setVisible(false);
                Cora2.setVisible(false);
                Cora3.setVisible(false);
                break;
        }

        Juego v = new Juego();
        Tarjetas.add(v);
        v.show();
    }

    public void run() {
        try {
            this.setVisible(true);

            for (int i = 0; i < 7; i++) {
                Thread.sleep(velocidad);
                this.setSize(x1, y);
                this.setLocationRelativeTo(null);
                x1 = x1 + 130;
                if (x1 == 1400) {

                    for (int j = 0; j < 6; j++) {

                        Thread.sleep(velocidad);
                        this.setSize(x1, y);
                        this.setLocationRelativeTo(null);
                        y = y + 100;
                    }
                }
            }
        } catch (InterruptedException e) {
        }
        //      Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);

//        AWTUtilities.setWindowShape(this, forma);
    }

    public static class Contador extends Thread {

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    x--;
//                    Imagen.PRUEBA("src/Imagenes/" + Integer.toString(x) + ".png", IM2);
                    if (x <= 0) {
                        x = 11;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        basicTableCellenderer1 = new org.edisoncor.gui.table.BasicTableCellenderer();
        Escom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        basicTableCellenderer2 = new org.edisoncor.gui.table.BasicTableCellenderer();
        Burro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Tarjetas = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        Nivel = new javax.swing.JLabel();
        Num = new javax.swing.JLabel();
        Burro1 = new javax.swing.JLabel();
        Escom1 = new javax.swing.JLabel();
        Cora1 = new javax.swing.JLabel();
        Cora2 = new javax.swing.JLabel();
        Cora3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escom.setMaximumSize(new java.awt.Dimension(85, 85));
        Escom.setMinimumSize(new java.awt.Dimension(85, 85));
        Escom.setPreferredSize(new java.awt.Dimension(85, 76));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSTITUTO POLITÉCNICO NACIONAL");

        Burro.setMaximumSize(new java.awt.Dimension(85, 85));
        Burro.setMinimumSize(new java.awt.Dimension(85, 85));
        Burro.setPreferredSize(new java.awt.Dimension(85, 76));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INVASORES DEL ESPACIO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tarjetas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout TarjetasLayout = new javax.swing.GroupLayout(Tarjetas);
        Tarjetas.setLayout(TarjetasLayout);
        TarjetasLayout.setHorizontalGroup(
            TarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1237, Short.MAX_VALUE)
        );
        TarjetasLayout.setVerticalGroup(
            TarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Nivel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Num.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Burro1.setMaximumSize(new java.awt.Dimension(85, 85));
        Burro1.setMinimumSize(new java.awt.Dimension(85, 85));
        Burro1.setPreferredSize(new java.awt.Dimension(85, 76));

        Escom1.setMaximumSize(new java.awt.Dimension(85, 85));
        Escom1.setMinimumSize(new java.awt.Dimension(85, 85));
        Escom1.setPreferredSize(new java.awt.Dimension(85, 76));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 153));
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(0, 51, 153));
        jSeparator2.setOpaque(true);

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basicTableCellenderer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(basicTableCellenderer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cora3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cora2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cora1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                        .addComponent(Escom1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Burro1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Burro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Escom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(basicTableCellenderer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Burro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Escom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelShadow1Layout.createSequentialGroup()
                            .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Burro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Escom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelShadow1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4))
                                .addGroup(panelShadow1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(basicTableCellenderer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Num, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Cora1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Cora2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Cora3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRect1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thread(new Cuestionario()).start();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Burro;
    private javax.swing.JLabel Burro1;
    public static javax.swing.JLabel Cora1;
    public static javax.swing.JLabel Cora2;
    public static javax.swing.JLabel Cora3;
    private javax.swing.JLabel Escom;
    private javax.swing.JLabel Escom1;
    public static javax.swing.JLabel Nivel;
    public static javax.swing.JLabel Num;
    public static javax.swing.JDesktopPane Tarjetas;
    private org.edisoncor.gui.table.BasicTableCellenderer basicTableCellenderer1;
    private org.edisoncor.gui.table.BasicTableCellenderer basicTableCellenderer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
