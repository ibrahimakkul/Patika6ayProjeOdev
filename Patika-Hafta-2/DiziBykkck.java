import java.util.Scanner;

public class DiziBykkck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Dizi elemanlarini girin:");

        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Bir sayi girin: ");
        int number = scanner.nextInt();

        int nearestSmaller = minDgr(array, number);
        int nearestGreater = maxDgr(array, number);

        System.out.println("Girilen sayidan küçük en yakin sayi: " + nearestSmaller);
        System.out.println("Girilen sayidan büyük en yakin sayi: " + nearestGreater);

        scanner.close();
    }

    public static int minDgr(int[] array, int number) {
        int nearestSmaller = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < number && array[i] > nearestSmaller) {
                nearestSmaller = array[i];
            }
        }

        return nearestSmaller;
    }

    public static int maxDgr(int[] array, int number) {
        int nearestGreater = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number && array[i] < nearestGreater) {
                nearestGreater = array[i];
            }
        }

        return nearestGreater;
    }
}