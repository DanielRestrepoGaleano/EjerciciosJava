import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
public class CentroComercial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Comprador> compradores = new ArrayList<Comprador>();
        String respuesta;

        System.out.println("Desea ingresar un nuevo registro? (S)i/(N)o");
        respuesta = teclado.next();
        while (respuesta.equalsIgnoreCase("S")) {
            Comprador comp = new Comprador();
            System.out.println("Ingrese el nombre del comprador:");
            comp.setNombre(teclado.next());
            System.out.println("Ingrese el articulo a llevar");
            comp.setArticulo(teclado.next());
            System.out.println("Ingrese el valor del articulo");
            comp.setValorUnitario(teclado.nextInt());
            compradores.add(comp);
            System.out.println("Desea ingresar un nuevo registro? (S)i/(N)o");
            respuesta = teclado.next();
            
           
        }
        //Sumar cada valor de articulo
        int suma = 0;
        for (Comprador comp : compradores) {
            suma += comp.getValorUnitario();
            
            }
            System.out.println("El valor total es: " + suma);

            Integer max = null;
            String compMayor = "";
            
        for(Comprador comp: compradores){
            if(max == null || comp.getValorUnitario() > max){
                max = comp.getValorUnitario();
                compMayor = comp.getNombre();

            }       

        }
        
        System.out.println(" El valor mayor es: " + max + " y quien realizó la compra fue " + compMayor);
        
        Integer min = null;
        String compMenor = "";
        
        for(Comprador comp: compradores){
            if(min == null || comp.getValorUnitario() < min){
                min = comp.getValorUnitario();
                compMenor = comp.getNombre();
            }
        }
        
        System.out.println(" El valor menor es: " + min + " y quien realizó la compra fue " + compMenor);
        
  
        int contadorUsuarios = 0;
        float promedio = 0;
        for(Comprador comp: compradores){
            contadorUsuarios++;
            promedio = suma/contadorUsuarios;

        }
        System.out.println("y el promedio de venta es: " + promedio);

       


    }
    
}
