import java.util.List;

public class AcessoDados {
  private InterfaceBanco<Pasta> database;

  public AcessoDados() {
    this.database = new ImplementaCollections<>();
  }

  public void adicionarPasta(Pasta pasta) {
    database.save(pasta);
  }

  public void atualizarPasta(Pasta pasta) {
    database.update(pasta);
  }

  public void excluirPasta(Pasta pasta) {
    database.delete(pasta);
  }

  public List<Pasta> getTodasPastas() {
    return database.findAll();
  }

}
