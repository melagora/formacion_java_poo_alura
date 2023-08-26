package sv.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

import sv.com.bytebank.modelo.Cuenta;
import sv.com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	public static void main(String[] args) {

		// <> Forzando a que solo acepte un tipo de objeto
		//List<Cliente> listaClientes = new LinkedList<>();
		
		// <>Primero obligatorio <>Segundo no es obligatorio
		List<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);

		lista.add(cc);
		lista.add(cc2);

		// Cliente cliente = new Cliente();
		// lista.add(cliente);

		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);

		// .size me retorna la cantidad de parametros que con tiene
		// el ArrayList
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// Por cada cuenta en la lista, imprime esto
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		//Igualdad comparando la información que contiene
		boolean contiene = lista.contains(cc3);
		if (contiene) {
			System.out.println("Sí, es igual con equals");
		}
	}
}
