package entidades;

public class Saude implements Categoria
{
   @Override
   public double calcularImpostos(double valor)
   {
      return valor * 0.015;
   }
}
