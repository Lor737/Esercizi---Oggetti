public class Lampadina
{
   private boolean stato;  //variabile di istanza: true = acceso, false = spento

   public Lampadina(boolean stato)
   {
      this.stato = stato;
   }
   public boolean accendi(int lampadina_numero_x)
   {
      return stato = true;
   }
   public boolean spegni(int lampadina_numero_x)
   {
      return stato = false;
   }
   public boolean stato(int lampadina_numero_x)
   {
      if (stato)
      {
         System.out.println("La lampadina " + lampadina_numero_x + " è accesa");
      }
      if(!stato)
      {
         System.out.println("La lampadina " + lampadina_numero_x + " è spenta");
      }
      return stato;
   }
}


