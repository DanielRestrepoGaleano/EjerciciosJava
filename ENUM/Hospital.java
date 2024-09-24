package ENUM;

public enum Hospital {
    CONSULTA(75000, "Clinica soma"),
        HOSPITALIZACION(250000, "Hospital general"),
        CIRUGIA(1500000, " Clinica pardo"),
        OFTALMOLOGIA(80000, "Clinica oftalmologia laureles"),
        URGENCIA(130000, "león XII"),
        ORTIPEDIA(150000, "Clinica de fracturas"),
        PEDIATRIA(100000, "Hospital infantil");

        private int valor;
        private String sede;
        private Hospital(int valor, String sede){
            this.valor = valor;
            this.sede = sede;

        }
        public int getValor() {
            return valor;
        }
        public String getSede() {
            return sede;
        }
    
}
