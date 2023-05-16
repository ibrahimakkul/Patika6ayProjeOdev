import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satir sayisini girin: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Matrisin sütun sayisini girin: ");
        int sutunSayisi = scanner.nextInt();

        int[][] matris = new int[satirSayisi][sutunSayisi];

        System.out.println("Matrisin elemanlarini girin:");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                matris[i][j] = scanner.nextInt();
            }
        }

        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        System.out.println("Transpoz:");
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}