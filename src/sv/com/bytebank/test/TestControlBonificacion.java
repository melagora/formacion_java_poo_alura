package sv.com.bytebank.test;

import sv.com.bytebank.modelo.*;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario melvin = new Contador();
		melvin.setSalario(2000);
		
		Gerente beatriz = new Gerente();
		beatriz.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(melvin);
		controlBonificacion.registrarSalario(beatriz);
		controlBonificacion.registrarSalario(alexis);
	}
}
