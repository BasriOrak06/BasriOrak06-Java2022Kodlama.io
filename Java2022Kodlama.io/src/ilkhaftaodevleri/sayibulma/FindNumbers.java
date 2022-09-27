package ilkhaftaodevleri.sayibulma;

public class FindNumbers {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 14;
        boolean varMi = false;

        for (int i : sayilar) {
            if (i == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi == true) {
            System.out.println("Aranan sayı mevcuttur");
        } else {
            System.out.println("Aranan sayı mevcut değildir");
        }
    }
}
