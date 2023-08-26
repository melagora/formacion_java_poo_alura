package sv.com.bytebank.test;

import sv.com.bytebank.modelo.CuentaCorriente;
import sv.com.bytebank.modelo.Cliente;
import sv.com.bytebank.modelo.CuentaAhorros;

public class TestArregloReferencias {
	public static void main(String[] args) {
		//objeto
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		
		//Array
		Object [] referencias = new Object[5];
		referencias[1] = cc;
		
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		Cliente obtenido = (Cliente)referencias [4];
		System.out.println(obtenido);
		
		CuentaAhorros ca = new CuentaAhorros(44, 55);
		referencias [3] = ca;
		
		referencias[0] = new CuentaCorriente(11,99);
		System.out.println(referencias[0]);
		
		CuentaCorriente cuenta  = (CuentaCorriente) referencias[1];
		System.out.println(cuenta);

		//.lenth => tamaño del array
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
		
		
	}
}