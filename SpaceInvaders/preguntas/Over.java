package preguntas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Over extends javax.swing.JInternalFrame {

    public Over() {
        initComponents();

        h h = new h();

        h.start();
    }
    Image ImagenSeleccionada2;
    Image buffer;
    Graphics pantallaPrincipal;
    Integer x = 7, act = 0, t = 0;

    public void paint(Graphics dibujo) {
        buffer = createImage(getWidth(), getHeight());
        pantallaPrincipal = buffer.getGraphics();
        try {
            updatePaint(pantallaPrincipal);
        } catch (IllegalArgumentException e) {
        }
        dibujo.drawImage(buffer, 0, 0, this);

    }

    private void updatePaint(Graphics dibujo) {
        dibujo.setColor(Color.RED);
        dibujo.setColor(Color.black);
        dibujo.fillRect(0, 0, 1000, 1000);
        dibujo.drawImage(punt("src/Imagenes/Planetas/Game_over.gif"), 185, -10, this);
        dibujo.fillRect(850, 0, 1000, 1000);
        dibujo.fillRect(-550, 0, 1000, 1000);
        dibujo.fillRect(1000, 0, 1000, 1000);
        dibujo.drawImage(punt("src/Imagenes/Planetas/Bart.gif"), 0, -50, this);
        dibujo.drawImage(punt("src/Imagenes/Planetas/Bart.gif"), 850, -50, this);
        if (x == 0) {
            dibujo.drawImage(punt("src/Imagenes/Niveles/" + x + ".png"), 590, 240, this);
        } else {
            dibujo.drawImage(punt("src/Imagenes/Niveles/" + x + ".png"), 580, 240, this);
        }
        repaint();
    }

    public class h extends Thread {

        public void run() {
            while (true) {
                try {
                    x--;
                    if (x == -1) {
                        Cuestionario.MostrarMenu();
                        Cuestionario.retornar();                        
                    }
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Over.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Image punt(String LINK) {

        ImagenSeleccionada2 = Toolkit.getDefaultToolkit().getImage(LINK);

        return ImagenSeleccionada2;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
