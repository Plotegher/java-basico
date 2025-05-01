package entidades;

// Subclasse que herda da superclasse Contribuinte

public class PessoaJuridica extends Contribuinte
{
   private Integer funcionarios;

   public PessoaJuridica(String nome, Double renda, Integer funcionarios)
   {
      super(nome, renda);
      this.funcionarios = funcionarios;
   }

   public Integer getFuncionarios()
   {
      return funcionarios;
   }

   public void setFuncionarios(Integer funcionarios)
   {
      this.funcionarios = funcionarios;
   }

   // Implementação do método imposto() contratado da superclasse
   // Polimorfismo do método adequado a classe PessoaJuridica.

   @Override
   public Double imposto()
   {
      if (getFuncionarios() > 10)
      {
         return getRenda() * 0.14;
      }
      else
      {
         return getRenda() * 0.16;
      }
   }
}
