package operacoes_basicas.conjunto_convidados.entidades;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados
{
   //atributo
   private Set<Convidado> convidadosSet;

   public ConjuntoConvidados()
   {
      this.convidadosSet = new HashSet<>();
   }

   public void adicionarConvidado(String nome, int codigoConvite)
   {
      convidadosSet.add(new Convidado(nome, codigoConvite));
   }

   public void removerConvidadoPorCodigoConvite(int codigoConvite)
   {
      Convidado convidadoParaRemover = null;

      if (!convidadosSet.isEmpty())
      {
         for (Convidado c : convidadosSet)
         {
            if (c.getCodigoConvite() == codigoConvite)
            {
               convidadoParaRemover = c;
               break;
            }
         }
         convidadosSet.remove(convidadoParaRemover);
      }
      else
      {
         throw new RuntimeException("O conjunto está vazio!");
      }
   }

   public int contarConvidados()
   {
      return convidadosSet.size();
   }

   public void exibirConvidados()
   {
      if (!convidadosSet.isEmpty())
      {
         System.out.println(convidadosSet);
      }
      else
      {
         System.out.println("O conjunto está vazio!");
      }
   }
}
