import java.util.Scanner;

public class IngresoNumeros {

    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);
        GenerarNumeros numRandom = new GenerarNumeros();
        int opc = 0;

        do {

            System.out.println("Por favor ingrese la opción");
            System.out.println("1. Para ingresar la cantidad de números con los que desea jugar");
            System.out.println("2. Para intentar adivinar el número");
            System.out.println("3. Para ver si ganó o perdió");
            System.out.println("4. Para ingresar un jugador");
            System.out.println("0. Para salir");
            String in = teclado.nextLine();
            try {
                opc = Integer.parseInt(in);

                if (opc > 4 || opc < 0) {
                    System.out.println("Ingresó un número que no está en el menú");
                } else {
                    switch (opc) {

                        case 1:
                            System.out.println("Por favor ingrese la cantidad de números con los que quiere jugar");
                            int numero = teclado.nextInt();
                            teclado.nextLine();
                            numRandom.setA(numero);
                            numRandom.calcular();
                            break;

                        case 2:
                            for (int i = 0; i < numRandom.getJugadores().size(); i++) {
                                System.out.println("Jugador " + numRandom.getJugadores().get(i) + ", ingrese su elección:");
                                int eleccion = teclado.nextInt();
                                teclado.nextLine();
                                numRandom.setEleccion(i, eleccion);
                            }
                            break;

                        case 3:
                            numRandom.verificarGanador();
                            System.out.println(numRandom.toString());
                            break;

                        case 4:
                            System.out.println("Ingrese su nombre");
                            String nom = teclado.nextLine();
                            numRandom.addJugador(nom);
                            System.out.println("Jugador agregado: " + nom);
                            break;

                        case 0:
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Saliendo del juego");
                            Thread.sleep(2000);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            Thread.sleep(1000);
                            System.out.println("Juego cerrado con éxito");
                            Thread.sleep(500);
                            break;

                    }

                }

            } catch (Exception e) {
                System.out.print("\033[H\033[2J");
                System.out.println("Ha ocurrido un error");
                System.out.println("Cargando programa");
                Thread.sleep(4000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Por favor ingrese un número válido");
            }

        } while (opc != 0);

    }
}
