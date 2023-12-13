
import java.util.Scanner;

public class CarpmaIslemi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("İlk Değeri Giriniz: ");
        int sayi1=klavye.nextInt();
        System.out.println("İkinci Değeri Giriniz: ");
        int sayi2=klavye.nextInt();

        int sonuc=sayi1*sayi2;

        System.out.println("SONUÇ= "+ sonuc);
    }
}
