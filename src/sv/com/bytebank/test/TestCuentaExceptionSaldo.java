package sv.com.bytebank.test;

import sv.com.bytebank.modelo.Cuenta;
import sv.com.bytebank.modelo.CuentaAhorros;
import sv.com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {

		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(200);
		try {
			cuenta.retirar(210);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
