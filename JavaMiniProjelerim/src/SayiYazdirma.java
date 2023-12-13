
import java.util.Scanner;
/*girilen bir başlangıç değerinden girilen sayı adedince girilen artış miktarı şeklinde sayıları yazan program  */
public class SayiYazdirma {
    public static void main(String[] args){
        Scanner giris= new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini giriniz: ");
        int baslangic=giris.nextInt();
        System.out.println("Lütfen adet sayısını giriniz: ");
        int adet=giris.nextInt();
        System.out.println("Lütfen artış miktarını gririniz: ");
        int artis=giris.nextInt();
        int i;
        for (i=0;i<adet;i++)
        {
            System.out.print(baslangic+",");
            baslangic=baslangic+artis;
        }
        System.out.println( );

    }
}