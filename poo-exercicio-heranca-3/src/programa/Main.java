package programa;

import entidades.Americano;
import entidades.Brasileiro;
import entidades.Relogio;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite um valor para horas entre 0 e 23: ");
      int horas = scanner.nextInt();
      System.out.print("Digite um valor para minutos entre 0 e 59: ");
      int minutos = scanner.nextInt();
      System.out.print("Digite um valor para segundos entre 0 e 59: ");
      int segundos = scanner.nextInt();

      System.out.print("Escolha um formato de relógio (A - Americano ou B - Brasileiro): ");
      char tipo = scanner.next().toUpperCase().charAt(0);

      if (tipo == 'A')
      {
         Relogio americano = new Americano(horas, minutos, segundos);
         System.out.println(americano.converterHora(americano));
         //System.out.println(americano.fusoHorario());
      }
      else if (tipo == 'B')
      {
         Relogio brasileiro = new Brasileiro(horas, minutos, segundos);
         System.out.println(brasileiro.converterHora(brasileiro));
         //System.out.println(brasileiro.fusoHorario());
      }
      else
      {
         System.out.println("Escolha um modelo válido!");
      }
      scanner.close();
   }
}