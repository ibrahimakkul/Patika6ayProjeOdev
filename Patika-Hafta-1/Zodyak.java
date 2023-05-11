import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yilinizi Giriniz : ");
        int birthYear = input.nextInt();
        String[] zodiacSigns = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Tiger", "Tavşan", "Ejderha", "Yilan", "At", "Koyun"};
        String zodiacSign = zodiacSigns[birthYear % 12];
        System.out.println("Çin Zodyaği Burcunuz : " + zodiacSign);
    }
}