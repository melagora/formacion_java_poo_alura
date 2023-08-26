package sv.com.bytebank.test;

import sv.com.bytebank.modelo.Contador;
import sv.com.bytebank.modelo.Funcionario;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario melvin = new Contador ();
		melvin.setNombre("Melvin");
		melvin.setDocumento("123456789");
		melvin.setSalario(2000);
		melvin.setTipo(0);
		
		System.out.println(melvin.getSalario());
		System.out.println(melvin.getBonificacion());
	}
}
