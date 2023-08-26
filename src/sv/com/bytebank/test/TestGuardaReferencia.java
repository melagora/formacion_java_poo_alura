package sv.com.bytebank.test;

import sv.com.bytebank.modelo.Cuenta;
import sv.com.bytebank.modelo.CuentaCorriente;
import sv.com.bytebank.modelo.GuardaReferencias;

public class TestGuardaReferencia {
	public static void main(String[] args) {
		GuardaReferencias guardaReferencias = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaReferencias.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaReferencias.adicionar(cc2);
		
		System.out.println(guardaReferencias.obtener(0));
		System.out.println(guardaReferencias.obtener(1));
	}
}