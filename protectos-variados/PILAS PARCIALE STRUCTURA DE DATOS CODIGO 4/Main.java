import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class Pila {
    Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public void apilar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
        System.out.println("Dato apilado con éxito.");
    }

    public void desapilar() {
        if (cima == null) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Dato desapilado: " + cima.dato);
            cima = cima.siguiente;
        }
    }

    public void mostrarPila() {
        if (cima == null) {
            System.out.println("La pila está vacía.");
            return;
        }
        Nodo actual = cima;
        System.out.println("Contenido de la pila:");
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Apilar dato");
            System.out.println("2. Desapilar dato");
            System.out.println("3. Mostrar pila");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a apilar: ");
                    int dato = scanner.nextInt();
                    pila.apilar(dato);
                    break;
                case 2:
                    pila.desapilar();
                    break;
                case 3:
                    pila.mostrarPila();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
