package sv.com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//Agrupación en una sola referencia
		//indices
		int [] edades = new int [5];
		edades [2] = 30;
		System.out.println(edades[2]);
		
		int tamanioArray = edades.length;
		System.out.println(tamanioArray);
		
		//Imprimir todos los valores de un array
		for(int i=0; i< tamanioArray; i ++) {
			System.out.println(edades [i]);
		}
	}
}
