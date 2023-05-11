import java.util.Scanner;

public class Katlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.println("4'ün kuvveti: " + (int) Math.pow(4, i / 4));
            }
            if (i % 5 == 0) {
                System.out.println("5'in kuvveti: " + (int) Math.pow(5, i / 5));
            }
        }
    }
}