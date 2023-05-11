import java.util.Scanner;


public class ManavKasa
{
	public static void main(String[] args) {

        double armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat;
        armutFiyat = 2.14;
        elmaFiyat = 3.67;
        domatesFiyat = 1.11;
        muzFiyat = 0.95;
        patlicanFiyat = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlican Kaç Kilo? : ");
        double patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat) + (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam Tutar: " + String.format("%.2f", toplamTutar) + " TL");

    }
}