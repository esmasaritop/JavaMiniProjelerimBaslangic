import java.util.Scanner;

public class OrtalamaHesabi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("adınızı soyadınızı giriniz: ");
        String AdSoyad= giris.nextLine();

        System.out.println("vize notunuzu giriniz:");
        double vize=giris.nextDouble();

        System.out.println("final notunuzu giriniz:");
        double finalnot=giris.nextDouble();

        double orthesabi= (vize*0.4 + finalnot*0.6);

        if (orthesabi>50) {
            System.out.println( "Sayın "+ AdSoyad + " ortalamanız: " + orthesabi + " - " + "DERSTEN GEÇTİNİZ!");
        }
        else {
            System.out.println( " Sayın "+ AdSoyad + " ortalamanız: " + orthesabi + " - "+  "DERSTEN GEÇEMEDİNİZ!");
        }
    }
}
