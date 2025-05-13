package entidades;

public class Telefonar implements Telefone
{
   public Telefonar() {}

   @Override
   public void ligar()
   {
      System.out.println("Efetuando uma ligação!");
   }

   @Override
   public void atender()
   {
      System.out.println("Atendendo uma ligação!");
   }

   @Override
   public void iniciarCorreio()
   {
      System.out.println("Iniciando correio de voz!");
   }
}
