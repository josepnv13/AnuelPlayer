package org.example;

import java.io.FileInputStream;
import java.io.InputStream;
import javazoom.jl.player.Player;

public class MP3Player {
        public static void play() {
            try {
                InputStream fis = new FileInputStream("Bandolera.mp3");
                Player player = new Player(fis);
                System.out.println("ESTA SONANDO EL FCKING DIOS DEL TRAP, LA2BLEA. ANUEL.");
                player.play();

            } catch (Exception e) {
                System.out.println("Error al reproducir el archivo: " + e.getMessage());
            }

        }



}
