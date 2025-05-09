package entidades;

public class Vestuario implements Categoria
{
   @Override
   public double calcularImpostos(double valor)
   {
      return valor * 0.025;
   }
}
