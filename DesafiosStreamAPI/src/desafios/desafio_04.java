package desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 4 - Remova todos os valores ímpares:

public class desafio_04
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      List<Integer> removeImpares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .toList();
      System.out.println("Lista com ímpares removidos: " + removeImpares);
   }
}
