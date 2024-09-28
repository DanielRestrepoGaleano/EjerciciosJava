import java.util.Scanner; // importar Scanner para ingreso de datos

public class Biblioteca { // Clase principal con el metodo main

    private static void mostrarLibros(Libro[] biblioteca, int contadorLibros) {
        System.out.println("--- LIBROS EN LA BIBLIOTECA ---");
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println(biblioteca[i].toString());
            if (contadorLibros == 0){
                System.out.println("No hay libros actualmente");
            }
        }
    }

    private static void posicionLibro(Libro[] biblioteca, int contadorLibros) {
        System.out.println("La posicion de los libros es: ");
        for (int l = 0; l < contadorLibros; l++) {
            int posicion = l + 1;
            System.out.print("[" + posicion + "] ");
            System.out.println(biblioteca[l].getTitulo());
        }
    }

    private static int eliminarLibro(Libro[] biblioteca, int contadorLibros) {
        Scanner scanner = new Scanner(System.in);
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
    private static int editarLibro (Libro[] biblioteca, int contadorLibros){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la posicion en la que se encuentra el libro");
        int posicionEditar=scanner.nextInt();
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
            if(fechaPublicacionNueva > 2024 ){
                libroAEditar.setfechaPublicacion(fechaPublicacionNueva);
            }else {
                System.out.println( "Error! Año incorrecto." );
            }
            

            System.out.println("Ingrese el nuevo número de páginas");
            int paginasNuevas = scanner.nextInt();
            libroAEditar.setNumPaginas(paginasNuevas);

            System.out.println("acutualizar estado del libro");
            boolean libroDisponible = scanner.nextBoolean();
            libroAEditar.setDisponible(libroDisponible);
            
            System.out.println("Ingrese el nuevo ISBN del libro");
            int isbnNuevo = scanner.nextInt();
            libroAEditar.setIsbn(isbnNuevo);
            
            
            
            System.out.println("El libro ha sido editado exitosamente.");
        } else {
            System.out.println("Posición inválida, intentelo nuevamente.");
        }
       


        return  contadorLibros;
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
            System.out.println("Por favor presione 4 para eliminar un libro");
            System.out.println("Por favor presione 5 para editar un libro");
            System.out.println("Por favor presione 0 para salir");

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
                        if(fechaPublicacion  > 2024){
                            System.out.println("La fecha " + fechaPublicacion + " es superior al año actual, vuevla a intentarlo.");
                            break;

                        }
                        System.out.println("Ingrese el número de páginas:");
                        int numPaginas = teclado.nextInt();
                        System.out.println("¿El libro está disponible? (true/false):");
                        boolean disponible = teclado.nextBoolean();
                        System.out.println("Ingrese el ISBN del libro");
                        int isbn = teclado.nextInt();

                        Libro nuevoLibro = new Libro(titulo, autor, fechaPublicacion, numPaginas, disponible, isbn); // Guardar cada libro en un array

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
                    editarLibro ( biblioteca, contadorLibros);
                    break;
                    default :
                    System.out.println("");
                    System.out.println("Opcion no valida, vuelva a intentarlo con una opción del menú");
                    System.out.println("");
                }
            }
        } while (x != 0);

        teclado.close(); // Cerrar el objeto teclado
    }
}
