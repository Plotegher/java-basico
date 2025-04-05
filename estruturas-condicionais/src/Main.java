public class Main
{
   public static void main(String[] args)
   {
      // Condicional simples

      System.out.println("\nCondicional simples:");
      Integer idade = 18;

      if(idade >= 18)
      {
         System.out.println("Permitido dirigir!");
      }

      // Condicional composta

      System.out.println("\nCondicional composta:");
      Integer lado = 2;

      if(lado == 1)
      {
         System.out.println("Cara!");
      }
      else
      {
         System.out.println("Coroa!");
      }

      // Condicional encadeada

      System.out.println("\nCondicional encadeada:");
      Integer nota = 7;
      Integer falta = 2;

      if(nota >= 7)
      {
         if(falta <= 3)
         {
            System.out.println("Aprovado!");
         }
         else
         {
            System.out.println("Reprovado por falta!");
         }
      }
      else
      {
         System.out.println("Reprovado por nota!");
      }

      // Condicional ternária

      System.out.println("\nCondicional ternária:");
      String resultado = lado == 1 ? "Cara!" : "Coroa!";
      System.out.println(resultado);

      // Switch Case

      System.out.println("\nSwitch case:");

      Integer dia = 1;

      switch (dia)
      {
         case 1:
         {
            System.out.println("Domingo");
            break;
         }
         case 2:
         {
            System.out.println("Segunda-feira");
            break;
         }
         case 3:
         {
            System.out.println("Terça-feira");
            break;
         }
         case 4:
         {
            System.out.println("Quarta-feira");
            break;
         }
         case 5:
         {
            System.out.println("Quinta-feira");
            break;
         }
         case 6:
         {
            System.out.println("Sexta-feira");
            break;
         }
         case 7:
         {
            System.out.println("Sábado");
            break;
         }
         default:
         {
            System.out.println("Indefinido");
         }
      }

      System.out.println("\nFim do programa!");
   }
}