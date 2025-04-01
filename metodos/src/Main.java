import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      int canalEscolhido;

      Scanner scanner = new Scanner(System.in);
      SmartTv smartTv = new SmartTv();

      smartTv.ligar();

      smartTv.avancarCanal();
      smartTv.avancarCanal();
      smartTv.avancarCanal();
      smartTv.avancarCanal();
      smartTv.voltarCanal();

      smartTv.aumentarVolume();
      smartTv.aumentarVolume();
      smartTv.aumentarVolume();
      smartTv.aumentarVolume();
      smartTv.diminuirVolume();

      System.out.println();
      System.out.println("A TV está ligada? " + smartTv.getLigada());
      System.out.println("O canal atual é: " + smartTv.getCanal());
      System.out.println("O volume atual é: " + smartTv.getVolume());

      System.out.println();
      System.out.println("Digite o canal desejado: ");
      canalEscolhido = scanner.nextInt();
      smartTv.acessarCanal(canalEscolhido);
      System.out.println("O novo canal é: " + canalEscolhido);
   }
}