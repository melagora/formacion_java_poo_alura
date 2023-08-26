package sv.com.bytebank.modelo;

public class GuardaReferencias {

	// Crear un objeto para guardar muchas cuentas
	// permitirnos guardar cuentas con un metodo
	// guardaCuentas.adicina(cuenta)
	// obtener, remover

	Object[] referencia = new Object[10];
	int indice = 0;

	// [X][ ][ ][ ][ ]...[ ]
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice++;
	}

	public Object obtener(int indice) {
		return referencia[indice];
	}
}