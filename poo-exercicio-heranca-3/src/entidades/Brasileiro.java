package entidades;

import java.util.Objects;

public non-sealed class Brasileiro extends Relogio
{
   public Brasileiro() {
      super();
   }

   public Brasileiro(Integer hora, Integer minuto, Integer segundo)
   {
      super(hora, minuto, segundo);
   }

   @Override
   public String converterHora(Relogio relogio)
   {
      Brasileiro brasileiro = new Brasileiro();

      if (Objects.equals(relogio, brasileiro))
      {
         this.segundo = brasileiro.getSegundo();
         this.minuto = brasileiro.getMinuto();
         this.hora = brasileiro.getHora();
      }
      return String.format("%02d:%02d:%02d", hora, minuto, segundo);
   }

   @Override
   public void fusoHorario()
   {

   }
}
