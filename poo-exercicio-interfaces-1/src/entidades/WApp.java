package entidades;

public record WApp(String texto) implements Mensagem
{
   @Override
   public String enviarMensagem()
   {
      return "Mensagem enviada via WhatsApp: ";
   }
}
