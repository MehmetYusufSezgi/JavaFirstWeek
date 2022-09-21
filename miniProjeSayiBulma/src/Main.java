public class Main {
    public static void main(String[] args) {

        int[] sayilar = {1, 3, 5, 7, 9};
        int aranan = 6;
        int puan = 0;
        int i;

        for(i=0;i<4;i++)
        {
            if(aranan==sayilar[i])
            {
                puan++;
            }
        }
        if(puan==1)
        {
            System.out.println("Sayi dizide bulunmaktadir.");
        }
        else
        {
            System.out.println("Sayi dizide bulunmamaktadir.");
        }

    }
}