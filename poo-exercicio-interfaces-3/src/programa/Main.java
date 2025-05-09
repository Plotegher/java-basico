package programa;

import entidades.Circulo;
import entidades.Quadrado;
import entidades.Retangulo;
import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.println("\nEscolha uma forma para calcular a área: ");
      System.out.println("\n1 - Quadrado");
      System.out.println("2 - Retângulo");
      System.out.println("3 - Triângulo");
      System.out.println("4 - Círculo");
      System.out.println("0 - Sair");

      int opcao = 5;
      while (opcao != 0)
      {
         System.out.print("\nOpção: ");
         opcao = scanner.nextInt();

         switch (opcao)
         {
            case 1:
            {
               System.out.print("Digite o valor do lado do quadrado: ");
               double lado = scanner.nextDouble();
               Quadrado quadrado = new Quadrado(lado);
               double resultado = quadrado.calcularArea();
               System.out.printf("A área do quadrado é: %.2f", resultado);
               System.out.println();
               break;
            }
            case 2:
            {
               System.out.print("Digite o valor da base do retângulo: ");
               double base = scanner.nextDouble();
               System.out.print("Digite o valor da altura do retângulo: ");
               double altura = scanner.nextDouble();
               Retangulo retangulo = new Retangulo(base, altura);
               double resultado = retangulo.calcularArea();
               System.out.printf("A área do retângulo é: %.2f", resultado);
               System.out.println();
               break;
            }
            case 3:
            {
               System.out.print("Digite o valor do lado 1 do triângulo: ");
               double lado1 = scanner.nextDouble();
               System.out.print("Digite o valor do lado 2 do triângulo: ");
               double lado2 = scanner.nextDouble();
               System.out.print("Digite o valor do lado 3 do triângulo: ");
               double lado3 = scanner.nextDouble();
               Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
               double resultado = triangulo.calcularArea();
               System.out.printf("A área do triângulo é: %.2f", resultado);
               System.out.println();
               break;
            }
            case 4:
            {
               System.out.print("Digite o valor do raio do círculo: ");
               double raio = scanner.nextDouble();
               Circulo circulo = new Circulo(raio);
               double resultado = circulo.calcularArea();
               System.out.printf("A área do círculo é: %.2f", resultado);
               System.out.println();
               break;
            }
            case 0:
            {
               break;
            }
            default:
            {
               System.out.println("Opção inválida!");
            }
         }
      }

      scanner.close();
   }
}