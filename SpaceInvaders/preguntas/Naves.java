package preguntas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Naves extends javax.swing.JInternalFrame {

    public Naves() {
        initComponents();
        h.start();
    }
    Image ImagenSeleccionada2;
    Image buffer;
    Graphics pantallaPrincipal;
    Integer x = 0, act = 0, t = 0;
    Mover h = new Mover();

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

        dibujo.drawImage(punt("src/Imagenes/space.gif"), 0, 0, this);
        dibujo.drawImage(punt("src/Imagenes/space.gif"), 500, 0, this);
        dibujo.drawImage(punt("src/Imagenes/space.gif"), 800, 0, this);

        if ((-900 + x >= 900 && -900 + x <= 1400) || x<=500) {
            dibujo.drawImage(punt("src/Imagenes/t_dec.png"), 400, 0, this);
            t++;
        }

        if (-900 + x >= 1300) {
            if (act == 0) {
                x = 0;
                act = 1;
            }
        }
        dibujo.drawImage(punt("src/Imagenes/Nave_dec.png"), (-200 + x), 0, this);
        dibujo.drawImage(punt("src/Imagenes/Nave_dec_2.png"), (-500 + x), 0, this);
        dibujo.drawImage(punt("src/Imagenes/ovni.png"), (-700 + x), 0, this);
        dibujo.drawImage(punt("src/Imagenes/ovni.png"), (-850 + x), 0, this);
        dibujo.drawImage(punt("src/Imagenes/ovni.png"), (-1000 + x), 0, this);

        repaint();

    }

    public class Mover extends Thread {

        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                    x++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Naves.class.getName()).log(Level.SEVERE, null, ex);
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
            .addGap(0, 1228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
