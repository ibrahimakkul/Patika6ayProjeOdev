import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, sum = 0;
        do {
            System.out.print("Bir sayi girin: ");
            input = scanner.nextInt();
            if (input % 2 == 0 && input % 4 == 0) {
                sum += input;
            }
        } while (input % 2 == 0);
        System.out.println("Girilen çift ve 4'ün katlari olan sayilarin toplami: " + sum);
    }
}