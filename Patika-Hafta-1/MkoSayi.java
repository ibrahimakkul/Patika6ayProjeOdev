import java.util.Scanner;

public class MkoSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " mükemmel sayidir.");
        } else {
            System.out.println(number + " mükemmel sayi değildir.");
        }
    }
}