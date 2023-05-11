import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int number = input.nextInt();
        input.close();
        
        String numberString = Integer.toString(number); 
        String reversedNumberString = new StringBuilder(numberString).reverse().toString(); 
        
        if (numberString.equals(reversedNumberString)) {
            System.out.println(number + " bir palindrom sayidir.");
        } else {
            System.out.println(number + " bir palindrom sayi değildir.");
        }
    }
}