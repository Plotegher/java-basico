package programa;

/*
  Exercício 3.1 do módulo Java e a Arte da Abstração com
  Classes e Encapsulamento do curso DIO - Java básico.
*/

import entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.println("\n================= CRIE A SUA CONTA =================");
      System.out.print("\nDigite o depósito inicial: ");
      double saldoInicial = sc.nextDouble();

      Conta conta = new Conta(saldoInicial);
      conta.definirLimite(saldoInicial);

      System.out.println("\n================= DIGITE UMA OPÇÃO =================");
      System.out.println("1 - Consultar saldo");
      System.out.println("2 - Consultar cheque especial");
      System.out.println("3 - Depositar dinheiro");
      System.out.println("4 - Sacar dinheiro");
      System.out.println("5 - Pagar um boleto");
      System.out.println("6 - Verificar se a conta está usando cheque especial");
      System.out.println("7 - Encerrar o acesso");

      int opcao = 0;
      while(opcao != 7)
      {
         System.out.print("\nOpção: ");
         opcao = sc.nextInt();

         switch (opcao)
         {
            case 1:
            {
               System.out.println("Consultar saldo");
               conta.consultarSaldo();
               System.out.println("O seu saldo atual é: R$ " + conta.getSaldo());
               break;
            }

            case 2:
            {
               System.out.println("Consultar cheque especial");
               conta.consultarLimite();
               System.out.println("O seu limite atual é: R$ " + conta.getLimite());
               break;
            }

            case 3:
            {
               System.out.println("Depositar dinheiro");
               System.out.print("Digite o valor do depósito: ");
               double deposito = sc.nextDouble();
               conta.depositarDinheiro(deposito);
               System.out.println("Você depositou R$ " + deposito);
               break;
            }

            case 4:
            {
               System.out.println("Sacar dinheiro");
               System.out.print("Digite o valor do saque: ");
               double saque = sc.nextDouble();
               conta.sacarDinheiro(saque);
               break;
            }

            case 5:
            {
               System.out.println("Pagar um boleto");
               System.out.print("Digite o valor do pagamento: ");
               double pagamento = sc.nextDouble();
               conta.pagarBoleto(pagamento);
               break;
            }

            case 6:
            {
               System.out.println("Verificar se a conta está usando cheque especial");
               conta.verificarLimite();
               break;
            }

            case 7:
            {
               System.out.println("\n================= FIM DA OPERAÇÃO ==================");
               break;
            }

            default:
            {
               System.out.println("Digite uma opção válida!");
            }
         }
      }
   }
}