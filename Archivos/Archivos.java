package Archivos;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Archivos {
    public static void main(String[] args) {
        // Primero crear el archivo .txt y dejarlo fuera de la carpeta "Archivos.java"
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do {

            System.out.println("Seleccione\n1: Adicionar\n2: Mostrar\n3: Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                escribir();
                break;
                case 2:
                System.out.println("Cedula\t" + " nombre\t" + " edad");
                leer();
                break;
            }
        }while(opc < 3);
        //escribir();
       // leer();

    }

    public static void leer() {
        try {
            FileReader fileReader = new FileReader("Ventas.txt");
            int caracter = 0;
            while (caracter != -1) {
                caracter = fileReader.read();
                char letra = (char) caracter;
                
                System.out.print(letra);
         
            }
            fileReader.close();
        } catch (IOException err) {
            System.out.println("Error al leer el archivo");
        }
    }
    public static void escribir(){
        Scanner teclado = new Scanner(System.in);
        String registro;
        String cedula;
        String nombre;
        int edad;
        try{
            System.out.println("Ingrese la cedula");
            cedula = teclado.nextLine();
            System.out.println("Ingrese el nombre");
            nombre = teclado.nextLine();
            System.out.println("Ingrese la edad");
            edad = teclado.nextInt();
            
            registro = cedula + " " + nombre + " " + edad+ "\n";
            FileWriter filewriter = new FileWriter("Ventas.txt", true);
            filewriter.write("\n");
            for(int i = 0; i < registro.length(); i++){
                filewriter.write(registro.charAt(i));
            }
            filewriter.close();
         }catch(IOException err){
            System.out.println("Error al escribir el archivo");
        }    
    }




}
