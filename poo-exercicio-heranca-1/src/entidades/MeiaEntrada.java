package entidades;

public class MeiaEntrada extends Ingresso
{
   public MeiaEntrada(Double valor, String titulo)
   {
      super(valor, titulo);
   }

   @Override
   public Double beneficio()
   {
      return getValor() / 2.0;
   }
}
