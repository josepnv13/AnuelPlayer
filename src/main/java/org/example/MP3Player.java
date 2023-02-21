package org.example;

import java.io.FileInputStream;
import java.io.InputStream;
import javazoom.jl.player.Player;

public class MP3Player {
    public static void main(String[] args) {
        try {
<<<<<<< HEAD
            InputStream fis = new FileInputStream("Bandolera.mp3");
=======
            InputStream fis = new FileInputStream("ruta/al/archivo.mp3");
>>>>>>> Initial commit
            Player player = new Player(fis);
            player.play();
        } catch (Exception e) {
            System.out.println("Error al reproducir el archivo: " + e.getMessage());
        }
    }
}