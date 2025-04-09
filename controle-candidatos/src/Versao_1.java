import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
   Essa é a versão do professor sem orientação a
   objetos. Nessa versão a seleção de candidatos
   é obtida de um array de nomes pré definidos e
   de salários randômicos entre 1800.0 e 2200.0
*/

public class Versao_1
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);

      selecaoCandidatos();
   }

   private static void selecaoCandidatos()
   {
      String[] candidatos = {"Felipe", "Marcia", "Júlia", "Paulo",
         "Augusto", "Monica", "Fabrício", "Mirela", "Daniela", "Jorge"};

      int candidatosSelecionados = 0;
      int candidatoAtual = 0;
      double salarioBase = 2000.0;
      DecimalFormat formato = new DecimalFormat("#.##");

      while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
      {
         String candidato = candidatos[candidatoAtual];
         double salarioPretendido = valorPretendido();
         salarioPretendido = Double.valueOf((formato.format(salarioPretendido)));

         System.out.println("O candidato(a) " + candidato + " solicitou R$ "
               + salarioPretendido + " de salário.");

         if(salarioBase >= salarioPretendido)
         {
            System.out.println("O candidato(a) " + candidato + " foi selecionado(a)!");
            candidatosSelecionados++;
         }
         candidatoAtual++;
      }
   }

   private static double valorPretendido()
   {
      return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
   }

   private static boolean atender()
   {
      return new Random().nextInt(3) == 1;
   }
}
