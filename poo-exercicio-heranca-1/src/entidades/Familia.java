package entidades;

public class Familia extends Ingresso
{
   private Integer membros;

   public Familia(Double valor, String titulo, Integer membros)
   {
      super(valor, titulo);
      this.membros = membros;
   }

   public Integer getMembros()
   {
      return membros;
   }

   public void setMembros(Integer membros)
   {
      this.membros = membros;
   }

   @Override
   public Double beneficio()
   {
      Double total;
      if (getMembros() > 3)
      {
         total = getValor() * getMembros();
         return total - (total * 0.05);
      }
      return beneficio();
   }
}
