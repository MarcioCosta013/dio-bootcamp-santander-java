package exercicios.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTerefas {

    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTerefas() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); //como tarefaList é do tipo Tarefa, foi preciso instanciar uma Tarefa passando descrição.
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t: tarefaList){ // FOR exclusivo para pecorrer os elementos de um Array.
            if (t.getDescrisao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size(); //"size" retorna o numero int , e representar o numero total de elemento na lista.
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTerefas listaTarefas = new ListaTerefas();

        System.out.println("numero total de elementos é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("numero total de elementos é: " + listaTarefas.obterNumeroTotalTarefas());

        //listaTarefas.removerTarefa("Tarefa 1");

        System.out.println("numero total de elementos é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }

}