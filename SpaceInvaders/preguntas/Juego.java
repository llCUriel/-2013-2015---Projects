package preguntas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static preguntas.Cuestionario.Cora1;
import static preguntas.Cuestionario.Cora2;
import static preguntas.Cuestionario.Cora3;

public class Juego extends javax.swing.JInternalFrame {

    public static Contador Count_1 = new Contador();
    public static Integer respuesta_correcta = 0, errores = 0, tmp = 0, k = 0;
    public static String Nombre = "";

    public Juego() {

        initComponents();

        respuesta_correcta = ((int) (Math.random() * 4)) + 1;
        try {
            Count_1.start();
        } catch (IllegalThreadStateException e) {
            Count_1.resume();

        }
    }

    Image ImagenSeleccionada2;

    Image buffer;
    Graphics pantallaPrincipal;
    public static Integer posy = -120, ctrl = 0;

    public void paint(Graphics dibujo) {
        buffer = createImage(getWidth(), getHeight());
        pantallaPrincipal = buffer.getGraphics();
        try {
            updatePaint(pantallaPrincipal);
        } catch (IllegalArgumentException e) {
        }
        dibujo.drawImage(buffer, 0, 0, this);

    }

    public static class Contador extends Thread {

        public void run() {
            while (true) {
                try {
                    if (Cuestionario.nivel == 21) {

                        Count_1.suspend();

                    }
                    Thread.sleep(23 - (Cuestionario.nivel));

                    posy++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public static void reiniciar() {
        posy = -120;
        Cuestionario.nivel = 0;
        Cuestionario.Reiniciar_Imagenes();
        errores = 0;
    }

    private void updatePaint(Graphics dibujo) {

        for (int i = 0; i <= 1000; i += 500) {

            dibujo.drawImage(punt("src/Imagenes/space.gif"), i, 0, this);
        }

        dibujo.setColor(Color.blue);

        dibujo.drawImage(punt("src/Imagenes/Nave.png"), 80 + ctrl, posy, this);

        for (int i = 0; i <= 240 * 4; i += 240) {
            if ((respuesta_correcta - 1) * 240 == i) {
                dibujo.setColor(Color.red);

            } else {
                dibujo.setColor(Color.GRAY);

            }

            switch (i) {

                case 0:
                    dibujo.drawImage(punt("src/Imagenes/Planetas/Planet_1.png"), i + 40, 315, this);

                    break;

                case 240:
                    dibujo.drawImage(punt("src/Imagenes/Planetas/Planet_2.png"), i + 40, 315, this);

                    break;

                case 240 * 2:
                    dibujo.drawImage(punt("src/Imagenes/Planetas/Planet_3.png"), i + 40, 315, this);

                    break;

                case 240 * 3:
                    dibujo.drawImage(punt("src/Imagenes/Planetas/Planet_4.png"), i + 40, 315, this);

                    break;

                case 240 * 4:
                    dibujo.drawImage(punt("src/Imagenes/Planetas/Planet_5.png"), i + 40, 315, this);

                    break;

            }

        }

        if (posy >= 300) {
            if (ctrl == 0 && respuesta_correcta == 1) {
                Bien();
            } else if (ctrl == 240 && respuesta_correcta == 2) {
                Bien();
            } else if (ctrl == 480 && respuesta_correcta == 3) {
                Bien();
            } else if (ctrl == 720 && respuesta_correcta == 4) {
                Bien();
            } else if (ctrl == 960 && respuesta_correcta == 5) {
                Bien();
            }

            if (ctrl == 0 && respuesta_correcta != 1) {
                Mal();
                errores();
            } else if (ctrl == 240 && respuesta_correcta != 2) {
                Mal();
                errores();

            } else if (ctrl == 480 && respuesta_correcta != 3) {
                Mal();
                errores();

            } else if (ctrl == 720 && respuesta_correcta != 4) {
                Mal();
                errores();

            } else if (ctrl == 960 && respuesta_correcta != 5) {
                Mal();
                errores();

            }

            respuesta_correcta = ((int) (Math.random() * 4)) + 1;

            ctrl = ((int) (Math.random() * 4)) * 240;

            posy = -120;

            try {
                Imagen.PRUEBA("src/Imagenes/Niveles/" + Cuestionario.nivel + ".png", Cuestionario.Num);
            } catch (IllegalArgumentException e) {
            }
        }
        repaint();
    }

    public static void ReanudarJuego() {
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

        posy = -120;
        Cuestionario.Nivel.setVisible(true);
        Cuestionario.Num.setVisible(true);
        Juego v = new Juego();
        Cuestionario.Tarjetas.add(v);
        v.show();

    }

    public void errores() {

        switch (errores) {

            case 1:
                Cuestionario.Cora3.setIcon(null);
                break;

            case 2:
                Cuestionario.Cora2.setIcon(null);

                break;

            case 3:

                Cuestionario.Cora1.setIcon(null);

//
                BufferedWriter out = null;
                try {
                    out = new BufferedWriter(new FileWriter("src/Ficheros/puntajes.txt", true));
                    out.write(Menu.name+"|"+Cuestionario.nivel+"\n");
                } catch (IOException e) {
                   
                } finally {
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException ex) {
                        }
                    }
                }
//
                reiniciar();
                Cuestionario.Cora1.setVisible(false);
                Cuestionario.Cora2.setVisible(false);
                Cuestionario.Cora3.setVisible(false);
                Cuestionario.Nivel.setVisible(false);
                Cuestionario.Num.setVisible(false);
                Count_1.suspend();
                Metodo_sonido.ESCUCHAR("src/Sonido/Over.wav");
                Game_over v1 = new Game_over();
                Cuestionario.Tarjetas.add(v1);
                v1.show();

                break;

        }
    }

    public Image punt(String LINK) {

        ImagenSeleccionada2 = Toolkit.getDefaultToolkit().getImage(LINK);

        return ImagenSeleccionada2;

    }

    public void Bien() {
        Metodo_sonido.ESCUCHAR("src/Sonido/Bien.wav");
        Cuestionario.nivel++;

    }

    public void Mal() {
        Metodo_sonido.ESCUCHAR("src/Sonido/Mal.wav");
        Cuestionario.nivel--;

        if (Cuestionario.nivel <= 0) {
            Cuestionario.nivel = 0;
        }

        errores++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1264, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

        if (evt.getKeyCode() == 39) {
            ctrl += 240;
        } else if (evt.getKeyCode() == 37) {
            ctrl -= 240;

        } else if (evt.getKeyCode() == 13) {
            Count_1.suspend();
            Cuestionario.MostrarPausa();

        } else if (evt.getKeyCode() == 27) {
            Pausa v1 = new Pausa();
            Cuestionario.Tarjetas.add(v1);
            v1.show();
        }

    }//GEN-LAST:event_jButton1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
