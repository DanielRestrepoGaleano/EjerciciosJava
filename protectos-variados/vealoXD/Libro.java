public class Libro{

/*titulo: String
autor: String
fechaPublicacion: int
numPaginas: int
disponible: boolean (indica si el libro está disponible para ser prestado o no) */
//Declaración de atributos
private String titulo;
private String autor;
private int fechaPublicacion;
private int numPaginas;
private boolean disponible;
private int isbn;

//Constructor

public Libro(String titulo, String autor, int fechaPublicacion, int numPaginas, boolean disponible, int isbn) {
    this.titulo = titulo;
    this.autor = autor;
    this.fechaPublicacion = fechaPublicacion;
    this.numPaginas = numPaginas;
    this.disponible = disponible;
    this.isbn = isbn;


} //Métodos getter y setter.
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public int getfechaPublicacion() {
    return fechaPublicacion;
}
public void setfechaPublicacion(int fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
}
public int getNumPaginas() {
    return numPaginas;
}
public void setNumPaginas(int numPaginas) {
    this.numPaginas = numPaginas;
}
public boolean isDisponible() {
    return disponible;
}
public void setDisponible(boolean disponible) {
    this.disponible = disponible;
}
public int getIsbn() {
    return isbn;
}
public void setIsbn(int isbn) {
    this.isbn = isbn;
}
@Override
public String toString() {
    return "Libro [titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + ", numPaginas="
            + numPaginas + ", disponible=" + disponible + ", isbn=" + isbn + "]";
}









}