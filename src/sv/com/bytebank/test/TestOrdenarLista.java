package sv.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sv.com.bytebank.modelo.Cuenta;
import sv.com.bytebank.modelo.CuentaAhorros;
import sv.com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {
	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(62, 33);
		cc1.depositar(333.0);

		Cuenta cc2 = new CuentaAhorros(32, 44);
		cc2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc3.depositar(111.0);

		Cuenta cc4 = new CuentaAhorros(2, 22);
		cc4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		// Ordenar las cuentas
		// <? Cualquier clase hija de Cuenta
		// Cualquier cosa que extienda de Cuenta
		
		//Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta(); 
		lista.sort(new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
		});
		
		//Metodo sobrecargado
		//Forma antigua de guardado antes de JAVA8
		Collections.sort(lista, new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getAgencia(), o2.getAgencia());
			}
		}); //Implementacion de la interfaz
		
		System.out.println("Despues de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		Collections.sort(lista);
		
		System.out.println("Despues de ordenar por orden natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

//class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {
//
//	@Override
//	public int compare(Cuenta o1, Cuenta o2) {
//		// ***** Forma básica  ***** 
////		if (o1.getNumero() == o2.getNumero()) {
////			return 0;
////		} else if (o1.getNumero() > o2.getNumero()) {
////			return 1;
////		} else {
////			return -1;
////		}
//		
//		// ***** Forma intermedia  ***** 
////		return o1.getNumero() - o2.getNumero();
//		
//		// ***** Forma Wrapper  ***** 
//		return Integer.compare(o1.getNumero(), o2.getNumero());
//	}
//}