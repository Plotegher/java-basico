package entidades;

public class Atendente extends Colaborador
{
   private Double caixa;

   public Atendente(String nome, String email, String senha, Boolean admin, Double caixa)
   {
      super(nome, email, senha, admin = false);
      this.caixa = caixa;
   }

   public Double getCaixa()
   {
      return caixa;
   }

   public void setCaixa(Double caixa)
   {
      this.caixa = caixa;
   }

   public void receberPagamento(Double venda)
   {
      setCaixa(getCaixa() + venda);
      System.out.println("Recebeu pagamento no valor de: R$ " + venda);
   }

   public void fecharCaixa()
   {
      System.out.println("Fechou o caixa!");
   }
}
