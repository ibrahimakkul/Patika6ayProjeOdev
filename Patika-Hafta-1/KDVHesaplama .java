import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün tutarini giriniz: ");
        double tutar = input.nextDouble();
        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV Orani: %" + (kdvOrani * 100));
        System.out.println("KDV Tutari: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);

        input.close();
    }
}