package entidades;

// Superclasse com herança total
// Classe abstrata que não pode ser instanciada

public abstract class Contribuinte
{
   private String nome;
   private Double renda;

   public Contribuinte(String nome, Double renda)
   {
      this.nome = nome;
      this.renda = renda;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public Double getRenda()
   {
      return renda;
   }

   public void setRenda(Double renda)
   {
      this.renda = renda;
   }

   /*
     Método abstrato que contrata sua implentação
     na subclasse.
   */

   public abstract Double imposto();
}
