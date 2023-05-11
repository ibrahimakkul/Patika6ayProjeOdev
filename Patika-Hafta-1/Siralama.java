import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Küçükten büyüğe sıralama: " + Arrays.toString(numbers));
    }
}