import java.util.Locale;
import java.util.Scanner;

import entidades.Candidato;

/*
   Minha primeira versão com orientação a objetos.
   Nessa versão a seleção de candidatos é um a um.
 */

public class Versao_2
{
   public static void main(String[] args)
   {
      Locale.setDefault(new Locale("pt", "BR"));
      Scanner sc = new Scanner(System.in);

      System.out.println("Início do programa!");

      System.out.print("Digite o nome do candidato: ");
      String nome = sc.next();
      System.out.print("Digite o salário pretendido: ");
      Double salarioPretendido = sc.nextDouble();

      Candidato candidato = new Candidato(nome, salarioPretendido);

      Candidato.analisarCandidato(candidato.getNome(), candidato.getSalarioPretendido());
      sc.close();
   }
}