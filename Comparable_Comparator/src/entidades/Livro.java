package entidades;

public class Livro implements Comparable<Livro>
{
   private String titulo;
   private String autor;
   private Integer ano;

   // Construtor
   public Livro(String titulo, String autor, int ano)
   {
      this.titulo = titulo;
      this.autor = autor;
      this.ano = ano;
   }

   // Usado para ordenar livros por ano
   public int compareTo(Livro livro)
   {
      return titulo.compareTo(livro.titulo);
   }

   // Métodos getters para acessar os dados privados
   public String getTitulo()
   {
      return titulo;
   }

   public String getAutor()
   {
      return autor;
   }

   public int getAno()
   {
      return ano;
   }
}
