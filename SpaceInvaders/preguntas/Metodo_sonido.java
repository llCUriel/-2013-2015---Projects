package preguntas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Metodo_sonido {

    public static void ESCUCHAR(String Liga) {
        try {
            InputStream in = new FileInputStream(Liga);
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);
        } catch (IOException e) {
        }
    }
}
