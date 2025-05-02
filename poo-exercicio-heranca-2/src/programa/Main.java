package programa;

import entidades.Atendente;
import entidades.Gerente;
import entidades.Vendedor;

public class Main
{
   public static void main(String[] args)
   {
      System.out.println("\nAtividades da atendente:");
      System.out.println("--------------------------------------");

      Atendente atendente = new Atendente("Maria", "maria@email.com", "123", false, 100.0);
      atendente.receberPagamento(25.0);
      atendente.fecharCaixa();
      atendente.realizarLogin();
      atendente.realizarLogoff();
      atendente.alterarDados();
      atendente.alterarSenha();

      System.out.println("\nAtividades do vendedor:");
      System.out.println("--------------------------------------");

      Vendedor vendedor = new Vendedor("José", "jose@email.com", "456", false, 3);
      vendedor.realizarVenda();
      vendedor.consultarVendas();
      vendedor.realizarLogin();
      vendedor.realizarLogoff();
      vendedor.alterarDados();
      vendedor.alterarSenha();

      System.out.println("\nAtividades do gerente:");
      System.out.println("--------------------------------------");

      Gerente gerente = new Gerente("João", "joao@email.com", "789", true);
      gerente.relatorioFinanceiro();
      gerente.consultarVendas();
      gerente.realizarLogin();
      gerente.realizarLogoff();
      gerente.alterarDados();
      gerente.alterarSenha();
   }
}