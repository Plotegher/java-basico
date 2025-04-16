package programa;

import entidades.Classe;
import entidades.Subclasse;

public class Main
{
   public static void main(String[] args)
   {
      Classe classe = new Classe();
      Subclasse subclasse = new Subclasse();

      String teste_1 = classe.atributo_1;
      String teste_2 = subclasse.getAtributo_2();
      String teste_3 = subclasse.getAtributo_3();
      String teste_4 = classe.getAtributo_4();

      System.out.println("Acessei o atributo_1 public pela classe do pacote entidades - " + teste_1);
      System.out.println("Acessei o atributo_2 protected pela subclasse do pacote entidades usando o get - " + teste_2);
      System.out.println("Acessei o atributo_3 default pela subclasse do pacote entidades usando o get - " + teste_3);
      System.out.println("Acessei o atributo_4 private pela classe do pacote entidades usando o get - " + teste_4);
   }
}