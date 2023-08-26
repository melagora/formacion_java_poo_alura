package sv.com.bytebank.modelo;

//Entidad cuenta
public abstract class Cuenta implements Comparable<Cuenta>{

	protected double saldo;
	protected int agencia = 1;
	protected int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public Cuenta() {

	}

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta " + getNumero());

		Cuenta.total++;
	}

	// metodo
	public abstract void depositar(double valorDeposito);

	public void retirar(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor){
			throw new SaldoInsuficienteException("No tiene saldo");
		}
		this.saldo -= valor;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cuenta.depositar(valor);
			return true;
		}else {
			return false;			
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No estan permitidos valores NEGATIVOS");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}
	
	@Override
	public String toString() {
		String cuenta = "Numero: " +this.numero+", Agencia: "+this.agencia; 
				return cuenta;
	}

	@Override
	//equals => comparación de valores
	public boolean equals (Object obj) {
		Cuenta cuenta = (Cuenta)obj;
		return this.agencia == cuenta.getAgencia() &&
				this.numero == cuenta.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o) {
		//Orden natural por Numero de agencia
		//return Integer.compare(this.agencia, o.getAgencia());
		//Orden natural por Saldo
		return Double.compare(this.getSaldo(), o.getSaldo());
	}
	
}
