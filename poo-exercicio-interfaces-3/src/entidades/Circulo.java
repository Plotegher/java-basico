package entidades;

public record Circulo (double raio) implements Figura
{
   @Override
   public double calcularArea()
   {
      return Math.PI * (Math.pow(raio, 2));
   }
}
