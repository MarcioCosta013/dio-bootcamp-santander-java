


public abstract class Conta implements IConta {
	
    //Constantes
	private static final int AGENCIA_PADRAO = 1; //o "final" é porque ele não pode ser alterado mais...
	private static int SEQUENCIAL = 1; //Criado para funcionar como de fosse um Id em Banco de Dados e a cada conta ir imclementando.

    //atributos
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	private Banco banco;

    //Construtor
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++; //Para inclementar a cada conta que for criada...
		this.cliente = cliente;
		 
		banco.adicionarConta(numero, cliente.getNome());
	}

    //Metodos Especiais.
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

    //Metodos
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}