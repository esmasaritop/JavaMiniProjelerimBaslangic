
import java.util.Scanner;
//1den girilen sayıya kadar olan sayıların toplamı
public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Bir Sayı Girin: ");
        int sayi = giris.nextInt();
        int toplam=0;
        for(int i=1;i<=sayi; ++i)
        {
            toplam+=i;
        }
        System.out.println("Sayıların toplamı: "+toplam);
    }
}
