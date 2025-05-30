package ordenacao.cadastro_de_produtos.entidades;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos
{
   // Atributo
   private Set<Produto> produtoSet;

   public CadastroProdutos()
   {
      this.produtoSet = new HashSet<>();
   }

   // Getter
   public Set<Produto> getProdutoSet()
   {
      return produtoSet;
   }

   //Métodos especiais
   public void adicionarProduto(long cod, String nome, double preco, int quantidade)
   {
      produtoSet.add(new Produto(cod, nome, preco, quantidade));
   }

   public Set<Produto> exibirProdutosPorNome()
   {
      Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

      if (!produtoSet.isEmpty())
      {
         return produtosPorNome;
      }
      else
      {
         throw new RuntimeException("O conjunto está vazio!");
      }
   }

   public Set<Produto> exibirProdutosPorPreco()
   {
      Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

      if (!produtoSet.isEmpty())
      {
         produtosPorPreco.addAll(produtoSet);
         return produtosPorPreco;
      }
      else
      {
         throw new RuntimeException("O conjunto está vazio!");
      }
   }
}
