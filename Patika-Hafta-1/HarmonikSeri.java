import java.util.Scanner;

public class HarmonikSeri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        double harmonikSeri = 0;
        for (int i = 1; i <= n; i++) {
            harmonikSeri += 1.0 / i;
        }

        System.out.println("Harmonik Seri: " + harmonikSeri);
    }
}