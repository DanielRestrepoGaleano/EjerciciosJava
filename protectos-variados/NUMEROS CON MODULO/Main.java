import java.util.Scanner;

class Nodo {  
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class Lista { 
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    // funcion para formar una lista con los dígitos del número dado
    public void formarListaConDigitos(int numero) {
        if (numero == 0) {
            insertar(0);
        } else {
            while (numero > 0) {
                int digito = numero % 10; 
                insertar(digito); 
                numero = numero / 10; 
            }
        }
    }

    // funcion para insertar un dato al inicio de la lista
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato); 
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // funcion para mostrar la lista
    public void mostrarLista() {  
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        // Forma la lista con los dígitos del número
        lista.formarListaConDigitos(numero);

        // Muestra la lista formada
        System.out.println("Lista formada con los dígitos del número:");
        lista.mostrarLista();

    }
}
// hecho por daniel restrepo galeano para la clase de estructura de datos (Uniremington)
