package sv.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	public static void main(String[] args) {

		//Arreglos tamaño fijo
		int [] numeros = new int [10];
		
		//Primitivos (Guarda valor)
		int numero = 40;
		
		//tachado = (DEPRECADO) ya no se usa
		Integer numeroObjeto = Integer.valueOf(40);
		//WRAPPER
		
		//Ventaja para interactuar con los valores de manera más facil
		//listas
		
		//Solo se acepta guardar objetos
		List<Integer> lista = new ArrayList <>();
		
		//Objetos (Guarda referencia)
		//primitivo != Object
		lista.add(numero); //autoboxing - Si es un valor, automaticamente lo guardará
		lista.add(Integer.valueOf(40));
		lista.add(numeroObjeto);
		System.out.println(lista);
		
		//unboxing
		//El objeto es estraido y lo iguala al primitivo
		//int valorPrimitivo = numeroObjeto;
		int valorPrimitivo = numeroObjeto.intValue();
		
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE); // 2^31 - 1
		System.out.println(Integer.MIN_VALUE); //-2^31

		System.out.println(Integer.SIZE); // 32 bits
		System.out.println(Integer.BYTES); //4

		
	}
}
