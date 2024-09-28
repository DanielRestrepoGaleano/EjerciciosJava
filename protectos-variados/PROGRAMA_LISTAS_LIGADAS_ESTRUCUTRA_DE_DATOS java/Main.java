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

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public int encontrarMayor() {
        if (cabeza == null) {
            System.out.println("La lista está vacia");
        }

        int mayor = cabeza.dato;
        Nodo temp = cabeza.siguiente;

        while (temp != null) {
            if (temp.dato > mayor) {
                mayor = temp.dato;
            }
            temp = temp.siguiente;
        }

        return mayor;
    }

    public double calcularPromedio() {
        if (cabeza == null) {
            System.out.println("La lista está vacia");
        }

        int suma = 0;
        int contador = 0;
        Nodo temp = cabeza;

        while (temp != null) {
            suma += temp.dato;
            contador++;
            temp = temp.siguiente;
        }

        return (double) suma / contador;
    }

    public void ingresarDatosPorTeclado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea agregar a la lista:");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un número entero:");
            int numero = scanner.nextInt();
            insertar(numero);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Llamada al método para ingresar datos por teclado
        lista.ingresarDatosPorTeclado();

        int mayor = lista.encontrarMayor();
        double promedio = lista.calcularPromedio();

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El promedio es: " + promedio);
    }
}
//hecho por daniel restrepo galeano para la clase de estructura de datos (Uniremington)
