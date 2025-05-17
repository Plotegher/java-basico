package ordenacao.gerenciador_de_alunos.entidades;

import java.util.Comparator;

public class ComparatorNota implements Comparator<Aluno>
{
   @Override
   public int compare(Aluno o1, Aluno o2)
   {
      return Double.compare(o1.getMedia(), o2.getMedia());
   }
}
