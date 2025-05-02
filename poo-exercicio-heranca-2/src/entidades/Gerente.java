package entidades;

public class Gerente extends Colaborador
{
   public Gerente(String nome, String email, String senha, Boolean admin)
   {
      super(nome, email, senha, admin = true);
   }

   public void relatorioFinanceiro()
   {
      System.out.println("Gerou relatório financeiro!");
   }

   public void consultarVendas()
   {
      System.out.println("Gerou relatório geral de vendas!");
   }
}
