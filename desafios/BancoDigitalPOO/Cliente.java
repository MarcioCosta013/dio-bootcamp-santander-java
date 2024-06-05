import java.time.LocalDate;

public class Cliente {

	//Atributos
	private String nome;
	private LocalDate dataNascimento;
	

	//Contrutor
	public Cliente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
		
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

	

}