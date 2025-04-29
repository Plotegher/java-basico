package entidades;

public class BanhoPet
{
   private int agua;
   private int shampoo;
   private boolean ocupado;

   public BanhoPet() {}

   public BanhoPet(int agua, int shampoo, boolean ocupado)
   {
      this.agua = agua;
      this.shampoo = shampoo;
      this.ocupado = ocupado;
   }

   public int getAgua()
   {
      return agua;
   }

   public void setAgua(int agua)
   {
      this.agua = agua;
   }

   public int getShampoo()
   {
      return shampoo;
   }

   public void setShampoo(int shampoo)
   {
      this.shampoo = shampoo;
   }

   public boolean getOcupado()
   {
      return ocupado;
   }

   public void setOcupado(boolean ocupado)
   {
      this.ocupado = ocupado;
   }

   // Métodos especiais

   public void darBanho()
   {
      if (!getOcupado())
      {
         System.out.println("Favor colocar pet na máquina!");
      }
      else
      {
         if (agua < 10)
         {
            System.out.println("Favor abastecer água!");
         }
         else if (shampoo < 2)
         {
            System.out.println("Favor abastecer shampoo!");
         }
         else
         {
            agua = agua - 10;
            shampoo = shampoo - 2;
            System.out.println("Banho finalizado!");
            System.out.println("Retire o pet da máquina!");
         }
      }
   }

   public void abastecerAgua ()
   {
      if (agua >= 0 && agua < 30)
      {
         agua = agua + 10;
         System.out.println("Abastecido com: " + getAgua());
      }
      else
      {
         System.out.println("Nível máximo de água");
      }
   }

   public void abastecerShampoo ()
   {
      if (shampoo >= 0 && shampoo < 10)
      {
         shampoo = shampoo + 2;
         System.out.println("Abastecido com: " + getShampoo());
      }
      else
      {
         System.out.println("Nível máximo de shampoo");
      }
   }

   public void nivelAgua()
   {
      System.out.println("O nível de água é: " + getAgua());
   }

   public void nivelShampoo()
   {
      System.out.println("O nível de shampoo é: " + getShampoo());
   }

   public void colocarPet()
   {
      if (!getOcupado())
      {
         ocupado = true;
         System.out.println("Pet na máquina!");
      }
      else
      {
         System.out.println("Máquina ocupada!");
      }
   }

   public void retirarPet()
   {
      if (!getOcupado())
      {
         System.out.println("Máquina desocupada!");
      }
      else
      {
         System.out.println("Pet retirado!");
         System.out.println("Limpe a máquina para o próximo banho!");
         setOcupado(false);
      }
   }

   public void temPet()
   {
      if (getOcupado())
      {
         System.out.println("Máquina ocupada!");
      }
      else
      {
         System.out.println("Máquina desocupada!");
      }
   }

   public void limparMaquina()
   {
      if (agua < 3)
      {
         System.out.println("Favor abastecer água!");
      }
      else if (shampoo < 1)
      {
         System.out.println("Favor abastecer shampoo!");
      }
      else
      {
         agua = agua - 3;
         shampoo = shampoo - 1;
         System.out.println("Máquina limpa!");
      }
   }
}
