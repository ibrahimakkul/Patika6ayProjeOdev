import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        
        int n_faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            n_faktoriyel *= i;
        }

        int r_faktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            r_faktoriyel *= i;
        }

        int n_minus_r_faktoriyel = 1;
        for (int i = 1; i <= n - r; i++) {
            n_minus_r_faktoriyel *= i;
        }

        int kombinasyon = n_faktoriyel / (r_faktoriyel * n_minus_r_faktoriyel);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}