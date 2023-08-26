package sv.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import sv.com.bytebank.modelo.Cuenta;
import sv.com.bytebank.modelo.CuentaAhorros;
import sv.com.bytebank.modelo.CuentaCorriente;

public class TestLambda {
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
		
		//Usando Lambdas
		lista.sort((Cuenta o1, Cuenta o2) ->
			Integer.compare(o1.getNumero(), o2.getNumero())
		);
		
		//Usando Lambdas
		Collections.sort(lista, (c1,c2) ->
			Integer.compare(c1.getAgencia(), c2.getAgencia())
		);

		System.out.println("Despues de ordenar");
//		for (Cuenta cuenta : lista) {
//			System.out.println(cuenta);
//		}
		
		lista.forEach((Cuenta cuenta) -> System.out.println(cuenta));
		
		Collections.sort(lista);

		System.out.println("Despues de ordenar por orden natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}
