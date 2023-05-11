import java.util.Scanner;

public class ElmasYapimi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Elmasin boyutunu giriniz: ");
        int boyut = input.nextInt();

        for (int i = 1; i <= boyut; i++) { 
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = boyut - 1; i >= 1; i--) { 
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}