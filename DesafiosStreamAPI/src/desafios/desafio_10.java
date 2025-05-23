package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:

public class desafio_10
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      List<Integer> impares = numeros.stream()
            .filter(n -> n % 2 != 0).toList();

      System.out.println();
      Map<Boolean, List<Integer>> multiplos3 = impares.stream()
            .collect(Collectors.groupingBy(n -> n % 3 == 0));
      System.out.println("Ímpares múltiplos de 3: " + multiplos3);

      Map<Boolean, List<Integer>> multiplos5 = impares.stream()
            .collect(Collectors.groupingBy(n -> n % 5 == 0));
      System.out.println("Ímpares múltiplos de 5: " + multiplos5);
   }
}
