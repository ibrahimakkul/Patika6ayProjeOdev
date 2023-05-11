import java.util.Arrays;
import java.util.Scanner;

public class BykKck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayi gireceksiniz?: ");
        int n = scanner.nextInt();

        
        short[] numbers = new short[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayiyi girin: ");
            numbers[i] = scanner.nextShort();
        }

       
        Arrays.sort(numbers);

        
        short min = numbers[0];
        short max = numbers[n - 1];

       
        System.out.println("En küçük sayi: " + min);
        System.out.println("En büyük sayi: " + max);
    }
}