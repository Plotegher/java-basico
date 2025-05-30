package desafios;

import java.util.Arrays;
import java.util.List;

// Desafio 6 - Verificar se a lista contém algum número maior que 10:

public class desafio_06
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      boolean resultado = numeros.stream()
            .allMatch(n -> n > 10);
      System.out.print("Existe algum número maior que 10? " + resultado);
   }
}
