package sv.com.bytebank.modelo;

public class Contador extends Funcionario{
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando test de contador");
		return 200;
	}
}
