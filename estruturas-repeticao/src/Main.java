import java.util.ArrayList;

public class Main
{
   public static void main(String[] args)
   {
      // For

      System.out.println("\nFor:");
      Integer numeroA = 5;
      Integer a, totalA = 0;
      for(a = 0; a < numeroA; a++)
      {
         totalA = totalA + a;
      }
      System.out.println(totalA);

      // For em arrays

      System.out.println("\nFor em arrays:");
      Integer numerosA[] = {0, 1, 1, 2, 3, 5, 8, 13, 21};
      Integer b, totalB = 0;
      for(b = 0; b < numerosA.length; b++)
      {
         totalB = totalB + numerosA[b];
      }
      System.out.println(totalB);

      // For-Each

      System.out.println("\nFor-Each:");
      Integer numerosB[] = {0, 1, 1, 2, 3, 5, 8, 13, 21};
      Integer c, totalC = 0;
      for(Integer numeroB : numerosB)
      {
         System.out.println(numeroB);
      }

      // While

      System.out.println("\nWhile:");
      int d = 0;
      while(d < 5)
      {
         System.out.println(d);
         d++;
      }

      // Do While

      System.out.println("\nDo While:");
      int e = 0;
      do
      {
         System.out.println(e);
         e++;
      } while(e < 5);

      // Break e Continue

      /*
         A instrução break pode ser usada para "pular para fora" de
         uma instrução switch ou ainda, para fora de um loop.
       */
      /*
         A instrução continue interrompe uma iteração (no loop),
         se uma condição especificada ocorrer, e continua com a
         próxima iteração no loop.
       */

      System.out.println("\nFim do programa");
   }
}