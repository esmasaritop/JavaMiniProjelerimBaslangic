
import java.util.Scanner;

public class DaireninCevreVeAlanHesabi{

    public static void main(String[] args) {
        double PI_SAYISI=3.14;
        System.out.print("Hesaplamalar için bir yarıçap değerini giriniz: ");
        Scanner giris= new Scanner(System.in);
        double yaricap=giris.nextDouble();
        System.out.println("Çevre hesabı yapmak istiyorsanız:1" +"--"+"Alan hesabı yapmak istiyorsanız:2--"+"Hem " +
                "alan hem çevre hesabı yapmak istiyorsanız:3 "+"tuslayınız");
        int sayi=giris.nextInt();
        if (sayi==1)
        {
            System.out.println(yaricap+" li"+" çemberin çevresi "+(2*PI_SAYISI*yaricap)+" dir.");
        }
        if(sayi==2){
            System.out.println(yaricap+" li"+" dairenin alanı "+ (PI_SAYISI*yaricap*yaricap)+" dir.");
        }
        if (sayi==3){
            System.out.println(yaricap+" li"+" çemberin çevresi "+(2*PI_SAYISI*yaricap)+" dir.");
            System.out.println(yaricap+" li"+" dairenin alanı "+ (PI_SAYISI*yaricap*yaricap)+" dir.");
        }

        else {
            System.out.println("Bu türde bir hesaplama yapılamaz ");
        }
    }
}