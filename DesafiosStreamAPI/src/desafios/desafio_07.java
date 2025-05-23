package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Desafio 7 - Encontrar o segundo número maior da lista:

public class desafio_07
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      int segundoMaior = numeros.stream()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElseThrow();
      System.out.print("O segundo maior número é: " + segundoMaior);
   }
}
