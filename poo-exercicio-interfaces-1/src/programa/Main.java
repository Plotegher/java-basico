package programa;

/*
   Exercício 5.1 do módulo Dominando Interfaces e
   Lambdas em Java do curso DIO - Java básico.
*/

import entidades.Email;
import entidades.Sms;
import entidades.Social;
import entidades.WApp;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.println("\nEscolha a forma de envio de sua mensagem:");
      System.out.println("\n1 - Por SMS");
      System.out.println("2 - Por E-mail");
      System.out.println("3 - Por Rede Social");
      System.out.println("4 - Por Por WhatsApp");
      System.out.println("0 - Por SMS");

      int opcao = -1;
      while (opcao != 0)
      {
         String mensagem = "";

         System.out.print("\nOpcao: ");
         opcao = scanner.nextInt();

         switch (opcao)
         {
            case 1:
            {
               Sms sms = new Sms(mensagem);
               System.out.print("Digite sua mensagem: ");
               scanner.nextLine();
               mensagem = scanner.nextLine();
               System.out.println(sms.enviarMensagem() + mensagem);
               break;
            }
            case 2:
            {
               Email email = new Email(mensagem);
               System.out.print("Digite sua mensagem: ");
               scanner.nextLine();
               mensagem = scanner.nextLine();
               System.out.println(email.enviarMensagem() + mensagem);
               break;
            }
            case 3:
            {
               Social social = new Social(mensagem);
               System.out.print("Digite sua mensagem: ");
               scanner.nextLine();
               mensagem = scanner.nextLine();
               System.out.println(social.enviarMensagem() + mensagem);
               break;
            }
            case 4:
            {
               WApp wApp = new WApp(mensagem);
               System.out.print("Digite sua mensagem: ");
               scanner.nextLine();
               mensagem = scanner.nextLine();
               System.out.println(wApp.enviarMensagem() + mensagem);
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