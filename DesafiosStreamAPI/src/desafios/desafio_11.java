package desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:

public class desafio_11
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      List<Integer> quadrados = numeros.stream()
            .map(n -> n * n)
            .toList();
      System.out.println("Lista original ao quadrado: " + quadrados);

      int somaQuadrados = quadrados.stream()
            .reduce(0, Integer::sum);
      System.out.print("Soma dos quadrados: " + somaQuadrados);
   }
}
