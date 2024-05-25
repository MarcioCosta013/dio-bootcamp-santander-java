package exercicios.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    //construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //metodos
    public void adicionarContato(String nome, int numero){
        // Adiciona um contato à agenda.
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        //Exibe todos os contatos da agenda.
        for (Contato c : contatoSet) {
            if(contatoSet.isEmpty()){

            } else {
                System.out.println(contatoSet);
            }
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        //Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){ //o startsWith vai selecionar todos os elementos que que comecem escrito igual.
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        //Atualiza o número de telefone de um contato específico.
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
