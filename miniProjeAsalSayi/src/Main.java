public class Main {
    public static void main(String[] args) {

        int number = 11;
        int points = 0;
        int i;
        for(i=1;i<=number;i++)
        {
            if(number % i == 0)
            {
                points++;
            }
        }
        if(points == 2)
        {
            System.out.println(number+" sayisi asaldir.");
        }
        else
        {
            System.out.println(number+ " sayisi asal degildir.");
        }


    }
}