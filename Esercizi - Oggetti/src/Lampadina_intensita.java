public class Lampadina_intensita
{
    private boolean stato;
    int luminsita; //spenta = 0, accesa = 1;

    public Lampadina_intensita()
    {
        luminsita = 0;
    }
    public Lampadina_intensita(int luminosita)
    {
        luminsita = luminosita;
    }
    public void cambiaColore(String c)
    {

    }
    public void accendi(int lum) //setLuminosità
    {
        if (lum >= 0)
        {
            luminsita = lum;
        }
        else
        {
            System.out.println("Attenzione operazione non possibile");
        }
    }
    public void spegni()
    {
        luminsita = 0;
    }
    public String stato()
    {
        String x = "stato: ";
		if(luminsita > 0)
        {
            x += "accesa, lumunosità: " + luminsita;
        }
		else
        {
            x += "spenta";
        }
		return x;
    }

}
