package desafios;

import java.util.*;
import java.util.stream.Collectors;

// Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

public class desafio_09
{
   public static void main(String[] args)
   {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      System.out.print("Lista ORIGINAL: " + numeros);

      System.out.println();
      List<Integer> distintos = numeros.stream()
            .distinct().toList();
      System.out.print("Lista de DISTINTOS: " + distintos);

      System.out.println();
      System.out.println("Todos os números da lista ORIGINAL são distintos? " + eDistinto(numeros));
      System.out.print("Os números repetidos são: ");
      encontrarDuplicados(numeros);
   }

   public static <T> boolean eDistinto(List<T> lista)
   {
      if (lista == null) {return false;}
      if (lista.isEmpty()) {return true;}
      Set<T> diferenca = new HashSet<>(lista);
      return diferenca.size() == lista.size();
   }

   public static <T> void encontrarDuplicados(List<T> lista)
   {
      if (lista == null || lista.isEmpty())
      {
         System.out.println("A lista está vazia ou nula.");
         return;
      }

      Set<T> duplicates = lista.stream()
            .filter(i -> Collections.frequency(lista, i) > 1) // Filtra elementos com frequência > 1
            .collect(Collectors.toSet()); // Coleta em um Set para evitar imprimir o mesmo duplicado várias vezes
      duplicates.forEach(System.out::print);
   }
}
