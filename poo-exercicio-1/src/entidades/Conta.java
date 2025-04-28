package entidades;

public class Conta
{
   private double saldo;
   private double limite;

   public Conta (double saldo)
   {
      this.saldo = saldo;
   }

   public Conta(double saldo, double limite)
   {
      this.saldo = saldo;
      this.limite = limite;
   }

   public double getSaldo()
   {
      return saldo;
   }

   public void setSaldo(double saldo)
   {
      this.saldo = saldo;
   }

   public double getLimite()
   {
      return limite;
   }

   public void setLimite(double limite)
   {
      this.limite = limite;
   }

   // Métodos especiais

   public void definirLimite(double saldoInicial)
   {
      if (saldoInicial <= 500.0)
      {
         limite = 50.0;
      }
      else
      {
         limite = saldoInicial * 0.5;
      }
   }

   public double consultarSaldo()
   {
      return getSaldo();
   }

   public double consultarLimite()
   {
      return getLimite();
   }

   public void depositarDinheiro(double deposito)
   {
      saldo += deposito;
   }

   public void sacarDinheiro(double saque)
   {
      if(saque <= 0.0)
      {
         System.out.println("Valor inválido para saque!");
      }

      if (saque <= saldo)
      {
         saldo -= saque;
         setSaldo(saldo);
         System.out.println("Você sacou R$ " + saque);
         System.out.println("Saldo atual R$ " + saldo);
         System.out.println("Limite atual R$ " + limite);
      }
      else
      {
         double utilizado;
         double juros;
         if (saque <= limite + saldo)
         {
            limite = limite + saldo - saque;
            utilizado = saque - saldo;
            setSaldo(0.0);
            juros = utilizado * 0.2;
            setLimite(limite - juros);
            System.out.println("Você sacou R$ " + saque);
            System.out.println("Saldo atual R$ " + saldo);
            System.out.println("Limite atual R$ " + (limite));
            System.out.println("Você pagou R$ " + juros + " de juros nessa operação!");
         }
         else
         {
            System.out.println("Operação inválida por insuficiência de limite!");
         }
      }
   }

   public void pagarBoleto(double pagto)
   {
      if(pagto <= 0.0)
      {
         System.out.println("Valor inválido para pagamento!");
      }

      if (pagto <= saldo)
      {
         saldo = saldo - pagto;
         setSaldo(saldo);
         System.out.println("Você pagou R$ " + pagto);
         System.out.println("Saldo atual R$ " + saldo);
         System.out.println("Limite atual R$ " + limite);
      }
      else
      {
         double utilizado;
         double juros;
         if (pagto <= limite + saldo)
         {
            limite = saldo + limite - pagto;
            utilizado = pagto - saldo;
            setSaldo(0.0);
            juros = limite * 0.2;
            setLimite(limite - juros);
            System.out.println("Você pagou R$ " + pagto);
            System.out.println("Saldo atual R$ " + saldo);
            System.out.println("Limite atual R$ " + limite);
            System.out.println("Você pagou R$ " + juros + " de juros nessa operação!");
         }
         else
         {
            System.out.println("Operação inválida por insuficiência de limite!");
         }
      }
   }

   public void verificarLimite()
   {
      System.out.println(getSaldo());
      if(getSaldo() > 0.0)
      {
         System.out.println("Você não está usando o limite do cheque especial!");
      }
      else
      {
         System.out.println("Você está usando o limite do cheque especial!");
      }
   }
}


