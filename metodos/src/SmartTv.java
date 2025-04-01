public class SmartTv
{
   // Atributos

   private Boolean ligada = false;
   private Integer canal = 1;
   private Integer volume = 1;

   // Métodos construtores

   public SmartTv() {}

   public SmartTv(Boolean ligada, Integer canal, Integer volume)
   {
      this.ligada = ligada;
      this.canal = canal;
      this.volume = volume;
   }

   // Métodos getters e setters

   public Boolean getLigada()
   {
      return ligada;
   }

   public void setLigada(Boolean ligada)
   {
      this.ligada = ligada;
   }

   public Integer getCanal()
   {
      return canal;
   }

   public void setCanal(Integer canal)
   {
      this.canal = canal;
   }

   public Integer getVolume()
   {
      return volume;
   }

   public void setVolume(Integer volume)
   {
      this.volume = volume;
   }

   // Métodos especiais

   public void ligar()
   {
      setLigada(true);
   }

   public void desligar()
   {
      setLigada(false);
   }

   public void avancarCanal()
   {
      setCanal(canal + 1);
      System.out.println("Avançou o canal!" + canal);
   }

   public void voltarCanal()
   {
      setCanal(canal - 1);
      System.out.println("Voltou o canal!" + canal);
   }

   public void acessarCanal(Integer novoCanal)
   {
      canal = novoCanal;
   }

   public void aumentarVolume()
   {
      setVolume(volume + 1);
      System.out.println("Aumentou o volume!" + volume);
   }

   public void diminuirVolume()
   {
      setVolume(volume - 1);
      System.out.println("Diminuiu o volume!" + volume);
   }
}
