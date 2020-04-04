
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JOptionPaneShowInputDialogExample1 {

    public static void main(String[] args) {
        try {
            muestraContenido("src/Ficheros/puntajes.txt");
        } catch (IOException ex) {
            Logger.getLogger(JOptionPaneShowInputDialogExample1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
      String cadena;
      int u =0;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          u++;
          System.out.println(cadena);
          System.out.println(u+"\n");
      }
      b.close();
}
}
