import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(new Locale("pt", "BR"));
      Scanner sc = new Scanner(System.in);

      System.out.print("Digite um texto: ");
      String texto = sc.next();

      System.out.print("Digite um número inteiro: ");
      Integer numero = sc.nextInt();

      System.out.print("Digite um número decimal: ");
      Double decimal = sc.nextDouble();

      System.out.print("Você digitou: " + texto + ", "
         + numero + ", " + decimal);
   }
}