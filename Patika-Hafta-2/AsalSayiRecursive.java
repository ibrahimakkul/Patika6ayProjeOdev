import java.util.Scanner;

public class AsalSayiRecursive {

    public static boolean isPrime(int n, int i) {
        if (i == 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return isPrime(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int num = scanner.nextInt();

        if (isPrime(num, num / 2)) {
            System.out.println(num + " bir asal sayidir.");
        } else {
            System.out.println(num + " bir asal sayi değildir.");
        }
    }
}