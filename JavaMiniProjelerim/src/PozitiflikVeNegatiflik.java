import java.util.Scanner;
public class PozitiflikVeNegatiflik {
    public static void main(String[] args) {
        /*Klavyeden girilen bir sayının negatif, pozitif veya 0 olup olmadığını
        bulan program*/

        Scanner giris= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        long sayi=giris.nextLong();
        if (sayi<0){
            System.out.println("Sayı negatiftir.");
        }
        else if (sayi>0)
        {
            System.out.println("Sayı pozitiftir");
        } else
        {
            System.out.println("Sayı sıfırdır, pozitiflik ve negatiflik bakılmaz");
        }
    }
}

