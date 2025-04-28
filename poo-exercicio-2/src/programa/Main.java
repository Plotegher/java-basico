package programa;

/*
   Exercício 3.2 do módulo Java e a Arte da Abstração com
   Classes e Encapsulamento do curso DIO - Java básico.
 */

import entidades.Carro;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      boolean ligado = false;
      int marcha = 0;
      int velocidade = 0;
      Carro carro = new Carro(ligado, marcha, velocidade);
      System.out.println("\nCarro criado!");

      System.out.println("\nSelecione uma opção:");
      System.out.println("1 - Ligar o carro");
      System.out.println("2 - Desligar o carro");
      System.out.println("3 - Acelerar o carro");
      System.out.println("4 - Frear o carro");
      System.out.println("5 - Virar à esquerda");
      System.out.println("6 - Virar à direita");
      System.out.println("7 - Verificar velocidade");
      System.out.println("8 - Subir marcha");
      System.out.println("9 - Descer marchar");
      System.out.println("0 - Sair do programa");

      int opcao = 2;
      while (opcao != 0)
      {
         System.out.print("\nOpção: ");
         opcao = sc.nextInt();

         switch (opcao)
         {
            case 1:
            {
               carro.ligarCarro();
               break;
            }

            case 2:
            {
               carro.desligarCarro();
               break;
            }

            case 3:
            {
               carro.acelerarCarro();
               break;
            }

            case 4:
            {
               carro.frearCarro();
               break;
            }

            case 5:
            {
               carro.virarEsquerda();
               break;
            }

            case 6:
            {
               carro.virarDireita();
               break;
            }

            case 7:
            {
               carro.verificarVelocidade();
               break;
            }

            case 8:
            {
               carro.subirMarcha();
               break;
            }

            case 9:
            {
               carro.descerMarcha();
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
   }
}