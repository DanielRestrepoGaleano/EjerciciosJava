import java.util.Scanner;

public class ejercicioPracDos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño del array");
        int tamano = teclado.nextInt();

        int[] num = new int[tamano];

        rellenarNumeroAleatorioArray(num, 0, 9);
        mostrarArray(num);
    }

    public static void rellenarNumeroAleatorioArray(int[] lista, int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) Math.floor(Math.random() * (b - a + 1) + a);
        }
    }

    public static void mostrarArray(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el índice " + i + " está el valor " + lista[i]);
        }
    }
}
