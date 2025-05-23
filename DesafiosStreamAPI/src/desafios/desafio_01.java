package desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 1 - Mostre a lista na ordem numérica:

public class desafio_01
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      List<Integer> numerosOrdenados = numeros.stream().sorted().toList();
      System.out.println();
      System.out.print("Números ordenados: " + numerosOrdenados);
   }
}
