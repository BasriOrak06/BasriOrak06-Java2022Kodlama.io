package ilkhaftaodevleri.loopdemo;

public class LoopDemo {
    public static void main(String[] args) {
        //For
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int i = 1;
        //While
        while(i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        int j = 21;
        //Do-While
        do{
            System.out.println(j);
            j+=2;
        } while(j < 10);

        System.out.println("Do-While Döngüsü Bitti");

    }
}
