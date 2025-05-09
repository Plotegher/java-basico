package programa;

/*
   Exercício 5.2 do módulo Dominando Interfaces e
   Lambdas em Java do curso DIO - Java básico.
*/

import entidades.Alimentacao;
import entidades.Saude;
import entidades.Vestuario;
import entidades.Cultura;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("\nEscolha a categoria do produto adquirido:");
      System.out.println("\n1 - Alimentação");
      System.out.println("2 - Saúde");
      System.out.println("3 - Vestuário");
      System.out.println("4 - Cultura");
      System.out.println("0 - Por SMS");

      int opcao = -1;
      while (opcao != 0)
      {
         double valor = 0.0;

         System.out.print("\nOpcao: ");
         opcao = scanner.nextInt();

         switch (opcao)
         {
            case 1:
            {
               Alimentacao alimentacao = new Alimentacao();
               System.out.print("Digite o nome do produto: ");
               scanner.nextLine();
               String nome = scanner.nextLine();
               System.out.print("Digite o valor do produto: ");
               valor = scanner.nextDouble();
               System.out.printf("Você pagou R$ %.2f de impostos no %s\n", alimentacao.calcularImpostos(valor), nome);
               break;
            }
            case 2:
            {
               Saude saude = new Saude();
               System.out.print("Digite o nome do produto: ");
               scanner.nextLine();
               String nome = scanner.nextLine();
               System.out.print("Digite o valor do produto: ");
               valor = scanner.nextDouble();
               System.out.printf("Você pagou R$ %.2f de impostos no %s\n", saude.calcularImpostos(valor), nome);
               break;
            }
            case 3:
            {
               Vestuario vestuario = new Vestuario();
               System.out.print("Digite o nome do produto: ");
               scanner.nextLine();
               String nome = scanner.nextLine();
               System.out.print("Digite o valor do produto: ");
               valor = scanner.nextDouble();
               System.out.printf("Você pagou R$ %.2f de impostos no %s\n", vestuario.calcularImpostos(valor), nome);
               break;
            }
            case 4:
            {
               Cultura cultura = new Cultura();
               System.out.print("Digite o nome do produto: ");
               scanner.nextLine();
               String nome = scanner.nextLine();
               System.out.print("Digite o valor do produto: ");
               valor = scanner.nextDouble();
               System.out.printf("Você pagou R$ %.2f de impostos no %s\n", cultura.calcularImpostos(valor), nome);
               break;
            }
            case 0:
            {
               System.out.println("Fim do programa!");
               break;
            }
            default:
            {
               System.out.println("Opção inválida!");
            }
         }
      }
      scanner.close();
   }
}