package entidades;

public abstract class Ingresso
{
   private Double valor;
   private String titulo;

   public Ingresso(Double valor, String titulo)
   {
      this.valor = valor;
      this.titulo = titulo;
   }

   public Double getValor()
   {
      return valor;
   }

   public void setValor(Double valor)
   {
      this.valor = valor;
   }

   public String getTitulo()
   {
      return titulo;
   }

   public void setTitulo(String titulo)
   {
      this.titulo = titulo;
   }

   public abstract Double beneficio();
}
