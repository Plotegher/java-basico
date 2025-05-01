package entidades;

// Subclasse que herda da superclasse Contribuinte

public class PessoaFisica extends Contribuinte
{
   private Double despesas;

   public PessoaFisica(String nome, Double renda, Double despesas)
   {
      super(nome, renda);
      this.despesas = despesas;
   }

   public Double getDespesas()
   {
      return despesas;
   }

   public void setDespesas(Double despesas)
   {
      this.despesas = despesas;
   }

   public Double abatimento()
   {
      if (getDespesas() <= 0)
      {
         return 0.0;
      }
      else
      {
         return getDespesas() * 0.5;
      }
   }

   // Implementação do método imposto() contratado da superclasse
   // Polimorfismo do método adequado a classe PessoaFisica.

   @Override
   public Double imposto()
   {
      if (getRenda() < 20000.0)
      {
         return getRenda() * 0.15 - abatimento();
      }
      else
      {
         return getRenda() * 0.25 - abatimento();
      }
   }
}
