package Parcial_2;

public enum VeterinariaEnum{

    CANINO("Canino"),
    FELINO("Felino"),
    EQUINO("Equino"),
    BOVINO("Bovino"),
    CAPRINO("Caprino"),
    PORCINO("Porcino"),
    OVINO("Ovino");

    private final String especie;

    VeterinariaEnum(String especie) {
        this.especie = especie;
        }

    public String getEspecie() {
        return especie;
    }
    

}
