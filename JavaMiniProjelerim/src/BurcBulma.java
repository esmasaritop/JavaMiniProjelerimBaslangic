
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        /*Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart*/

        Scanner giris=new Scanner(System.in);
        System.out.println("Burç Bulma Uygulamasına Hoşgeldinizz!!!! ");
        System.out.println("Hangi ayda doğdunuz? : ");
        String dogumtarihi=giris.nextLine();
        System.out.println("Ayın kaçında doğdunuz? : ");
        int tarih=giris.nextInt();

        switch (dogumtarihi){
            case "ocak":

                if (tarih<22 && tarih>=1){
                    System.out.println("Oğlak Burcusunuz");
                    }

                else if (tarih>22 && tarih<=31){
                    System.out.println("Kova Burcusunuz");
                }
                    break;
            case "şubat":

                if (tarih<20 && tarih>=1){
                    System.out.println("Kova Burcusunuz");
                } else if (tarih>=20 && tarih<=31) {
                    System.out.println("Balık Burcusunuz");
                }
                break;
            case "mart":
                if (tarih<=20 && tarih>=1){
                    System.out.println("Balık Burcusunuz");
                } else if (tarih>20 && tarih<=31) {
                    System.out.println("Koç Burcusunuz");
                }
                break;
            case "nisan":
                if (tarih<=20 && tarih>=1){
                    System.out.println("Koç Burcusunuz");
                } else if (tarih>=20 && tarih<=31) {
                    System.out.println("Boğa Burcusunuz");
                }
                break;
            case "mayıs":
                if (tarih<22 && tarih>=1){
                    System.out.println("Boğa Burcusunuz");
                } else if (tarih>=22 && tarih<=31) {
                    System.out.println("İkizler Burcusunuz");
                }
                break;
            case "haziran":
                if (tarih<23 && tarih>=1){
                    System.out.println("İkizler Burcusunuz");
                } else if (tarih>=23 && tarih<=31) {
                    System.out.println("Yengeç Burcusunuz");
                }
                break;

            case "temmuz":
                if (tarih<23 && tarih>=1){
                    System.out.println("Yengeç Burcusunuz");
                } else if (tarih>=23 && tarih<=31) {
                    System.out.println("Aslan Burcusunuz");
                }
                break;

            case "ağustos":
                if (tarih<23 && tarih>=1){
                    System.out.println("Aslan Burcusunuz");
                } else if (tarih>=23 && tarih<=31) {
                    System.out.println("Başak Burcusunuz");
                }
                break;
            case "eylül":
                if (tarih<23 && tarih>=1){
                    System.out.println("Başak Burcusunuz");
                } else if (tarih>=23 && tarih<=31) {
                    System.out.println("Terazi Burcusunuz");
                }
                break;
            case "ekim":
                if (tarih<23 && tarih>=1){
                    System.out.println("Terazi Burcusunuz");
                } else if (tarih>=23 && tarih<=31) {
                    System.out.println("Akrep Burcusunuz");
                }
                break;
            case "kasım":
                if (tarih<22 && tarih>=1){
                    System.out.println("Akrep Burcusunuz");
                } else if (tarih>=22 && tarih<=31) {
                    System.out.println("Yay Burcusunuz");
                }
                break;
            case "aralık":
                if (tarih<22 && tarih>=1){
                    System.out.println("Yay Burcusunuz");
                } else if (tarih>=22 && tarih<=31) {
                    System.out.println("Oğlak Burcusunuz");
                }
                break;

        }


    }
}
