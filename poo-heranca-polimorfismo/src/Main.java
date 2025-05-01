import entidades.PessoaFisica;
import entidades.PessoaJuridica;

import java.util.Locale;
import java.util.Scanner;

/*
   Solução baseada no código do Professor Nélio Alves
   https://www.youtube.com/watch?v=eDsS3JM5iXw
*/

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a categoria do contribuinte (F ou J): ");
      String pessoa = scanner.nextLine().toUpperCase();

      if (pessoa.equals("F"))
      {
         System.out.print("Digite o nome: ");
         String nome = scanner.next();
         System.out.print("Digite a renda: ");
         Double renda = scanner.nextDouble();
         System.out.print("Digite a despesa: ");
         Double despesa = scanner.nextDouble();

         PessoaFisica pessoaFisica = new PessoaFisica(nome, renda, despesa);

         Double apuracao = pessoaFisica.imposto();
         System.out.printf("O seu imposto será: %.2f", apuracao);
      }

      if (pessoa.equals("J"))
      {
         System.out.print("Digite a razão: ");
         String nome = scanner.next();
         System.out.print("Digite a renda: ");
         Double renda = scanner.nextDouble();
         System.out.print("Digite o n° de funcionários: ");
         Integer funcionarios = scanner.nextInt();

         PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, renda, funcionarios);

         Double apuracao = pessoaJuridica.imposto();
         System.out.printf("O seu imposto será: %.2f", apuracao);
      }
   }
}