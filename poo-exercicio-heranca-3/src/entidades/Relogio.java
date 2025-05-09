package entidades;

public sealed abstract class Relogio permits Americano, Brasileiro
{
   protected Integer hora;
   protected Integer minuto;
   protected Integer segundo;

   public Relogio() {}

   public Relogio(Integer hora, Integer minuto, Integer segundo)
   {
      this.hora = hora;
      this.minuto = minuto;
      this.segundo = segundo;
   }

   public Integer getHora()
   {
      return hora;
   }

   public void setHora(Integer hora)
   {
      if (hora >= 24)
      {
         this.hora = 24;
         return;
      }
      this.hora = hora;
   }

   public Integer getMinuto()
   {
      return minuto;
   }

   public void setMinuto(Integer minuto)
   {
      if (minuto >= 60)
      {
         this.minuto = 60;
         return;
      }
      this.minuto = minuto;
   }

   public Integer getSegundo()
   {
      return segundo;
   }

   public void setSegundo(Integer segundo)
   {
      if (segundo >= 60)
      {
         this.segundo = 60;
         return;
      }
      this.segundo = segundo;
   }

   public abstract String converterHora(Relogio relogio);

   public abstract void fusoHorario();
}
