import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Taban değerini giriniz: ");
        int taban = scanner.nextInt();
        
        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();
        
        int sonuc = 1;
        
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        
        System.out.println(taban + "^" + us + " = " + sonuc);
        
        scanner.close();
    }

}