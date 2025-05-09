package entidades;

public record Triangulo (double lado1, double lado2, double lado3) implements Figura
{
   @Override
   public double calcularArea()
   {
      double sP = (lado1 + lado2 + lado3) / 2;
      return Math.sqrt((sP * (sP - lado1) * (sP - lado2) * (sP - lado3)));
   }
}
