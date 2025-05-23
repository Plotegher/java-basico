package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Desafio 15 - Verifique se a lista contém pelo menos um número negativo:

public class desafio_15
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, -3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      boolean negativo = numeros.stream()
            .anyMatch(n -> n < 0);
      System.out.println("Existe algum número negativo na lista? " + negativo);
   }
}
