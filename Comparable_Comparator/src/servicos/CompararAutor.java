package servicos;

import entidades.Livro;

import java.util.Comparator;

public class CompararAutor implements Comparator<Livro>
{
   @Override
   public int compare(Livro livro1, Livro livro2)
   {
      return livro1.getAutor().compareTo(livro2.getAutor());
   }
}
