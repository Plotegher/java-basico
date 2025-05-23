package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

// Desafio 2 - Imprima a soma dos números pares da lista:

public class desafio_02
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      int resultado = numeros.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);
      System.out.print("Soma dos números pares: " + resultado);
   }
}
