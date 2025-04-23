package entidades;

// Implementação da interface

public class Triangulo implements Geometrica
{
   // Encapsulamento

   private double altura;
   private double largura;

   public Triangulo(double altura, double largura)
   {
      this.altura = altura;
      this.largura = largura;
   }

   public double getAltura()
   {
      return altura;
   }

   public void setAltura(double altura)
   {
      this.altura = altura;
   }

   public double getLargura()
   {
      return largura;
   }

   public void setLargura(double largura)
   {
      this.largura = largura;
   }

   // Polimorfismo

   @Override
   public double calcularArea()
   {
      return (getAltura() * getLargura()) / 2.0;
   }
}
