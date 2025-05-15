package operacoes_basicas.lista_de_tarefas.entidades;

public class Tarefa
{
   //atributo
   private String descricao;

   //construtor
   public Tarefa(String descricao) {
      this.descricao = descricao;
   }

   //get
   public String getDescricao() {
      return descricao;
   }

   //toString
   @Override
   public String toString() {
      return  descricao;
   }
}
