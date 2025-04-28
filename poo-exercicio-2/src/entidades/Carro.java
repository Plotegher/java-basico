package entidades;

public class Carro
{
   // Atributos

   private boolean ligado = false;
   private int marcha = 0;
   private int velocidade = 0;

   // Construtor

   public Carro(boolean ligado, int marcha, int velocidade)
   {
      this.ligado = ligado;
      this.marcha = marcha;
      this.velocidade = velocidade;
   }

   // Getters e Setters

   public boolean getLigado()
   {
      return ligado;
   }

   public void setLigado(boolean ligado)
   {
      this.ligado = ligado;
   }

   public int getMarcha()
   {
      return marcha;
   }

   public void setMarcha(int marcha)
   {
      this.marcha = marcha;
   }

   public int getVelocidade()
   {
      return velocidade;
   }

   public void setVelocidade(int velocidade)
   {
      this.velocidade = velocidade;
   }

   // Métodos especiais

   public void ligarCarro()
   {
      setLigado(true);
      System.out.println("Carro ligado!");
   }

   public void desligarCarro()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         if (marcha == 0 && velocidade == 0)
         {
            setLigado(false);
            System.out.println("Carro desligado!");
         }
         else
         {
            System.out.println("O carro não pode ser desligado em ordem de marcha!");
         }
      }
   }

   public void acelerarCarro()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         if (marcha == 0)
         {
            if (velocidade == 0)
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 1)
         {
            if (velocidade >= 0 && velocidade <= 19)
            {
               velocidade = velocidade + 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 2)
         {
            if (velocidade >= 20 && velocidade <= 39)
            {
               velocidade = velocidade + 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 3)
         {
            if (velocidade >= 40 && velocidade <= 59)
            {
               velocidade = velocidade + 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 4)
         {
            if (velocidade >= 60 && velocidade <= 79)
            {
               velocidade = velocidade + 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 5)
         {
            if (velocidade >= 80 && velocidade <= 99)
            {
               velocidade = velocidade + 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 6)
         {
            if (velocidade >= 100 && velocidade <= 119)
            {
               velocidade = velocidade + 1;
            }
            else
            {
               System.out.println("Velocidade limitada!");
            }
         }
         System.out.println("Sua nova velocidade é: " + getVelocidade() + " Km/h");
      }
   }

   public void frearCarro()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         if (marcha == 0)
         {
            if (velocidade == 0)
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 1)
         {
            if (velocidade >= 1 && velocidade <= 20)
            {
               velocidade = velocidade - 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 2)
         {
            if (velocidade >= 21 && velocidade <= 40)
            {
               velocidade = velocidade - 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 3)
         {
            if (velocidade >= 41 && velocidade <= 60)
            {
               velocidade = velocidade - 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 4)
         {
            if (velocidade >= 61 && velocidade <= 80)
            {
               velocidade = velocidade - 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 5)
         {
            if (velocidade >= 81 && velocidade <= 100)
            {
               velocidade = velocidade - 1;
            }
            else
            {
               System.out.println("Troque a marcha!");
            }
         }

         if (marcha == 6)
         {
            if (velocidade >= 101 && velocidade <= 120)
            {
               velocidade = velocidade - 1;
            }
            else
            {
               System.out.println("Velocidade limitada!");
            }
         }
         System.out.println("Sua nova velocidade é: " + getVelocidade() + " Km/h");
      }
   }

   public void virarEsquerda()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         if (velocidade >= 1 && velocidade <= 40)
         {
            System.out.println("Virou à esquerda!");
         }
         else
         {
            System.out.println("Manobra não permitida. Velocidade acima de 40 Km/h!");
         }
      }
   }

   public void virarDireita()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         if (velocidade >= 1 && velocidade <= 40)
         {
            System.out.println("Virou à direita!");
         }
         else
         {
            System.out.println("Manobra não permitida. Velocidade acima de 40 Km/h!");
         }
      }
   }

   public int verificarVelocidade()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         System.out.println("Sua velocidade atual é: " + getVelocidade() + " Km/h");
      }
      return 0;
   }

   public void subirMarcha()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         if(marcha >= 0 && marcha <=5)
         {
            marcha = marcha + 1;
            setMarcha(marcha);
         }
         System.out.println("Sua marcha atual é: " + getMarcha());
      }
   }

   public void descerMarcha()
   {
      if (!getLigado())
      {
         System.out.println("Favor ligar o carro!");
      }
      else
      {
         if(marcha >= 1 && marcha <=6)
         {
            marcha = marcha - 1;
            //setMarcha(marcha);
         }
         System.out.println("Sua marcha atual é: " + getMarcha());
      }
   }
}
