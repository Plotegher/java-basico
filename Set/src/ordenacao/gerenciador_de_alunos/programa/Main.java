package ordenacao.gerenciador_de_alunos.programa;

import ordenacao.gerenciador_de_alunos.entidades.GerenciadorAlunos;

public class Main
{
   public static void main(String[] args) {
      // Criando uma instância do GerenciadorAlunos
      GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

      // Adicionando alunos ao gerenciador
      gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
      gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
      gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
      gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

      // Exibindo todos os alunos no gerenciador
      System.out.println("Alunos no gerenciador:");
      System.out.println(gerenciadorAlunos.getAlunosSet());

      // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
      gerenciadorAlunos.removerAlunoPorMatricula(000L);
      gerenciadorAlunos.removerAlunoPorMatricula(123457L);
      System.out.println(gerenciadorAlunos.getAlunosSet());

      // Exibindo alunos ordenados por nome
      gerenciadorAlunos.exibirAlunosPorNome();

      // Exibindo alunos ordenados por nota
      gerenciadorAlunos.exibirAlunosPorNota();
   }
}
