package programa;

import excecoes.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador
{
   public static void main(String[] args) throws ParametrosInvalidosException
   {
      try
      {
         Scanner sc = new Scanner(System.in);

         System.out.println("Início do programa!");

         System.out.print("\nDigite o primeiro número: ");
         int num_1 = sc.nextInt();
         System.out.print("Digite o segundo número: ");
         int num_2 = sc.nextInt();

         contar(num_1, num_2);

         sc.close();

         System.out.println("\nFim do programa!");
      }
      catch (Exception e)
      {
         System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
      }
   }

   public static void contar(int parametro_1, int parametro_2) throws ParametrosInvalidosException
   {
      if(parametro_1 > parametro_2)
      {
         throw new ParametrosInvalidosException();
      }
      else
      {
         int i = 0;
         int num_1 = 0;
         int num_2 = 0;
         int quant = 0;
         for(i = parametro_1; i <= parametro_2; i++)
         {
            quant++;
            System.out.println("Imprimindo o número " + i);
         }
         System.out.println("\nTotal de números contados no intervalo: " + quant);
      }
   }
}