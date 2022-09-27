package ilkhaftaodevleri.asalsayi;

import java.util.Scanner;

public class AsalMi {
    //Kullanıcının konsoldan girdiği sayının asal sayı olup olmadığını kontrol eden bir algoritma tasarladım
        public static void main(String[] args) {
            System.out.print("Lütfen Pozitif bir Doğal Sayı Giriniz : ");
            Scanner tara = new Scanner(System.in);
            int girilenSayi = tara.nextInt();

            boolean durum = true;
            for (int i = 2; i < girilenSayi; i++) {
                if (girilenSayi % i == 0) {
                    durum = false;
                    break;
                }
            }

            if (durum) {
                System.out.println(girilenSayi + " asaldır.");
            } else {
                System.out.println(girilenSayi + " asal değildir.");
            }
    }
}
