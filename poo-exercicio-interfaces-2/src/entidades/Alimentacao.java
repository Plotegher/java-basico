package entidades;

public class Alimentacao implements Categoria
{
   @Override
   public double calcularImpostos(double valor)
   {
      return valor * 0.010;
   }
}
