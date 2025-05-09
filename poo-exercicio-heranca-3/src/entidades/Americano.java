package entidades;

import java.util.Objects;

public non-sealed class Americano extends Relogio
{
   private String turno;

   public Americano() {
      super();
   }

   public Americano(Integer hora, Integer minuto, Integer segundo)
   {
      super(hora, minuto, segundo);
      this.turno = turno;
   }

   public String getTurno()
   {
      return turno;
   }

   public void turnoAm()
   {
      this.turno = "am";
   }

   public void turnoPm()
   {
      this.turno = "pm";
   }

   public void setHora(Integer hora)
   {
      turnoAm();
      if ((hora > 12) && (hora <= 23))
      {
         turnoPm();
         this.hora = hora - 12;
      }
      else if (hora >= 24)
      {
         this.hora = 0;
      }
      else
      {
         this.hora = hora;
      }
   }

   @Override
   public String converterHora(Relogio relogio)
   {
      Americano americano = new Americano();

      if (Objects.equals(relogio, americano))
      {
         this.segundo = americano.getSegundo();
         this.minuto = americano.getMinuto();
         if (americano.getTurno().equals("pm"))
         {
            this.hora = americano.getHora() + 12;
         }
         else
         {
            this.hora = americano.getHora();
         }
      }
      return String.format("%02d:%02d:%02d %s", hora, minuto, segundo, turno);
   }

   @Override
   public void fusoHorario()
   {

   }
}
