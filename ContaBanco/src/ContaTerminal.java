import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
{
   public static void main(String[] args)
   {
      Locale.setDefault(new Locale("pt", "BR"));
      Scanner sc = new Scanner(System.in);

      System.out.println("###################################################################");
      System.out.println();

      System.out.print("Por favor, digite o número da conta: ");
      Integer numero = sc.nextInt();

      System.out.print("Por favor, digite o número da agência com o dígito: ");
      String agencia = sc.next();

      System.out.print("Por favor digite o nome do cliente: ");
      String nome = sc.next();

      System.out.print("Por favor, digite o saldo inicial: ");
      Double saldo = sc.nextDouble();
      
      System.out.println();
      System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco!");
      System.out.println("Sua agência é " + agencia + ", " + "sua conta é " + numero + " e seu saldo de R$ " + saldo);
      System.out.println("já está disponível para saque.");

      System.out.println();
      System.out.println("###################################################################");
   }
}