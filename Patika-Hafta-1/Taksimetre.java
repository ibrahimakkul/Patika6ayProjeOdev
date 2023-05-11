import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        double km = input.nextDouble();

      
        double acilisUcreti = 10.0;
        double kmBasiUcret = 2.20;
        double tutar = acilisUcreti + (km * kmBasiUcret);
        
        if (tutar < 20.0) {
            tutar = 20.0;
        }

        System.out.println("Taksimetre Tutarı: " + tutar + " TL");
    }
}