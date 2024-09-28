package calculadora;

public class Operaciones {
	
	public double num1, num2, resultado;
	public int opcion;

	public Operaciones(double num1, double num2, double resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}
	
	
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


	public double Operacion() {
		if (opcion == 1){
			resultado = num1 + num2;
		}else if(opcion == 2) {
			resultado = num1 - num2;
		}else if(opcion == 3) {
			resultado = num1 * num2;
		}else if(opcion == 4) {
			resultado = num1 / num2;
		}else {
			System.out.println("Ingresó un dato erroneo");
		}
		return resultado;
		
	}


	@Override
	public String toString() {
		return "Operaciones [num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + ", opcion=" + opcion + "]";
	}
	
	

}
