package sv.com.bytebank.test;

import sv.com.bytebank.modelo.Administrador;
import sv.com.bytebank.modelo.Gerente;
import sv.com.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);

	}
}
