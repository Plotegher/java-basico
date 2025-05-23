package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// Desafio 18 - Verifique se todos os números da lista são iguais:

public class desafio_18
{
   public static void main(String[] args)
   {
      List<Integer> lista_1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Lista 1: " + lista_1);

      System.out.println();
      Optional<Integer> primeiroElemento_1 = lista_1.stream().findFirst();
      boolean saoIguais_1 = lista_1.stream()
            .allMatch(e -> e.equals(primeiroElemento_1.get()));
      System.out.println("Todos os números da lista 1 são iguais? " + saoIguais_1);

      List<Integer> lista_2 = Arrays.asList(2, 2, 2, 2, 2);
      System.out.print("Lista 2: " + lista_2);

      System.out.println();
      Optional<Integer> primeiroElemento_2 = lista_2.stream().findFirst();
      boolean saoIguais_2 = lista_2.stream()
            .allMatch(e -> e.equals(primeiroElemento_2.get()));
      System.out.println("Todos os números da lista 2 são iguais? " + saoIguais_2);
   }
}
