package ordenacao.ordenacao_pessoas.entidades;

public class Pessoa implements Comparable<Pessoa>
{
   //atributos
   private String nome;
   private int idade;
   private double altura;

   //construtor
   public Pessoa(String nome, int idade, double altura)
   {
      this.nome = nome;
      this.idade = idade;
      this.altura = altura;
   }

   @Override
   public int compareTo(Pessoa p)
   {
      return Integer.compare(idade, p.getIdade());
   }

   //getters
   public String getNome()
   {
      return nome;
   }

   public int getIdade()
   {
      return idade;
   }

   public double getAltura()
   {
      return altura;
   }

   //toString
   @Override
   public String toString()
   {
      return "Pessoa {" + "nome='" + nome + '\'' +
            ", idade=" + idade + ", altura=" + altura + '}';
   }
}