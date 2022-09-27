package ikincihaftaodevleri.video30;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc1 =dortIslem.topla(12, 4);
        int sonuc2 =dortIslem.cikar(12, 4);
        int sonuc3 =dortIslem.carp(12, 4);
        int sonuc4 =dortIslem.bol(12, 4);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
    }
}
