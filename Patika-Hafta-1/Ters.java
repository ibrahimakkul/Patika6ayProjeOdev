import java.util.Scanner;

public class Ters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisi: ");
        int basamak = input.nextInt();

        for (int i = 0; i < basamak; i++) {
            for (int j = basamak; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}