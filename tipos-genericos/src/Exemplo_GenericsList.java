import java.util.ArrayList;
import java.util.List;

public class Exemplo_GenericsList
{
   public static void main(String[] args)
   {
      // Exemplo sem Generics
      List listaSemGenerics = new ArrayList();
      listaSemGenerics.add("Elemento 1");
      listaSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

      // Exemplo com Generics
      List<String> listaGenerics = new ArrayList<>();
      listaGenerics.add("Elemento 1");
      listaGenerics.add("Elemento 2");

      // Iterando sobre a lista com Generics
      for (String elemento : listaGenerics)
      {
         System.out.println(elemento);
      }

      // Iterando sobre a lista sem Generics (necessário fazer cast)
      for (Object elemento : listaSemGenerics)
      {
         // Não funciona por causa da inclusão de inteiro na
         // linha 11. Erro: java.lang.ClassCastException
         // String str = (String) elemento;
         String str = elemento.toString();
         System.out.println(str);
      }
   }
}
