import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        
        int[] dizi = new int[boyut];

       
        System.out.println("Dizinin elemanlarini girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        
        Arrays.sort(dizi);

       
        System.out.println("Dizinin küçükten büyüğe siralanmiş hali:");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}