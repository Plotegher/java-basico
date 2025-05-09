package entidades;

public record Quadrado (double lado) implements Figura
{
   @Override
   public double calcularArea()
   {
      return Math.pow(lado, 2);
   }
}
