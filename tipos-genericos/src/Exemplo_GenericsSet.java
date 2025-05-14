import java.util.HashSet;
import java.util.Set;

public class Exemplo_GenericsSet
{
   public static void main(String[] args)
   {
      // Exemplo sem Generics
      Set conjuntoSemGenerics = new HashSet();
      conjuntoSemGenerics.add("Elemento 1");
      conjuntoSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

      // Exemplo com Generics
      Set<String> conjuntoGenerics = new HashSet<>();
      conjuntoGenerics.add("Elemento 1");
      conjuntoGenerics.add("Elemento 2");

      // Iterando sobre o conjunto com Generics
      for (String elemento : conjuntoGenerics)
      {
         System.out.println(elemento);
      }

      // Iterando sobre o conjunto sem Generics (necessário fazer cast)
      for (Object elemento : conjuntoSemGenerics)
      {
         // Não funciona por causa da inclusão de inteiro na
         // linha 11. Erro: java.lang.ClassCastException
         // String str = (String) elemento;
         String str = elemento.toString();
         System.out.println(str);
      }
   }
}
