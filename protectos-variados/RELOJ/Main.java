import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas alarmas deseas poner? ");
        int numAlarmas = scanner.nextInt();

        System.out.print("¿Desde qué hora deseas empezar? (HH:mm) ");
        String horaInicial = scanner.next();
        int hora = Integer.parseInt(horaInicial.split(":")[0]);
        int minuto = Integer.parseInt(horaInicial.split(":")[1]);

        System.out.print("¿Cuál es el intervalo entre alarmas (en minutos)? ");
        int intervalo = scanner.nextInt();

        Timer timer = new Timer();

        // Mostrar la hora del sistema
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        for (int i = 0; i < numAlarmas; i++) {
            int totalMinutos = (hora * 60 + minuto) + (i * intervalo);
            int horaAlarma = totalMinutos / 60;
            int minutoAlarma = totalMinutos % 60;

            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Alarma " + (i + 1) + ": " + String.format("%02d:%02d", horaAlarma, minutoAlarma));
                    // Agregar sonido a la alarma
                    try {
                        File soundFile = new File("alarma.wav"); // Asegúrate de tener este archivo de sonido en el directorio correcto
                        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioIn);
                        clip.start();

                        Thread.sleep(3000); // Duración del sonido (3 segundos)
                        clip.close(); // Cerrar el clip después de la reproducción
                    } catch (Exception e) {
                        System.out.println("Error al reproducir el sonido: " + e.getMessage());
                    }
                }
            };

            timer.schedule(task, (i * intervalo * 60 * 1000));
        }

        scanner.close();
    }
}
