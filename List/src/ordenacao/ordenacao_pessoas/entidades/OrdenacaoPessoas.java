package ordenacao.ordenacao_pessoas.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas
{
   //atributo
   private List<Pessoa> pessoaList;

   //construtor
   public OrdenacaoPessoas()
   {
      this.pessoaList = new ArrayList<>();
   }

   public List<Pessoa> getPessoaList()
   {
      return pessoaList;
   }

   public void adicionarPessoa(String nome, int idade, double altura)
   {
      pessoaList.add(new Pessoa(nome, idade, altura));
   }

   public List<Pessoa> ordenarPorIdade()
   {
      List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

      if (!pessoaList.isEmpty())
      {
         // O método sort sabe que deve ordenar a lista usando a interface Comparable
         // implementada pela classe Pessoa.
         Collections.sort(pessoasPorIdade);
         return pessoasPorIdade;
      }
      else
      {
         throw new RuntimeException("A lista está vazia!");
      }
   }

   public List<Pessoa> ordenarPorAltura()
   {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      if (!pessoaList.isEmpty())
      {
         Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
         return pessoasPorAltura;
      }
      else
      {
         throw new RuntimeException("A lista está vazia!");
      }
   }
}
