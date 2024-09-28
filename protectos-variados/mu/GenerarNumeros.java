import java.util.Random;
import java.util.ArrayList;

public class GenerarNumeros {

    private int numeroRandom, a;
    private ArrayList<String> jugadores = new ArrayList<>();
    private ArrayList<Integer> elecciones = new ArrayList<>();

    public int getNumeroRandom() {
        return numeroRandom;
    }

    public void setNumeroRandom(int numeroRandom) {
        this.numeroRandom = numeroRandom;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void addJugador(String jugador) {
        this.jugadores.add(jugador);
        this.elecciones.add(null); // Añadir un valor inicial para el jugador en la lista de elecciones
    }

    public void calcular() {
        if (getA() > 0) {
            Random rnd = new Random();
            setNumeroRandom(rnd.nextInt(getA()) + 1);
        }
    }

    public void setEleccion(int jugadorIndex, int eleccion) {
        if (jugadorIndex >= 0 && jugadorIndex < elecciones.size()) {
            this.elecciones.set(jugadorIndex, eleccion);
        }
    }

    public boolean verificarGanador() {
        boolean hayGanador = false;
        for (int i = 0; i < jugadores.size(); i++) {
            if (elecciones.get(i) != null && elecciones.get(i) == numeroRandom) {
                System.out.println("¡El jugador " + jugadores.get(i) + " ha ganado! ");
                hayGanador = true;
            }
        }
        if (!hayGanador) {
            System.out.println("Nadie ha adivinado el número.");
        }
        return hayGanador;
    }



    @Override
    public String toString() {
       
       
        return "El número random era: " + numeroRandom + ", La cantidad de numeros fue: " + a + " con el número " + elecciones   + "]";
        
        
    }

}
