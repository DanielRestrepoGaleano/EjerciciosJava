public class Operaciones {
    private double num1, num2, resultado;
    private int opcion;

    public Operaciones() {}

    // Getters and Setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    // Improved Operacion method
    public double operacion() {
        switch (opcion) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            default:
                System.out.println("Invalid option");
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Operaciones [num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + ", opcion=" + opcion + "]";
    }
}