package bilet;
import java.util.Scanner;
public class Bilet_fiyati {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mesafe, yas;
        int yolculukturu;
        System.out.println("Mesafeyi km türünden giriniz :");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz  :");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukturu = input.nextInt();


        double indirim1,indirim2,indirim3,indirim4= 0;
        double bilet_fiyat = mesafe * 0.10;
        if ((yas < 0) || (mesafe < 0)||(yolculukturu!=1)&&(yolculukturu!=2)) {
            System.out.println("Hatalı veri girdiniz");
        } else if (yas < 12) {
            indirim1 = bilet_fiyat / 2;
            bilet_fiyat = bilet_fiyat - indirim1;
        } else if ((yas > 12) && (yas < 24)) {
            indirim2 = (bilet_fiyat * 10) / 100;
            bilet_fiyat = bilet_fiyat - indirim2;

        } else if (yas > 65) {
            indirim3 = (bilet_fiyat * 30) / 100;
            bilet_fiyat = bilet_fiyat - indirim3;


        } else if (yolculukturu == 2) {
            indirim4 = (bilet_fiyat * 20) / 100;
            bilet_fiyat = bilet_fiyat - indirim4;

        } else {

        }
      System.out.println("toplam tutar:"+bilet_fiyat);
    }
}











