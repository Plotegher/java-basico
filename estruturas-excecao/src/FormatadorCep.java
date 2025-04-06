public class FormatadorCep
{
   public static void main(String[] args) throws CepInvalidoException
   {
      try
      {
         String cepFormatado = formatarCep("23765064");
         System.out.println(cepFormatado);
      }
      catch (CepInvalidoException e)
      {
         System.out.println("O CEP não contém 8 dígitos");
      }

   }

   static String formatarCep(String cep) throws CepInvalidoException
   {
      if(cep.length() != 8)
      {
         throw new CepInvalidoException();
      }
      // Simulando um cep formatado
      return "23.765-064";
   }
}
