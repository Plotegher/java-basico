import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/*
   Minha segunda versão sem orientação a objetos.
   Nessa versão a seleção de candidatos é armazenada
   num HashMap.
 */

public class Versao_3
{
   public static void main(String[] args)
   {
      Locale.setDefault(new Locale("pt", "BR"));
      Scanner sc = new Scanner(System.in);
      HashMap<String, Double> mapa = new HashMap<String, Double>();

      System.out.println("Início do programa!");

      System.out.print("Deseja adicionar um candidato (s ou n)? ");
      char maisUm = sc.next().charAt(0);

      Double salarioBase = 2000.0;
      if(maisUm == 's')
      {
         do
         {
            System.out.print("Digite o nome do candidato: ");
            String nome = sc.next();
            System.out.print("Digite o salário pretendido: ");
            Double salarioPretendido = sc.nextDouble();

            if(salarioPretendido <= salarioBase)
            {
               mapa.put(nome, salarioPretendido);
            }

            System.out.print("Deseja adicionar um candidato (s ou n)? ");
            maisUm = sc.next().charAt(0);
         } while(maisUm == 's');
      }

      for(String i : mapa.keySet())
      {
         System.out.println(i + " " + mapa.get(i));
      }

      sc.close();
   }
}