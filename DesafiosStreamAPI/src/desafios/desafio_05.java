package desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Desafio 5 - Calcule a média dos números maiores que 5:

public class desafio_05
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

      long quantMaioresQue5 = numeros.stream()
            .filter(n -> n > 5).count();

      int somaMaioresQue5 = numeros.stream()
            .filter(n -> n > 5)
            .reduce(0, Integer::sum);

      System.out.println("Média do números maiores que 5: " + (somaMaioresQue5 / quantMaioresQue5));
   }
}
