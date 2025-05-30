package pesquisa.contagem_de_palavras.programa;

import pesquisa.contagem_de_palavras.entidades.ContagemPalavras;

public class Main
{
   public static void main(String[] args) {
      ContagemPalavras contagemLinguagens = new ContagemPalavras();

      // Adiciona linguagens e suas contagens
      contagemLinguagens.adicionarPalavras("Java", 2);
      contagemLinguagens.adicionarPalavras("Python", 8);
      contagemLinguagens.adicionarPalavras("JavaScript", 1);
      contagemLinguagens.adicionarPalavras("C#", 6);

      // Exibe a contagem total de linguagens
      System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

      // Encontra e exibe a linguagem mais frequente
      String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
      System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
   }
}
