package sv.com.bytebank.modelo;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
	@Override
    public String toString() {
        return "Cuenta Ahorros(numero: " + this.numero + ", Agencia: "+this.agencia+")";
    }
}
