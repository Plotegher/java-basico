package ordenacao.ordenacao_numeros.programa;

import ordenacao.ordenacao_numeros.entidades.OrdenacaoNumeros;

public class Main
{
   public static void main(String[] args)
   {
      // Criando uma instância da classe OrdenacaoNumeros
      OrdenacaoNumeros numeros = new OrdenacaoNumeros();

      // Adicionando números à lista

      numeros.adicionarNumero(2);
      numeros.adicionarNumero(5);
      numeros.adicionarNumero(4);
      numeros.adicionarNumero(1);
      numeros.adicionarNumero(99);

      // Exibindo a lista de números adicionados
      numeros.exibirNumeros();

      // Ordenando e exibindo em ordem ascendente
      System.out.println(numeros.ordenarAscendente());

      // Exibindo a lista
      numeros.exibirNumeros();

      // Ordenando e exibindo em ordem descendente
      System.out.println(numeros.ordenarDescendente());

      // Exibindo a lista
      numeros.exibirNumeros();
   }
}

