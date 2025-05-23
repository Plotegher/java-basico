package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Desafio 17 - Filtrar os números primos da lista:

public class desafio_17
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      List<Integer> primos = numeros.stream()
            .filter(desafio_17::ePrimo)
            .toList();
      System.out.println("Os números primos da lista são: " + primos);
   }

   public static boolean ePrimo(Integer valor)
   {
      // 0 e 1 não são primos
      if (valor <= 1) {return false;}
      // 2 é o único primo par
      if (valor == 2) {return true;}
      // Números pares maiores que 2 não são primos
      if (valor % 2 == 0) {return false;}
      // Verifica apenas divisores ímpares até a raiz quadrada do número
      for (int i = 3; i * i <= valor; i += 2)
      {
         if (valor % i == 0) {return false;}
      }
      return true;
   }
}
