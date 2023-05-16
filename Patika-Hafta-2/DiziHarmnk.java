import java.util.Scanner;

public class DiziHarmnk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        System.out.println("Dizi elemanlarini girin:");

        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        double harmonicMean = calculateHarmonicMean(array);
        System.out.println("Harmonik Ortalama: " + harmonicMean);

       
    }

    public static double calculateHarmonicMean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += 1 / array[i];
        }
        return array.length / sum;
    }
}