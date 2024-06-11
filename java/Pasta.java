import java.util.ArrayList;
import java.util.List;

public class Pasta {
    private String nome;
    private List<Tarefas> tarefas;

    public Pasta(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefas tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefas tarefa) {
        this.tarefas.remove(tarefa);
    }
}