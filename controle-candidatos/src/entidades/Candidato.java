package entidades;

public class Candidato
{
   private String nome;
   private Double salarioPretendido;

   public Candidato() {}

   public Candidato(String nome, Double salarioPretendido)
   {
      this.nome = nome;
      this.salarioPretendido = salarioPretendido;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public Double getSalarioPretendido()
   {
      return salarioPretendido;
   }

   public void setSalarioPretendido(Double salarioPretendido)
   {
      this.salarioPretendido = salarioPretendido;
   }

   public static void analisarCandidato(String nome, Double salarioPretendido)
   {
      Double salarioOferecido = 2000.00;

      if(salarioOferecido >= salarioPretendido)
      {
         System.out.println("Ligar para candidato: " + nome);
      }
      else if (salarioOferecido < salarioPretendido)
      {
         System.out.println("Ligar para candidato: " + nome +
               " com contraproposta");
      }
      else
      {
         System.out.println("Aguardar outros candidatos");
      }
   }
}
