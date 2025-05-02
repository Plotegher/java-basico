package entidades;

public class Vendedor extends Colaborador
{
   private Integer vendas;

   public Vendedor(String nome, String email, String senha, Boolean admin, Integer vendas)
   {
      super(nome, email, senha, admin = false);
      this.vendas = vendas;
   }

   public Integer getVendas()
   {
      return vendas;
   }

   public void setVendas(Integer vendas)
   {
      this.vendas = vendas;
   }

   public void realizarVenda()
   {
      setVendas(getVendas() + 1);
      System.out.println("Realizou " + getVendas() + " vendas!");
   }

   public void consultarVendas()
   {
      System.out.println("Gerou relatório de suas próprias vendas!");
   }
}
