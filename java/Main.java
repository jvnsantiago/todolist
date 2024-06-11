import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
  public static void main(String[] args) {
    GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;

    while (opcao != 7) {
      menu();
      opcao = scanner.nextInt();
      System.out.println("\n");
      scanner.nextLine();
      switch (opcao) {
        case 1:
          criarPasta(gerenciador, scanner);
          break;
        case 2:
          listarPastas(gerenciador);
          break;
        case 3:
          removerPasta(gerenciador, scanner);
          break;
        case 4:
          adicionarTarefa(gerenciador, scanner);
          break;
        case 5:
          gerenciador.listarTodasTarefas();
          break;
        case 6:
          removerTarefa(gerenciador, scanner);
          break;
        case 7:
          System.out.println("Saindo do programa.");
        default:
          System.out.println("Opção inválida. Digite novamente.");
      }
    }

    scanner.close();
  }

  public static void menu() {
    System.out.println("TO-DO List" + "\n");
    System.out.println("Menu: " + "\n");
    System.out.println("1 - Criar pasta");
    System.out.println("2 - Listar pastas");
    System.out.println("3 - Remover Pasta");
    System.out.println("4 - Adicionar Tarefa");
    System.out.println("5 - Listar Tarefas");
    System.out.println("6 - Remover Tarefa");
    System.out.println("7 - Sair" + "\n");
    System.out.print("Escolha uma opção: " + "\n");
  }

  public static void criarPasta(GerenciadorDeTarefas gerenciador, Scanner scanner) {
    System.out.println("Digite o nome da pasta: ");
    String nomePasta = scanner.nextLine();
    gerenciador.adicionarPasta(nomePasta);
  }

  public static void listarPastas(GerenciadorDeTarefas gerenciador) {
    List<Pasta> pastas = gerenciador.listarTodasPastas();
    System.out.println("Pastas encontradas: " + "\n");
    for (Pasta pasta : pastas) {
      System.out.println(pasta.getNome());
    }
  }

  public static void removerPasta(GerenciadorDeTarefas gerenciador, Scanner scanner) {
    List<Pasta> pastas = gerenciador.listarTodasPastas();
    System.out.println("Pastas encontradas: " + "\n");
    for (Pasta pasta : pastas) {
      System.out.println(pasta.getNome());
    }
  }

  public static void adicionarTarefa(GerenciadorDeTarefas gerenciador, Scanner scanner) {
    System.out.println("Digite o nome da pasta onde deseja adicionar a tarefa: ");
    String nomePastaAdicionar = scanner.nextLine();
    Tarefas tarefa = preencheTarefa(scanner);
    gerenciador.adicionarTarefa(nomePastaAdicionar, tarefa);
  }

  public static void removerTarefa(GerenciadorDeTarefas gerenciador, Scanner scanner) {
    System.out.println("Digite o nome da pasta onde deseja remover a tarefa: ");
    String nomePastaRemover = scanner.nextLine();
    Tarefas tarefa = preencheTarefa(scanner);
    gerenciador.removerTarefa(nomePastaRemover, tarefa);
  }

  public static Tarefas preencheTarefa(Scanner scanner){
    System.out.println("Digite o título da tarefa: ");
    String tituloTarefa = scanner.nextLine();
    System.out.println("Digite a descrição da tarefa: ");
    String descricaoTarefa = scanner.nextLine();
    System.out.println("Digite o status da tarefa (Concluida = true/Pendente = false): ");
    boolean statusTarefa = scanner.nextBoolean();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date dataInicioTarefa = null;
    System.out.println("Digite a data de início da tarefa (dd/MM/yyyy): ");
    try {
      dataInicioTarefa = sdf.parse(scanner.next());
    } catch (ParseException e) {
      System.out.println("Erro: Data inválida. Por favor, digite a data no formato dd/MM/yyyy.");
    }
    System.out.println("Digite a data de prazo da tarefa (dd/MM/yyyy): ");
    Date prazoTarefa = null;
    try {
      prazoTarefa = sdf.parse(scanner.next());
    } catch (ParseException e) {
      System.out.println("Erro: Data inválida. Por favor, digite a data no formato dd/MM/yyyy.");
    }
    System.out.println("Digite a prioridade da tarefa: ");
    int prioridadeTarefa = scanner.nextInt();
    Tarefas tarefa = new Tarefas(tituloTarefa, descricaoTarefa, statusTarefa, dataInicioTarefa, prazoTarefa, prioridadeTarefa);
    return tarefa;
  }

}
