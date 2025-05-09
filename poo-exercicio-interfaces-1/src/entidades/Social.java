package entidades;

public record Social(String texto) implements Mensagem
{
   @Override
   public String enviarMensagem()
   {
      return "Mensagem enviada via Rede Social: ";
   }
}
