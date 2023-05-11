import java.util.Scanner;

public class NotOrtalamasiHesaplayici {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        int matematik = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        int fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        int kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        int turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        int tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        int muzik = input.nextInt();

        int ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        switch (ortalama / 10) {
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("Ortalamaniz: " + ortalama + "\nSinifi Geçtiniz.");
                break;
            default:
                System.out.println("Ortalamaniz: " + ortalama + "\nSinifta Kaldiniz.");
                break;
        }
    }
}