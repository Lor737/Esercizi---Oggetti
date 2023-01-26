public class Bottiglia
{
    private float quantita;
    private final double capacita;
    private String contenuto;
    public Bottiglia(int quantita, int capacita, String contenuto)
    {
        this.quantita = quantita;
        this.capacita = capacita;
        this.contenuto = contenuto;
    }
        public void bevi(double quantita_da_bere)
        {
            if (quantita_da_bere > 0 && quantita_da_bere <= quantita)
            {
                quantita -= quantita_da_bere;
            }
            else
            {
                System.out.println("Attenzione operazione non possibile");
            }
        }
        public void riempi(double quantita_da_riempire)
        {
            if (quantita_da_riempire > 0 && quantita_da_riempire <= (capacita-quantita))
            {
                quantita += quantita_da_riempire;
            }
           else
            {
                System.out.println("Attenzione operazione non possibile");
            }
        }
        public void stato(int numero_bottiglia)
        {
            System.out.println("La bottiglia " + numero_bottiglia + " ha capacità: " + capacita + " L e contiene: " + quantita + " litri di " + contenuto);
            if (quantita == capacita)
            {
                System.out.println("La bottiglia è piena");
            }
            else if(quantita > 0 && quantita<capacita)
            {
                System.out.println("La bottiglia contiene: " + quantita + " litri");
            }
            else if (quantita == 0)
            {
                System.out.println("La bottiglia è vuota");
            }
        }
        public float cambia_contenuto(String nuovo_contenuto)
        {
            if (quantita == 0)
            {
                contenuto = nuovo_contenuto;
            }
            else if (quantita > 0)
            {
                System.out.println("Attenzione, per cambiare il contenuto della bottiglia, prima deve essere vuota");
            }
            return quantita;
        }
}
//metodi per quando la bottiglia è vuota o piena o la quantità che c'è(ne piena ne vuota) per snellire il metodo stato
//fare il menù per l'utente