package pesquisa.estoque_com_precos.programa;

import pesquisa.estoque_com_precos.entidades.EstoqueProdutos;
import pesquisa.estoque_com_precos.entidades.Produto;

public class Main
{
   public static void main(String[] args)
   {
      EstoqueProdutos estoque = new EstoqueProdutos();

      // Exibe o estoque vazio
      estoque.exibirProdutos();

      // Adiciona produtos ao estoque
      estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
      estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
      estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
      estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

      // Exibe os produtos no estoque
      estoque.exibirProdutos();

      // Calcula e exibe o valor total do estoque
      System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

      // Obtém e exibe o produto mais caro
      Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
      System.out.println("Produto mais caro: " + produtoMaisCaro);

      // Obtém e exibe o produto mais barato
      Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
      System.out.println("Produto mais barato: " + produtoMaisBarato);

      // Obtém e exibe o produto com a maior quantidade em valor no estoque
      Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorValorEmEstoque();
      System.out.println("Produto com maior valor total em estoque: " + produtoMaiorQuantidadeValorTotal);
   }
}
