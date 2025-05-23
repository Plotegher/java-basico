package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Desafio 13 - Filtrar os números que estão dentro de um intervalo:

public class desafio_13
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      int limiteInferior = 3;
      System.out.print("\nIntervalo inferior: " + limiteInferior);
      int limiteSuperior = 10;
      System.out.print("\nIntervalo superior: " + limiteSuperior);

      System.out.println();
      List<Integer> noIntervalo = numeros.stream()
            .filter(n -> n > limiteInferior && n < limiteSuperior)
            .toList();
      System.out.println("Números dentro do intervalo: " + noIntervalo);
   }
}
