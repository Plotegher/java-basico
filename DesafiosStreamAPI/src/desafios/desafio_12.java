package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Desafio 12 - Encontre o produto de todos os números da lista:

public class desafio_12
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      Optional<Integer> produto = numeros.stream()
            .reduce((a, b) -> a * b);
      System.out.println("Produto de todos os números: " + produto);
   }
}
