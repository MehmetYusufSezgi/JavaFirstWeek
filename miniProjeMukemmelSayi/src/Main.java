public class Main {
    public static void main(String[] args) {

        int sayi=28;
        int i;
        int toplam=0;

        for(i=1;i<sayi;i++)
        {
            if(sayi%i == 0)
            {
                toplam+=i;
            }
        }
        if(sayi==toplam)
        {
            System.out.println("Sayi mukemmel sayidir");
        }
        else
        {
            System.out.println("Sayi mukemmel sayi degildir.");
        }

    }
}