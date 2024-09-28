import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;

    Nodo(int dato) {
        this.dato = dato;
        this.siguiente = this;
        this.anterior = this;
    }
}

class ListaDobleCircular {
    Nodo cabeza;

    ListaDobleCircular() {
        cabeza = new Nodo(-1); // Registro cabeza
        cabeza.siguiente = cabeza;
        cabeza.anterior = cabeza;
    }

    // Insertar un nuevo elemento al final de la lista
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        Nodo ultimo = cabeza.anterior; // Último nodo antes de la cabeza

        nuevoNodo.siguiente = cabeza; // El siguiente del nuevo nodo es la cabeza
        nuevoNodo.anterior = ultimo;  // El anterior es el último nodo de la lista
        ultimo.siguiente = nuevoNodo; // El siguiente del último nodo ahora es el nuevo nodo
        cabeza.anterior = nuevoNodo;  // La cabeza ahora apunta hacia atrás al nuevo nodo
    }

    // Eliminar un elemento por su valor
    public void eliminar(int valor) {
        Nodo actual = cabeza.siguiente;

        while (actual != cabeza) {
            if (actual.dato == valor) {
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("Elemento no encontrado");
    }

    // Buscar un elemento
    public Nodo buscar(int valor) {
        Nodo actual = cabeza.siguiente;

        while (actual != cabeza) {
            if (actual.dato == valor) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Recorrer e imprimir la lista en ambas direcciones
    public void recorrer() {
        Nodo actual = cabeza.siguiente;

        System.out.print("Lista hacia adelante: ");
        while (actual != cabeza) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();

        actual = cabeza.anterior;
        System.out.print("Lista hacia atrás: ");
        while (actual != cabeza) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDobleCircular lista = new ListaDobleCircular();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar");
            System.out.println("4. Recorrer");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar: ");
                    int dato = scanner.nextInt();
                    lista.insertar(dato);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    lista.eliminar(valorEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valorBuscar = scanner.nextInt();
                    Nodo nodoEncontrado = lista.buscar(valorBuscar);
                    if (nodoEncontrado != null) {
                        System.out.println("Elemento encontrado: " + nodoEncontrado.dato);
                    } else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 4:
                    lista.recorrer();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
