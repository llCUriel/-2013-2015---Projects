
package preguntas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen {

    private static void IMPRIMIR(String LINK, JLabel X) {

        Image ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(LINK).getScaledInstance(X.getWidth(), X.getHeight(), 0);

        ImageIcon ImagenEscalada = new ImageIcon(ImagenSeleccionada);
        X.setIcon(ImagenEscalada);

    }
    public static void PRUEBA(String T1, JLabel T){
    
    IMPRIMIR(T1, T);
    }
}
