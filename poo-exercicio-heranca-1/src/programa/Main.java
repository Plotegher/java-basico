package programa;

import entidades.Familia;
import entidades.MeiaEntrada;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("\nFilme Titanic - Ingresso inteiro: R$ 30.00");
      System.out.println("Selecione um tipo de ingresso:");
      System.out.print("\nM - Meia entrada ou F - Família: ");
      char opcao = scanner.next().toUpperCase().charAt(0);

      if (opcao == 'M')
      {
         MeiaEntrada meiaEntrada = new MeiaEntrada(30.0, "Titanic");
         System.out.println("O valor do seu ingresso é: R$ " + meiaEntrada.beneficio());
      }

      if (opcao == 'F')
      {
         System.out.print("Digite o n° de membros da família: ");
         Integer membros = scanner.nextInt();
         Familia familia = new Familia(30.0, "Titanic", membros);
         System.out.println("O valor do seu pacote é: R$ " + familia.beneficio());
      }

      scanner.close();
   }
}