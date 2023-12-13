
import java.util.Scanner;
public class ModAlma {
    public static void main(String[] args) {
        //girilen sayinin girilen başka bir sayıya göre modunu alan program
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen modunu almak istediğiniz sayıyı giriniz: ");
        long sayi1=klavye.nextLong();

        System.out.println("Girdiğiniz sayının hangi sayıya göre modunu almak istiyorsanız o sayıyı giriniz: ");
        long sayi2=klavye.nextLong();

        long yenisayi=sayi1%sayi2;

        System.out.println(sayi1+"'in "+sayi2+"'ye"+" bölümünden kalan "+ yenisayi+"'dir.");


    }
}