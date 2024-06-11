# To-do List (Gerenciador de Tarefas)

Este projeto é um gerenciador de tarefas implementado em Java. Ele permite a criação de pastas, adição e remoção de tarefas dentro dessas pastas, e a listagem de pastas e tarefas.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos Java:

1. **AcessoDados.java**
   - Classe responsável pela interação com o "banco de dados", que neste caso é uma implementação em memória usando a classe `ImplementaCollections`.

2. **GerenciadorDeTarefas.java**
   - Classe que gerencia as operações de criação, listagem e remoção de pastas e tarefas. Utiliza a classe `AcessoDados` para persistir dados.

3. **ImplementaCollections.java**
   - Implementação de um banco de dados em memória usando uma lista (`List<T>`). Implementa a interface `InterfaceBanco`.

4. **InterfaceBanco.java**
   - Interface que define as operações básicas de um banco de dados: salvar (`save`), deletar (`delete`), atualizar (`update`) e encontrar todos (`findAll`).

5. **Main.java**
   - Classe principal que contém o método `main`. Esta classe apresenta um menu interativo para o usuário executar operações no gerenciador de tarefas.

6. **Pasta.java**
   - Classe que representa uma pasta, contendo um nome e uma lista de tarefas (`Tarefas`).

7. **Tarefas.java**
   - Classe que representa uma tarefa, contendo título, descrição, status, data de início, prazo e prioridade.

## Funcionalidades

- **Criar Pasta**: Permite ao usuário criar uma nova pasta.
- **Listar Pastas**: Exibe todas as pastas existentes.
- **Remover Pasta**: Remove uma pasta existente pelo nome.
- **Adicionar Tarefa**: Adiciona uma nova tarefa a uma pasta existente.
- **Listar Tarefas**: Lista todas as tarefas em todas as pastas.
- **Remover Tarefa**: Remove uma tarefa de uma pasta existente.

## Como Usar

### Requisitos

- Java JDK instalado

### Executando o Programa

1. Compile todos os arquivos `.java`:
    ```bash
    javac *.java
    ```
2. Execute a classe principal:
    ```bash
    java Main
    ```

### Exemplo de Uso

O programa apresenta um menu interativo para o usuário:

1. **Criar Pasta**: Digite `1` e insira o nome da nova pasta.
2. **Listar Pastas**: Digite `2` para listar todas as pastas.
3. **Remover Pasta**: Digite `3` e insira o nome da pasta a ser removida.
4. **Adicionar Tarefa**: Digite `4` e insira o nome da pasta onde deseja adicionar a tarefa, seguido pelos detalhes da tarefa.
5. **Listar Tarefas**: Digite `5` para listar todas as tarefas.
6. **Remover Tarefa**: Digite `6` e insira o nome da pasta e os detalhes da tarefa a ser removida.
7. **Sair**: Digite `7` para sair do programa.

### Autores:

Este projeto foi desenvolvido por:

Ellen de Oliveira Melo

Edna Juvêncio Nunes

João Victor Noronha Cunha Santiago

