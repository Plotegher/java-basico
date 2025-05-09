package entidades;

public record Sms(String texto) implements Mensagem
{
   @Override
   public String enviarMensagem()
   {
      return "Mensagem enviada via SMS: ";
   }
}
