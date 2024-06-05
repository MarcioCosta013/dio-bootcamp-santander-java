import java.time.LocalDate;

public class Cliente {

	//Atributos
	private String nome;
	private LocalDate dataNascimento;
	private String login;
	private long senha;

	//Contrutor
	public Cliente(String nome, LocalDate dataNascimento, String login, long senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
		this.login = login;
		this.senha = senha;
    }

	//Metodos especiais
	
	
    public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
    }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}

	

}