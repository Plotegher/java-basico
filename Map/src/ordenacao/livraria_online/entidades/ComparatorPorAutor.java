package ordenacao.livraria_online.entidades;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>>
{
   @Override
   public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
      return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
   }
}
