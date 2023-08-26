package sv.com.bytebank.test;

import java.util.Arrays;

//Ordenar arrays tampoco es difícil, solo use el método 
//de ordenación de la clase Arrays. La clase Arrays es 
//similar a Collections en el sentido de que también une 
//varios métodos de utilidad:

public class TestSortArray {
	public static void main(String[] args) {
		Double[] numeros = new Double[] { 43.3, 43.2, 15.2, 64.1, 22.3, 89.8 };
		String[] nombres = new String[] { "Elmer", "Carlos", "Ariana", "Alberto", "Brayan", "Danilo"};

		Arrays.sort(numeros); // método utilitário sort
		Arrays.sort(nombres);
		
		System.out.println(Arrays.toString(numeros)); // método utilitário toString
		System.out.println(Arrays.toString(nombres));
		// Salida : [15, 22, 43, 64, 89]
	}
}