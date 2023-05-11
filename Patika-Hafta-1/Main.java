import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int[] notlar = new int[5];
        double toplamNot = 0;
        int gecmeNotu = 55;
        int gecenDersSayisi = 0;

        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " notunuzu girin: ");
            int not = scanner.nextInt();
            if (not >= 0 && not <= 100) {
                toplamNot += not;
                gecenDersSayisi++;
            }
            notlar[i] = not;
        }

        double ortalama = toplamNot / gecenDersSayisi;
        if (gecenDersSayisi > 0 && ortalama >= gecmeNotu) {
            System.out.println("Tebrikler, sinifi geçtiniz!");
        } else {
            System.out.println("Maalesef sinifta kaldiniz.");
        }
    }
}