package sv.com.bytebank.test;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Alura";
		
		//Existe pero no es utilizada en el mundo real
		//String nombre2 = new String ("Alura");

		System.out.println("Antes del replace: "+nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online");
		int indice = nombre.indexOf("e");
		System.out.println("Despues del replace: "+nombre);
		System.out.println("Indice encontrado: "+indice);
		
		System.out.println();
		
	}
}
