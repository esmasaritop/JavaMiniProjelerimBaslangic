import java.util.Scanner;
public class FaktoriyelVeFibonacciHesaplama{
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.println("Faktoriyel ve Fibonacci hesabı yapabilmek için lütfen bir sayı giriniz: ");
        long sayi=giris.nextLong();
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++)
        {
            faktoriyel=faktoriyel*i;
        }
        System.out.println("faktoriyel sonucu:"+ faktoriyel);

        long a=0;
        long b=1;
        long fibonacci=0;
        System.out.print("fibonacci sonucu:"+"0,1");
        for(int i=0; i<=sayi;i++){
            fibonacci=a+b;
            a=b;
            b=fibonacci;
            System.out.print(","+fibonacci);
        }
    }
}