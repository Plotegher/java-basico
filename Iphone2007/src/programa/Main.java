package programa;

import entidades.Navegar;
import entidades.Reproduzir;
import entidades.Telefonar;

import java.util.Scanner;

/*
  Desafio de diagramação e codificação de classes de um IPhone 2007.
  Curso DIO Java básico.
*/

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\nEscolha uma opção: ");
      System.out.println("\n1 - Telefonar");
      System.out.println("2 - Navegar na Internet");
      System.out.println("3 - Reproduzir Mídia");
      System.out.println("4 - Desligar");

      int opcao = -1;
      while (opcao != 0)
      {
         System.out.print("\nOpção: ");
         opcao = scanner.nextInt();

         switch (opcao)
         {
            case 1:
            {
               Telefonar telefonar = new Telefonar();
               telefonar.ligar();
               telefonar.atender();
               telefonar.iniciarCorreio();
               break;
            }
            case 2:
            {
               Navegar navegar = new Navegar();
               navegar.adicionarAba();
               navegar.exibirPagina();
               navegar.atualizarPagina();
               break;
            }
            case 3:
            {
               Reproduzir reproduzir = new Reproduzir();
               reproduzir.selecionarMidia();
               reproduzir.tocarMidia();
               reproduzir.pausarMidia();
               break;
            }
            case 0:
            {
               System.out.print("Desligou telefone!\n");
               break;
            }
            default:
            {
               System.out.print("Opção inválida!\n");
            }
         }
      }
      scanner.close();
   }
}