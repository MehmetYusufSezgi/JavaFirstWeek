public class Main {
    public static void main(String[] args) {

        int sayi1 = 15, sayi2 = 25, sayi3 = 35, buyuk=sayi1;

        if(buyuk<sayi2)
        {
            buyuk=sayi2;
        }
        if(buyuk<sayi3)
        {
            buyuk=sayi3;
        }
        System.out.println("En buyuk sayi : "+buyuk);

    }
}