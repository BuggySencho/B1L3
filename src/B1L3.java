public class B1L3 {

    public static void main(String[] args)
    {

        int willekeurig = (int) Math.ceil( Math.random() * 10 );

        String stukjeTekst = "Leuk";

        switch(stukjeTekst)
        {

            case "Leuk":
                System.out.println("Wat geinig!");
                break;
            case "Skeer...":
                System.out.println("Ja man...");
                break;
            case "Raar":
            case "Dat kan":
                System.out.println("Dit kan in beide gevallen");
        }

        if (willekeurig>= 8)
        {
            System.out.println("8 of hoger!");
        }
        else if (willekeurig == 7)
        {
            System.out.println("Exact getal 7!");
        }
        else if (willekeurig <6 && willekeurig > 3)
        {
            System.out.println("Een getal van 4 tot 7");
        }
        else
        {
            System.out.println("Het is een ander getal");
        }


        if (willekeurig ==1|| willekeurig == 3)
        {
            System.out.println("Het getal is 1 of 3");
        }




        System.out.println("Einde programma");
    }
}
