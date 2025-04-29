package programa;

/*
  Exercício 3.3 do módulo Java e a Arte da Abstração com
  Classes e Encapsulamento do curso DIO - Java básico.
*/

import entidades.BanhoPet;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.println("\nSelecione uma opção:");
      System.out.println("1 - Dar banho no pet");
      System.out.println("2 - Abastecer com água");
      System.out.println("3 - Abastecer com shampoo");
      System.out.println("4 - Verificar nível de água");
      System.out.println("5 - Verificar nível de shampoo");
      System.out.println("6 - Verificar se tem pet no banho");
      System.out.println("7 - Colocar pet na máquina");
      System.out.println("8 - Retirar pet da máquina");
      System.out.println("9 - Limpar máquina");
      System.out.println("0 - Sair do programa");

      BanhoPet banhoPet = new BanhoPet();

      int opcao = 2;
      while (opcao != 0)
      {
         System.out.print("\nOpção: ");
         opcao = sc.nextInt();

         switch (opcao)
         {
            case 1:
            {
               banhoPet.darBanho();
               break;
            }

            case 2:
            {
               banhoPet.abastecerAgua();
               break;
            }

            case 3:
            {
               banhoPet.abastecerShampoo();
               break;
            }

            case 4:
            {
               banhoPet.nivelAgua();
               break;
            }

            case 5:
            {
               banhoPet.nivelShampoo();
               break;
            }

            case 6:
            {
               banhoPet.temPet();
               break;
            }

            case 7:
            {
               banhoPet.colocarPet();
               break;
            }

            case 8:
            {
               banhoPet.retirarPet();
               break;
            }

            case 9:
            {
               banhoPet.limparMaquina();
               break;
            }

            case 0:
            {
               System.out.println("\nFim do programa!");
               break;
            }

            default:
            {
               System.out.println("Opção inválida!");
            }
         }
      }
      sc.close();
   }
}