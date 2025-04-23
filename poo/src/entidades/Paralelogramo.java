package entidades;

// Implementação da interface

public class Paralelogramo implements Geometrica
{
   // Encapsulamento

   private double lado_1;
   private double lado_2;

   public Paralelogramo(double lado_1, double lado_2)
   {
      this.lado_1 = lado_1;
      this.lado_2 = lado_2;
   }

   public double getLado_1()
   {
      return lado_1;
   }

   public void setLado_1(double lado_1)
   {
      this.lado_1 = lado_1;
   }

   public double getLado_2()
   {
      return lado_2;
   }

   public void setLado_2(double lado_2)
   {
      this.lado_2 = lado_2;
   }

   // Polimorfismo

   @Override
   public double calcularArea()
   {
      return getLado_1() * getLado_2();
   }
}
