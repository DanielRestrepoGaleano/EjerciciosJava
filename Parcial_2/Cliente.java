package Parcial_2;

public class Cliente {
    private String nombre;
    private Mascota mascota;

    public Cliente(String nombre, Mascota mascota) {
        this.nombre = nombre;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public Mascota getMascota() {
        return mascota;
    }
}

class Mascota {
    private String nombre;
    private String raza;
    private VeterinariaEnum especie;
    private int edad;

    public Mascota(String nombre, String raza, VeterinariaEnum especie, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public VeterinariaEnum getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }
}
