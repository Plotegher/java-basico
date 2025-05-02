package entidades;

public class Colaborador
{
   private String nome;
   private String email;
   private String senha;
   private Boolean admin;

   public Colaborador(String nome, String email, String senha, Boolean admin)
   {
      this.nome = nome;
      this.email = email;
      this.senha = senha;
      this.admin = admin;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getSenha()
   {
      return senha;
   }

   public void setSenha(String senha)
   {
      this.senha = senha;
   }

   public Boolean getAdmin()
   {
      return admin;
   }

   public void setAdmin(Boolean admin)
   {
      this.admin = admin;
   }

   public void realizarLogin()
   {
      System.out.println("Realizou login!");
   }

   public void realizarLogoff()
   {
      System.out.println("Realizou logoff!");
   }

   public void alterarDados()
   {
      System.out.println("Alterou dados!");
   }

   public void alterarSenha()
   {
      System.out.println("Alterou senha!");
   }
}
