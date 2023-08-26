package sv.com.bytebank.test;

import sv.com.bytebank.modelo.Funcionario;
import sv.com.bytebank.modelo.Gerente;

public class TestReferencias {
	public static void main(String[] args) {
		
	//El elemento más generico (funcionario) puede ser adaptado al
	//elemento más especifico (gerente)
		
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Melvin");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Beatriz");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("asdf");
		
		System.out.println();
	}
}
