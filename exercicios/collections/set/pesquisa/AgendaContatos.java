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
        
        if(contatoSet.isEmpty()){
            System.out.println("Nenhum contato encontrado.");
        } else {
            System.out.println(contatoSet);
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

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();
    
        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);
    
        // // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();
    
        // // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    
        // // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
      }
}
