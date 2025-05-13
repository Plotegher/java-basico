package entidades;

public class Navegar implements Navegador
{
   public Navegar() {}

   @Override
   public void exibirPagina()
   {
      System.out.println("Exibindo uma página de internet!");
   }

   @Override
   public void adicionarAba()
   {
      System.out.println("Adicionando uma nova página ao navegador!");
   }

   @Override
   public void atualizarPagina()
   {
      System.out.println("Atualizando uma página de internet!");
   }
}
