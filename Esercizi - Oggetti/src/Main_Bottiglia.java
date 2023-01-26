import java.util.Scanner;

public class Main_Bottiglia
{
    public static void menu()
    {
        System.out.println("Menù Bottiglia");
        System.out.println("1 - bevi");
        System.out.println("2 - riempi");
        System.out.println("3 - cambia contenuto");
        System.out.println("4 - stato di una bottiglia");
        System.out.println("5 - stato di tutte le bottiglie");
        System.out.println("0 - esci, ora voglio mangiare qualcosa");
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int tipo_capacita = 0;
        int quantita = 0;
        String contenuto_bottiglia = "";

        System.out.println("Benvenuto al programma bottiglie");
        System.out.println("Quante bibite vuoi che io produca?");
        int num_bottiglie = input.nextInt();
        int[] array_capacita = new int[num_bottiglie];
        int[] array_quantita = new int[num_bottiglie];

        System.out.println("Varietà di contenuto?");
        System.out.println("0 - stesso contenuto");
        System.out.println("1 - diverso contenuto");
        int varieta_contenuto = input.nextInt();
        Bottiglia [] bottiglie = new Bottiglia[num_bottiglie];
        if(varieta_contenuto == 0)  //stesso contenuto
        {
            System.out.println("Varietà di capacità?");
            System.out.println("0 - stessa capacità");
            System.out.println("1 - diversa capacità");
            int varieta_capacita = input.nextInt();
            if (varieta_capacita == 0) //stessa capacità
            {
                System.out.println("Okay, con quanta capacità?");
                System.out.println("2 - 2 litri");
                System.out.println("1 - 1 litro");
                tipo_capacita = input.nextInt();
                quantita = tipo_capacita;
                if (tipo_capacita == 2) //2 litri
                {
                    System.out.println("Okay, quale contenuto vuoi per tutte le bottiglie?");
                    System.out.println("0 - acqua naturale");
                    System.out.println("1 - acqua gasata");
                    System.out.println("2 - thè alla pesca");
                    System.out.println("3 - thè al limone");
                    System.out.println("4 - coca-cola");
                    System.out.println("5 - fanta");
                    System.out.println("6 - sprite");
                    int tipo_contenuto = input.nextInt();
                    if (tipo_contenuto == 0) {contenuto_bottiglia = "acqua naturale";}
                    if (tipo_contenuto == 1) {contenuto_bottiglia = "acqua gasata";}
                    if (tipo_contenuto == 2) {contenuto_bottiglia = "thè alla pesca";}
                    if (tipo_contenuto == 3) {contenuto_bottiglia = "thè al limone";}
                    if (tipo_contenuto == 4) {contenuto_bottiglia = "coca-cola";}
                    if (tipo_contenuto == 5) {contenuto_bottiglia = "fanta";}
                    if (tipo_contenuto == 6) {contenuto_bottiglia = "sprite";}

                    for (int i=0;i<num_bottiglie;i++)
                    {
                        bottiglie[i] = new Bottiglia(quantita, tipo_capacita, contenuto_bottiglia);
                    }
                }
                else if (tipo_capacita == 1)  //1 litro
                {
                    System.out.println("Okay, quale contenuto vuoi per tutte le bottiglie?");
                    System.out.println("0 - acqua naturale");
                    System.out.println("1 - acqua gasata");
                    System.out.println("2 - thè alla pesca");
                    System.out.println("3 - thè al limone");
                    System.out.println("4 - coca-cola");
                    System.out.println("5 - fanta");
                    System.out.println("6 - sprite");
                    int tipo_contenuto = input.nextInt();
                    if (tipo_contenuto == 0) {contenuto_bottiglia = "acqua naturale";}
                    if (tipo_contenuto == 1) {contenuto_bottiglia = "acqua gasata";}
                    if (tipo_contenuto == 2) {contenuto_bottiglia = "thè alla pesca";}
                    if (tipo_contenuto == 3) {contenuto_bottiglia = "thè al limone";}
                    if (tipo_contenuto == 4) {contenuto_bottiglia = "coca-cola";}
                    if (tipo_contenuto == 5) {contenuto_bottiglia = "fanta";}
                    if (tipo_contenuto == 6) {contenuto_bottiglia = "sprite";}

                    for (int i=0;i<num_bottiglie;i++)
                    {
                        bottiglie[i] = new Bottiglia(quantita, tipo_capacita, contenuto_bottiglia);
                    }
                }
            }
            else if(varieta_capacita == 1) //capacità diversa
            {
                for (int i=0;i<num_bottiglie;i++)
                {
                    System.out.println("Capacità bottiglia n°" + (i)+" ?");
                    System.out.println("2 - 2 litri");
                    System.out.println("1 - 1 litro");
                    tipo_capacita = input.nextInt();
                    array_capacita[i] = tipo_capacita;
                    array_quantita[i] = tipo_capacita;

                }
                System.out.println("Okay, quale contenuto vuoi per tutte le bottiglie?");
                System.out.println("0 - acqua naturale");
                System.out.println("1 - acqua gasata");
                System.out.println("2 - thè alla pesca");
                System.out.println("3 - thè al limone");
                System.out.println("4 - coca-cola");
                System.out.println("5 - fanta");
                System.out.println("6 - sprite");
                int tipo_contenuto = input.nextInt();
                if (tipo_contenuto == 0) {contenuto_bottiglia = "acqua naturale";}
                if (tipo_contenuto == 1) {contenuto_bottiglia = "acqua gasata";}
                if (tipo_contenuto == 2) {contenuto_bottiglia = "thè alla pesca";}
                if (tipo_contenuto == 3) {contenuto_bottiglia = "thè al limone";}
                if (tipo_contenuto == 4) {contenuto_bottiglia = "coca-cola";}
                if (tipo_contenuto == 5) {contenuto_bottiglia = "fanta";}
                if (tipo_contenuto == 6) {contenuto_bottiglia = "sprite";}

                for (int i=0;i<num_bottiglie;i++)
                {
                    bottiglie[i] = new Bottiglia(array_quantita[i], array_capacita[i], contenuto_bottiglia);
                }
            }
        }
        //_____________________________________________________________________________________

        else if (varieta_contenuto == 1) //diverso contenuto
        {
            String[] contenuto = new String[num_bottiglie];
            for (int i=0;i<num_bottiglie;i++)
            {
                System.out.println("Quale contenuto vuoi per la bottiglia n°" + (i)+" ?");
                System.out.println("0 - acqua naturale");
                System.out.println("1 - acqua gasata");
                System.out.println("2 - thè alla pesca");
                System.out.println("3 - thè al limone");
                System.out.println("4 - coca-cola");
                System.out.println("5 - fanta");
                System.out.println("6 - sprite");
                int tipo_contenuto = input.nextInt();
                if (tipo_contenuto == 0) {contenuto_bottiglia = "acqua naturale";}
                if (tipo_contenuto == 1) {contenuto_bottiglia = "acqua gasata";}
                if (tipo_contenuto == 2) {contenuto_bottiglia = "thè alla pesca";}
                if (tipo_contenuto == 3) {contenuto_bottiglia = "thè al limone";}
                if (tipo_contenuto == 4) {contenuto_bottiglia = "coca-cola";}
                if (tipo_contenuto == 5) {contenuto_bottiglia = "fanta";}
                if (tipo_contenuto == 6) {contenuto_bottiglia = "sprite";}
                contenuto[i] = contenuto_bottiglia;
            }

            System.out.println("Varietà di capacità?");
            System.out.println("0 - stessa capacità");
            System.out.println("1 - diversa capacità");
            int varieta_capacita = input.nextInt();
            if (varieta_capacita == 0) //stessa capacità
            {
                System.out.println("Okay, con quanta capacità?");
                System.out.println("2 - 2 litri");
                System.out.println("1 - 1 litro");
                tipo_capacita = input.nextInt();
                quantita = tipo_capacita;
                if (tipo_capacita == 2) //2 litri
                {
                    for (int i=0;i<num_bottiglie;i++)
                    {
                        bottiglie[i] = new Bottiglia(quantita, tipo_capacita, contenuto[i]);
                    }
                }
                else if (tipo_capacita == 1)  //1 litro
                {
                    for (int i=0;i<num_bottiglie;i++)
                    {
                        bottiglie[i] = new Bottiglia(quantita, tipo_capacita, contenuto[i]);
                    }
                }
            }
            else if(varieta_capacita == 1) //capacità diversa
            {
                for (int i=0;i<num_bottiglie;i++)
                {
                    System.out.println("Capacità bottiglia n°" + (i)+" ?");
                    System.out.println("2 - 2 litri");
                    System.out.println("1 - 1 litro");
                    tipo_capacita = input.nextInt();
                    array_capacita[i] = tipo_capacita;
                    array_quantita[i] = tipo_capacita;
                }
                for (int i=0;i<num_bottiglie;i++)
                {
                    bottiglie[i] = new Bottiglia(array_quantita[i], array_capacita[i], contenuto[i]);
                }
            }
        }

        System.out.println("Okay, ti ho prodotto: " + num_bottiglie + " bottiglie");
        for (int i=0;i<num_bottiglie;i++)
        {
            bottiglie[i].stato(i);
        }
        int scelta = -1;
        do {
            menu();
            scelta = input.nextInt();

            switch (scelta)
            {
                case 0:
                {
                    System.out.println("Programma terminato, vai a mangiare ora!");
                    break;
                }
                case 1:
                {
                    System.out.println("Quale bottiglia? (ricorda che la 1° bottiglia è la 0)");
                    int scelta_bottiglia = input.nextInt();
                    if (scelta_bottiglia >= 0 && scelta_bottiglia <= bottiglie.length)
                    {
                        System.out.println("Quanto vuoi bere? (ricorda di usare la virgola per quantità non intere)");
                        double quantita_da_bere = input.nextDouble();
                        bottiglie[scelta_bottiglia].bevi(quantita_da_bere);
                    }
                    else
                    {
                        System.out.println("Bottiglia non esistente");
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Quale bottiglia vuoi riempire? (ricorda che la 1° bottiglia è la 0)");
                    int scelta_bottiglia = input.nextInt();
                    if (scelta_bottiglia >= 0 && scelta_bottiglia <= bottiglie.length)
                    {
                        System.out.println("Quanto vuoi riempire? (ricorda di usare la virgola per quantità non intere)");
                        double quantita_da_riempire = input.nextDouble();
                        bottiglie[scelta_bottiglia].riempi(quantita_da_riempire);
                    }
                    else
                    {
                        System.out.println("Bottiglia non esistente");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("A quale bottiglia vuoi cambiare il contenuto? (ricorda che la 1° bottiglia è la 0)");
                    int scelta_bottiglia = input.nextInt();
                    if (scelta_bottiglia >= 0 && scelta_bottiglia <= bottiglie.length)
                    {
                        float quantita_cambio_contenuto = bottiglie[scelta_bottiglia].cambia_contenuto("");
                        if (quantita_cambio_contenuto > 0)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Quale contenuto vuoi per la bottiglia n°" + (scelta_bottiglia)+" ?");
                            System.out.println("0 - acqua naturale");
                            System.out.println("1 - acqua gasata");
                            System.out.println("2 - thè alla pesca");
                            System.out.println("3 - thè al limone");
                            System.out.println("4 - coca-cola");
                            System.out.println("5 - fanta");
                            System.out.println("6 - sprite");
                            int tipo_contenuto = input.nextInt();
                            if (tipo_contenuto == 0) {contenuto_bottiglia = "acqua naturale";}
                            if (tipo_contenuto == 1) {contenuto_bottiglia = "acqua gasata";}
                            if (tipo_contenuto == 2) {contenuto_bottiglia = "thè alla pesca";}
                            if (tipo_contenuto == 3) {contenuto_bottiglia = "thè al limone";}
                            if (tipo_contenuto == 4) {contenuto_bottiglia = "coca-cola";}
                            if (tipo_contenuto == 5) {contenuto_bottiglia = "fanta";}
                            if (tipo_contenuto == 6) {contenuto_bottiglia = "sprite";}
                            bottiglie[scelta_bottiglia].cambia_contenuto(contenuto_bottiglia);
                        }
                    }
                    else
                    {
                        System.out.println("Bottiglia non esistente");
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Quale bottiglia vuoi vederne lo stato?");
                    int scelta_bottiglia = input.nextInt();
                    if (scelta_bottiglia >= 0 && scelta_bottiglia <= bottiglie.length)
                    {
                        bottiglie[scelta_bottiglia].stato(scelta_bottiglia);
                    }
                    else
                    {
                        System.out.println("Bottiglia non esistente");
                    }
                    break;
                }
                case 5:
                {
                    for (int i=0;i<num_bottiglie;i++)
                    {
                        bottiglie[i].stato(i);
                    }
                    break;
                }
                default:
                {
                    System.out.println("Opzione non presente");
                }
            }

        }while (scelta != 0);


    }

}
