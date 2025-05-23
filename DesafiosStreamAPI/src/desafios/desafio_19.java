package desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:

public class desafio_19
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      List<Integer> divisiveisPor3 = numeros.stream()
            .filter(n -> n % 3 == 0)
            .toList();
      System.out.println("Lista de números divisíveis por 3: " + divisiveisPor3);

      int soma_3 = divisiveisPor3.stream()
            .reduce(0, Integer::sum);
      System.out.println("A soma dos divisíveis por 3 é: " + soma_3);

      List<Integer> divisiveisPor5 = numeros.stream()
            .filter(n -> n % 5 == 0)
            .toList();
      System.out.println("Lista de números divisíveis por 5: " + divisiveisPor5);

      int soma_5 = divisiveisPor5.stream()
            .reduce(0, Integer::sum);
      System.out.println("A soma dos divisíveis por 5 é: " + soma_5);
   }
}
