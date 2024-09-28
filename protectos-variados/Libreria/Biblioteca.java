import java.util.Scanner; // importar Scanner para ingreso de datos

public class Biblioteca { // Clase principal con el metodo main

    private static void mostrarLibros(Libro[] biblioteca, int contadorLibros) {
        System.out.println("--- LIBROS EN LA BIBLIOTECA ---");
        while (contadorLibros <= 0) {
            System.out.println("No hay libros disponibles");
            break;
        }
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println(biblioteca[i].toString());

        }

    } // Organizar las funciones y el eliminar.

    private static void posicionLibro(Libro[] biblioteca, int contadorLibros) {

        while (contadorLibros <= 0) {
            System.out.println("No hay libros disponibles");
            break;
        }
        
      


        for (int l = 0; l < contadorLibros; l++) {
            System.out.println("La posicion de los libros es: ");
            int posicion = l + 1;
            System.out.print("[" + posicion + "] ");
            System.out.println(biblioteca[l].getTitulo());
        }
    }

   /*  private static int eliminarLibro(Libro[] biblioteca, int contadorLibros) {
        Scanner scanner = new Scanner(System.in);
        if (contadorLibros <= 0) {
            System.out.println("No hay libros disponibles");
            return 0;
        } else {
            System.out.println("Seleccione la posicion del libro a eliminar");
        int posicionEliminar = scanner.nextInt();
        if ((posicionEliminar > 0) && (posicionEliminar <= contadorLibros)) {
            for (int i = posicionEliminar - 1; i < contadorLibros - 1; i++) {
                biblioteca[i] = biblioteca[i + 1];
            }

            biblioteca[contadorLibros - 1] = null;
            contadorLibros--; // Disminuir el contador de libros después de eliminar uno
        } else {
            System.out.println("Posicion invalida, intentelo nuevamente.");
        }
        return contadorLibros;

    }
            
        }*/



        private static int eliminarLibro(Libro[] biblioteca, int contadorLibros) {
            Scanner scanner = new Scanner(System.in);
            if (contadorLibros <= 0) {
                System.out.println("No hay libros disponibles");
            } else {
                System.out.println("Seleccione la posición del libro:");
                int posicion = scanner.nextInt();
                if (posicion > 0 && posicion <= contadorLibros) {
                    // Cambiamos el estado de visibilidad del libro
                    if (biblioteca[posicion - 1].isDisponible()) {
                        biblioteca[posicion - 1].setDisponible(false);
                        System.out.println("Libro ocultado exitosamente.");
                    } else {
                        biblioteca[posicion - 1].setDisponible(true);
                        System.out.println("Libro mostrado exitosamente.");
                    }
                } else {
                    System.out.println("Posición inválida, intente nuevamente.");
                }
            }
            return contadorLibros;
        }
        





        

    private static int editarLibro(Libro[] biblioteca, int contadorLibros) {
        if (contadorLibros <= 0) {
            System.out.println("No hay libros disponibles");
            return 0;
        } else {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la posicion en la que se encuentra el libro");
        int posicionEditar = scanner.nextInt();
        if (posicionEditar > 0 && posicionEditar <= contadorLibros) {
            Libro libroAEditar = biblioteca[posicionEditar - 1];

            // Mostrar información actual del libro para facilitar el cambio.
            System.out.println("Información actual del libro:");
            System.out.println(libroAEditar.toString());

            // Solicitar y actualizar la información del libro
            System.out.println("Ingrese el nuevo título del libro:");
            String nuevoTitulo = scanner.nextLine().toUpperCase();
            nuevoTitulo = scanner.nextLine(); // Leer el nuevo título
            libroAEditar.setTitulo(nuevoTitulo);

            System.out.println("Ingrese el nuevo autor del libro");
            String nuevoAutor = scanner.nextLine().toUpperCase();
            libroAEditar.setAutor(nuevoAutor);

            System.out.println("Ingrese el nuevo año de publicación");
            int fechaPublicacionNueva = scanner.nextInt();
            if (fechaPublicacionNueva > 2024) {
                libroAEditar.setfechaPublicacion(fechaPublicacionNueva);
            } else {
                System.out.println("Error! Año incorrecto.");
            }

            System.out.println("Ingrese el nuevo número de páginas");
            int paginasNuevas = scanner.nextInt();
            libroAEditar.setNumPaginas(paginasNuevas);

            System.out.println("acutualizar estado del libro");
            boolean libroDisponible = scanner.nextBoolean();
            libroAEditar.setDisponible(libroDisponible);
            scanner.nextLine();
            System.out.println("Ingrese el nuevo ISBN del libro");
            String isbnNuevo = scanner.nextLine();
            libroAEditar.setIsbn(isbnNuevo);

            System.out.println("Ingrese una descprición del libro nueva");
            String descripcionNueva = scanner.nextLine();
            libroAEditar.setDescripcion(descripcionNueva);

            System.out.println("El libro ha sido editado exitosamente.");
        } else {
            System.out.println("Posición inválida, intentelo nuevamente.");
        }

        return contadorLibros;
    }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // objeto teclado para ingresar datos
        int contadorLibros = 0; // Contador de libros para el array y mostrarlos
        Libro[] biblioteca = new Libro[10000000]; // dimensión del array
        int x = 1;

        do { // do while para generar un menú de opciones
            System.out.println("Por favor presione 1 para ingresar un nuevo libro");
            System.out.println("Por favor presione 2 para ver la lista de libros");
            System.out.println("Por favor presione 3 para ver la posicion de los libros");
            System.out.println("Por favor presione 4 para cambiar el estado del libro");
            System.out.println("Por favor presione 5 para editar un libro");
            System.out.println("Por favor presione 0 para salir");
            System.out.println("Ingrese su opción");

            x = teclado.nextInt(); // Definir el valor de switch
            if (x != 0) {

                switch (x) {
                    case 1: // Menú de la biblioteca
                        System.out.println("Ingresar un nuevo libro");
                        teclado.nextLine();
                        System.out.println("");
                        System.out.println("Ingrese el título del libro:");
                        String titulo = teclado.nextLine().toUpperCase();
                        System.out.println("Ingrese el autor del libro:");
                        String autor = teclado.nextLine().toUpperCase();
                        System.out.println("Ingrese el año de publicación:");
                        int fechaPublicacion = teclado.nextInt();
                        if (fechaPublicacion > 2024) {
                            while(fechaPublicacion > 2024){
                                System.out.println("La fecha " + fechaPublicacion + " es superior al año actual, vuevla a intentarlo.");
                                fechaPublicacion = teclado.nextInt();
                            }
                            
                        }
                        System.out.println("Ingrese el número de páginas:");
                        int numPaginas = teclado.nextInt();
                        
                        System.out.println("¿El libro está disponible? (true/false):");
                        boolean disponible = teclado.nextBoolean();
                        teclado.nextLine();
                        System.out.println("Ingrese el ISBN del libro");
                        String isbn = teclado.nextLine();
                        
                        System.out.println("");
                        
                        System.out.println("Agregue una descripción del libro ");
                        String descripcion = teclado.nextLine();
                        

                        Libro nuevoLibro = new Libro(titulo, autor, fechaPublicacion, numPaginas, disponible, isbn,
                        descripcion); // Guardar
                        // cada

                        biblioteca[contadorLibros] = nuevoLibro;
                        contadorLibros++;

                        break;
                    case 2:
                        mostrarLibros(biblioteca, contadorLibros);
                        break;
                    case 3:
                        posicionLibro(biblioteca, contadorLibros);
                        break;
                    case 4:
                        contadorLibros = eliminarLibro(biblioteca, contadorLibros);
                        break;
                    case 5:
                        editarLibro(biblioteca, contadorLibros);
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Opcion no valida, vuelva a intentarlo con una opción del menú");
                        System.out.println("");
                }
            }
        } while (x != 0);

        teclado.close(); // Cerrar el objeto teclado
    }
}