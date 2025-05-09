package entidades;

public class Cultura implements Categoria
{
   @Override
   public double calcularImpostos(double valor)
   {
      return valor * 0.040;
   }
}
