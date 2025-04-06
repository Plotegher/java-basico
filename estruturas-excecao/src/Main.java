import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      try
      {
         Locale.setDefault(new Locale("pt", "BR"));
         Scanner sc = new Scanner(System.in);

         System.out.print("Digite seu nome: ");
         String nome = sc.next();

         System.out.print("Digite seu sobrenome: ");
         String sobrenome = sc.next();

         System.out.print("Digite sua idade: ");
         int idade = sc.nextInt();

         System.out.print("Digite sua altura: ");
         double altura = sc.nextDouble();

         // Imprimindo os dados obtidos pelo usuário
         System.out.println("Olá, me chamo " + nome.toUpperCase() +
               " " + sobrenome.toUpperCase());
         System.out.println("Tenho " + idade + " anos");
         System.out.println("Minha altura é " + altura + " m");
         sc.close();
      }
      catch (InputMismatchException e)
      {
         System.out.println("Erro de entrada nos campos Idade e/ou Altura!");
      }
      finally
      {
         System.out.println("\nFim do programa!");
      }
   }
}

/*
   Exceções checadas:
   - Conhecidas
   - São subclasses de Exception
   Exceções não checadas:
   - Desconhecidas
   - São subclasses de RuntimeException implementadas com
     IllegalArgumentException, NullPointerException ou IllegalStateException.
 */