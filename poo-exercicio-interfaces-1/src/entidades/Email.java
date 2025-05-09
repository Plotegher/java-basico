package entidades;

public record Email(String texto) implements Mensagem
{
   @Override
   public String enviarMensagem()
   {
      return "Mensagem enviada via E-mail: ";
   }
}
