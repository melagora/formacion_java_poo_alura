package sv.com.bytebank.modelo;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
	@Override
    public String toString() {
        return "Cuenta Corriente(numero: " + this.numero + ", Agencia: "+this.agencia+")";
    }
	
	
	
}
