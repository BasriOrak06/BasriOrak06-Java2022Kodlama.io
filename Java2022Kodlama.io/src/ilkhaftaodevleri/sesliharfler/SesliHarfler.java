package ilkhaftaodevleri.sesliharfler;

import java.util.Scanner;

public class SesliHarfler {
    public static void main(String[] args) {
        //Bu  ödevde de yine kullanıcıdan girdi almaya tercih ettim. ***tara.next().charAt(0)*** ifadesi ile kullanıcıdan sadece tek karekter istediğimiz için
        //kullanıcının girmiş verinin sadece ilk indeksini almış olduk
        System.out.print("Lütfen sesli bir harf giriniz: ");
        Scanner tara = new Scanner(System.in);
        char girilenHarf = tara.next().charAt(0);
        System.out.println(girilenHarf);

        switch (girilenHarf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':     //JAVA case sensitive - büyük küçük harf duyarlı - olduğu için kullanıcının küçük harf girmesi durumunda yanlış sonuç
            case 'ı':     // dönmesinin engellenmesi için küçük harflari de case olarak verdim
            case 'o':
            case 'u':
                System.out.println(girilenHarf + " kalın sesli bir harftir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println(girilenHarf + " ince sesli bir harftir");
                break;
            default:
                System.out.println(girilenHarf + " - sesli bir harf değildir. Lütfen sesli bir harf giriniz");
                //Kullanıcı sesli harf dışında bir veri girerse siz konusu durumu versin
        }
    }
}
