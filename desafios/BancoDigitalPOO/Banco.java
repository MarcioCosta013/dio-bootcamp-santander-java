import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas; 
	//TODO: uma lista(map) que armazene o nome do cliente e a conta dele.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}