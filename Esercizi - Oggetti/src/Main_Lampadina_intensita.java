import java.util.Scanner;

public class Main_Lampadina_intensita {
    //metodo di classe perché definita STATIC, quindi non necessita creare l'oggetto
    //per invocare tale metodo

    public static void menu() { //metodo di classe o metodi statici, stateless
        System.out.println("Menu:");
        System.out.println("1) accendi");
        System.out.println("2) spegni");
        System.out.println("3) visualizza info della lampadina");
        System.out.println("4) visualizza tutte le lampadine");
        System.out.println("0) esci, mi sono stufato");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quante lampadine vuoi creare?");
        int n = input.nextInt();

        //array di puntatori, che non puntano a nulla
        Lampadina_intensita[] scatola = new Lampadina_intensita[n];

        //nell'array vado ad istanziare ad ogni singolo "posto" (elemento dell'array)
        //un determinato oggetto di tipo lampadina
        for(int i = 0; i < scatola.length; i++)
        {
            scatola[i] = new Lampadina_intensita();
        }


        int scelta = -1;
        int x = -1;
        do {
            menu();
            scelta = input.nextInt();

            switch(scelta) {
                case 0:
                {
                    System.out.println("Programma terminato");
                    break;
                }
                case 1:
                {
                    System.out.println("quale lampadina");
                    x = input.nextInt();
                    if(x >= 0 && x<scatola.length)
                    {
                        System.out.println("luminosità");
                        int l = input.nextInt();
                        Lampadina_intensita lamp = scatola[x];
                        lamp.accendi(l);
                    }
                    else
                    {
                        System.out.println("lampadina non esistente");
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("quale lampadina");
                    x = input.nextInt();
                    if(x >= 0 && x<scatola.length)
                    {
                        scatola[x].spegni();
                    }
                    else
                    {
                        System.out.println("lampadina non esistente");
                    }
                    break;
                }

                case 3:
                {
                    System.out.println("quale lampadina?");
                    x = input.nextInt();
                    if(x >= 0 && x<scatola.length)
                    {
                        System.out.println(scatola[x].stato());
                    }
                    else
                    {
                        System.out.println("lampadina non esistente");
                    }
                    break;
                }
                case 4:
                {
                    //ciclo che conta da 0 a len -1 (se len = 3, 0, 1, 2)
                    for(int i = 0; i < scatola.length; i++)
                    {
                        System.out.println(scatola[i].stato());
                    }
                    break;
                }
                default:
                {
                    System.out.println("opzione non presente");
                }
            }
        }while(scelta != 0);
    }

}
