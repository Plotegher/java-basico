package desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 3 - Verifique se todos os números da lista são positivos:

public class desafio_03
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      boolean resultado = numeros.stream()
            .allMatch(n -> n > 0);
      System.out.print("Todos os números são positivos? " + resultado);
   }
}
