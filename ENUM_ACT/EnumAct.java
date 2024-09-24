package ENUM_ACT;

import ENUM.Hospital;

public enum EnumAct {
    SENCILLA(135000, " Sencilla"),
    DOBLE(189000, "doble"),
    MULTIPLE(280000, "multiple"),
    SUITE(530000, "suite");

    private int valor;
    private String nombre;
    private EnumAct(int valor, String nombre){
        this.valor = valor;
        this.nombre = nombre;

    }
    public int getValor() {
        return valor;
    }
    public String getNombre() {
        return nombre;
    }
}
