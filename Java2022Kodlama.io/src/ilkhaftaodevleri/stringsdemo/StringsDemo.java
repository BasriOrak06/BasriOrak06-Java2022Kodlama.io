package ilkhaftaodevleri.stringsdemo;

public class StringsDemo {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);
 /*       System.out.println("Eleman sayisi: " + message.length());
        System.out.println("5. eleman: " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] karekterler = new char[5];
        message.getChars(0, 5, karekterler, 0);
        System.out.println(karekterler);
        System.out.println(message.lastIndexOf("av"));
        System.out.println(message.lastIndexOf("a"));*/

        System.out.println(message.indexOf('ü'));

        System.out.println("------------");

        String yeniMesaj = message.replace(' ', '-');
        System.out.println(yeniMesaj);

        System.out.println(message.substring(2,5));

        for(String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());  //veri tabanı case sensitive ise aramalarda
        System.out.println(message.toUpperCase());

        System.out.println(message.trim()); //daha yeni verisyonu strip
    }
}
