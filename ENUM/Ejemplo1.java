package ENUM;
 import java.util.Scanner;
public class Ejemplo1 {

    enum Hospital{
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
    /*
     * tipo de dato para crear un grupo de datos fijos o consantes que use una aplicación
     */
    public static void main(String[] args) {


/* 
        for(Hospital hospital: Hospital.values()){
            System.out.println(hospital);


        }
*/
Scanner teclado = new Scanner(System.in);
String opcion;
System.out.println("Digite una opción CONSULTA /  HOSPITALIZACION / CIRUGIA / OFTALMOLOGIA"
 + " / URGENCIAS / ORTOPEDIA / PEDIATRIA ");
 opcion = teclado.next().toUpperCase();
 Hospital hospital = Enum.valueOf(Hospital.class, opcion);
 System.out.println("Eligió " + opcion + " y tiene un costo de " + hospital.getValor() +
" y es antendido en " + hospital.getSede());

if(opcion.equals("CONSULTA")){
    System.out.println("Seleccionó " + opcion);
}


    }
    
}
