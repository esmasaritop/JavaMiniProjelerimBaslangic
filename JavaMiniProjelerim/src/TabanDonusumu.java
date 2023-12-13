
import java.util.Scanner;

public class TabanDonusumu{
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı değeri giriniz: ");
        int sayi=giris.nextInt();

        if(sayi%2==0){
            String sonuc=" ";
            while (sayi!=0){
                int kalan=sayi%2;
                sayi=sayi/2;
                sonuc=kalan+sonuc;
            }
            System.out.println("Girilen sayının 2 tabanındaki dönüşümü: "+ sonuc );
        }
        else {
            String sonuc="";
            while(sayi!=0){
                int kalan=sayi%8;
                sayi=sayi/8;
                sonuc=kalan+sonuc;
            }
            System.out.println("Girilen sayının 8 tabanındaki dönüşümü "+ sonuc);
        }

    }
}
