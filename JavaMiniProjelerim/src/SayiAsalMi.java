
import java.util.Scanner;

public class SayiAsalMi {
    public static void main(String[] args) {

        boolean asalmi=true;
        System.out.println("Sayi giriniz: ");
        Scanner giris=new Scanner(System.in);
        int sayi=giris.nextInt();
        if (sayi==1){
            System.out.println("Sayi asal değildir ");
            return;
        }
        if (sayi<2){
            System.out.println("Geçersiz sayi girdiniz.");
            return;
        }
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                asalmi=false;
            }
        }
        if (asalmi){
            System.out.println("Sayi asaldır ");
        }
        else{
            System.out.println("Sayi asal değildir");
        }
    }
}