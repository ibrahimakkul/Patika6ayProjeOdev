import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = input.nextLine();
        
        boolean palindromik = true;
        int uzunluk = kelime.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                palindromik = false;
                break;
            }
        }
        if (palindromik) {
            System.out.println(kelime + " kelimesi palindromiktir.");
        } else {
            System.out.println(kelime + " kelimesi palindromik değildir.");
        }
    }
}