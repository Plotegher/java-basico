package programa;

import entidades.Quadrado;
import entidades.Retangulo;
import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Para calcular a área de um paralelogramo digite 1.");
        System.out.println("Para calcular a área de um triângulo digite 2.");

        System.out.print("\nDigite o número correspondente a sua opção: ");
        int opcao = sc.nextInt();

        switch (opcao)
        {
            case 1:
            {
                double lado_1 = 0.0;
                double lado_2 = 0.0;
                System.out.println("\nCálculo de área de um Paralelogramo");
                System.out.print("Digite a medida do lado 1: ");
                lado_1 = sc.nextDouble();
                System.out.print("Digite a medida do lado 2: ");
                lado_2 = sc.nextDouble();
                if(lado_1 == lado_2)
                {
                    Quadrado quadrado = new Quadrado(lado_1, lado_2);
                    System.out.println("Esse paralelogramo é um Quadrado");
                    quadrado.setLado_1(lado_1);
                    quadrado.setLado_2(lado_2);
                    double resultado_1 = quadrado.calcularArea();
                    System.out.println("A área do quadrado é: " + resultado_1);
                }
                else
                {
                    Retangulo retangulo = new Retangulo(lado_1, lado_2);
                    System.out.println("Esse paralelogramo é um Retângulo");
                    retangulo.setLado_1(lado_1);
                    retangulo.setLado_2(lado_2);
                    double resultado_2 = retangulo.calcularArea();
                    System.out.println("A área do retângulo é: " + resultado_2);
                }
                break;
            }

            case 2:
            {
                double altura = 0.0;
                double largura = 0.0;
                Triangulo triangulo = new Triangulo(altura, largura);
                System.out.println("Triângulo");
                System.out.print("Digite a medida da altura: ");
                altura = sc.nextDouble();
                triangulo.setAltura(altura);
                System.out.print("Digite a medida da largura: ");
                largura = sc.nextDouble();
                triangulo.setLargura(largura);
                double resultado_3 = triangulo.calcularArea();
                System.out.println("A área do triângulo é: " + resultado_3);
                break;
            }

            default:
            {
                System.out.println("Indefinido");
            }
        }
    }
}