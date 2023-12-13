import java.util.Scanner;

public class SayiHesaplama {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı değeri giriniz: ");
        int sayi = giris.nextInt();

        int tekrakamlartoplami = 0;
        int ciftrakamlartoplami = 0;
        int tekrakamlarsayisi = 0;
        int ciftrakamlarsayisi = 0;

        while (sayi != 0) {
            int basamakdegeri = sayi % 10;
            sayi = sayi / 10;

            if (basamakdegeri % 2 == 0) {
                ciftrakamlartoplami = ciftrakamlartoplami + basamakdegeri;
                ciftrakamlarsayisi++;
            } else
            {
                tekrakamlartoplami = tekrakamlartoplami + basamakdegeri;
                tekrakamlarsayisi++;
            }
        }
        System.out.println("girilen sayının basamak sayısı: " + (tekrakamlarsayisi + ciftrakamlarsayisi));
        System.out.println("tek rakamların toplamı: " + tekrakamlartoplami);
        System.out.println("çift rakamlar toplamı: " + ciftrakamlartoplami);

    }
}
