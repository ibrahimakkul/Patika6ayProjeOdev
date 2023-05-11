import java.util.Scanner;

public class Ucak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = input.nextInt();

        System.out.print("Yaşinizi giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = input.nextInt();

        double normalTutar = mesafe * 0.10;
        double yasIndirimi = 0;
        double yolculukIndirimi = 0;

        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatali Veri Girdiniz !");
        } else {
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas >= 65) {
                yasIndirimi = normalTutar * 0.30;
            }

            if (yolculukTipi == 2) {
                yolculukIndirimi = (normalTutar - yasIndirimi) * 0.20;
            }

            double toplamTutar = (normalTutar - yasIndirimi + yolculukIndirimi) * yolculukTipi;
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }
    }
}