package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Desafio 8 - Somar os dígitos de todos os números da lista:

// Baseado no código de https://github.com/vitor277

// Eu não conhecia esses métodos de manipulação de Strings

public class desafio_08
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Números por ordem de entrada: " + numeros);

      System.out.println();
      List<Integer> listaDigitos = numeros.stream()
            .flatMap(n -> String.valueOf(n)
            .chars()
            .mapToObj(Character::getNumericValue))
            .toList();
      System.out.print("Lista de dígitos: " + listaDigitos);

      System.out.println();
      int resultado = listaDigitos.stream()
            .reduce(0, Integer::sum);
      System.out.print("A soma dos dígitos de todos os números da lista é: " + resultado);
   }
}
