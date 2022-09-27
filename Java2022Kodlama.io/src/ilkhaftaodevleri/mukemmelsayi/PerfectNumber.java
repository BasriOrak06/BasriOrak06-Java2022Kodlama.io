package ilkhaftaodevleri.mukemmelsayi;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Lütfen Pozitif bir Doğal Sayı Giriniz : ");
        Scanner tara = new Scanner(System.in);
        int sayi = tara.nextInt();
        int toplam = 0;

        for (int i = 1; i<sayi; i++) {
            if (sayi % i == 0) {
                toplam =toplam +i;
            }
        }

        if (sayi==toplam) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
