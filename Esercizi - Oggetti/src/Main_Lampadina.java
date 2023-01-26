import java.util.Scanner;

public class Main_Lampadina
{
    public static int quantita_lampadine()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Quante lampadine vuoi creare?");
        int numero = input.nextInt();
        return numero;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero_lampadine = quantita_lampadine();
        Lampadina[] array = new Lampadina[numero_lampadine];
        int[] lampadina_numero = new int[numero_lampadine];
        for(int i = 0;i<numero_lampadine; i++)
        {
            lampadina_numero[i] = i+1;
            array[i] = new Lampadina(false);
        }
        System.out.println("Sono state create: " + numero_lampadine + " lampadine");
        for(int i = 0;i<numero_lampadine; i++)
        {
            array[i].stato(i+1);
        }
        System.out.println("Quale lampadina vuoi accendere?");
        int scelta = input.nextInt();
        array[scelta-1].accendi(scelta);
        for(int i = 0;i<numero_lampadine; i++)
        {
            array[i].stato(i+1);
        }
    }
}