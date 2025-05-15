package operacoes_basicas.carrinho_de_compras.programa;

/*
  Exercícios resolvidos de Collections Java do curso DIO - Java básico.
*/

import operacoes_basicas.carrinho_de_compras.entidades.Carrinho;

public class Main
{
   public static void main(String[] args) {
      // Criando uma instância do carrinho de compras
      Carrinho carrinho = new Carrinho();

      // Adicionando itens ao carrinho
      carrinho.adicionarItem("Lápis", 2d, 3);
      carrinho.adicionarItem("Lápis", 2d, 3);
      carrinho.adicionarItem("Apontador", 5d, 4);
      carrinho.adicionarItem("Caderno", 35d, 1);
      carrinho.adicionarItem("Borracha", 3d, 2);

      // Exibindo os itens no carrinho
      System.out.println("Exibindo itens");
      carrinho.exibirItens();

      // Removendo um item do carrinho
      System.out.println("\nRemovendo um item");
      carrinho.removerItem("Lápis");

      // Exibindo os itens atualizados no carrinho
      System.out.println("\nAtualizando itens");
      carrinho.exibirItens();


      // Calculando e exibindo o valor total da compra
      System.out.println("O valor total da compra é = " +
            carrinho.calcularValorTotal());
   }
}
