package entidades;

public class Reproduzir implements Reprodutor
{
   public Reproduzir() {}

   @Override
   public void tocarMidia()
   {
      System.out.println("Tocando uma mídia!");
   }

   @Override
   public void pausarMidia()
   {
      System.out.println("Pausando uma mídia!");
   }

   @Override
   public void selecionarMidia()
   {
      System.out.println("Selecionando uma mídia!");
   }
}
