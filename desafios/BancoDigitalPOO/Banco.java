
import java.util.HashMap;
import java.util.Map;

public class Banco {

	private Map<Integer, String> contasBanco; 
	//TODO: uma lista(map) que armazene o nome do cliente e a conta dele.

	public Banco() {
		this.contasBanco = new HashMap<>();
	}

	public void adicionarConta(int numConta, String nomeCliente){
        //Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
        contasBanco.put(numConta, nomeCliente);
    }

	public void removerContato(int numConta){
        //Remove um contato da agenda, dado o nome do contato.
        if(!contasBanco.isEmpty()){
            contasBanco.remove(numConta);
        }
    }

	public void exibirContatos(){
        //Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
        System.out.println(contasBanco);
    }

}