import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sicaklik Değerini Giriniz: ");
        int sicaklik = input.nextInt();
        
        if (sicaklik < 5) {
            System.out.println("Hava çok soğuk, Kayak yapabilirsiniz.");
        } else if (sicaklik < 15) {
            System.out.println("Hava biraz soğuk, Sinemaya gidebilirsiniz.");
        } else if (sicaklik < 25) {
            System.out.println("Hava güzel, Piknik yapabilirsiniz.");
        } else {
            System.out.println("Hava çok sicak, Yüzmeye gidebilirsiniz.");
        }
        
        
    }
}