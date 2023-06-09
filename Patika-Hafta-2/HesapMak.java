import java.util.Scanner;

public class HesapMak {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void modulus() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Mod alinacak sayiyi giriniz :");
    int num1 = scan.nextInt();
    System.out.print("Mod değerini giriniz :");
    int num2 = scan.nextInt();
    int result = num1 % num2;
    System.out.println("Sonuç : " + result);
}
static void dikdortgenAlan() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Dikdörtgenin kisa kenarini giriniz :");
    int kisaKenar = scan.nextInt();
    System.out.print("Dikdörtgenin uzun kenarini giriniz :");
    int uzunKenar = scan.nextInt();
    int alan = kisaKenar * uzunKenar;
    System.out.println("Dikdörtgenin alani : " + alan);
}

static void dikdortgenCevre() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Dikdörtgenin kisa kenarini giriniz :");
    int kisaKenar = scan.nextInt();
    System.out.print("Dikdörtgenin uzun kenarini giriniz :");
    int uzunKenar = scan.nextInt();
    int cevre = 2 * (kisaKenar + uzunKenar);
    System.out.println("Dikdörtgenin çevresi : " + cevre);
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çikarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabi\n"
                + "0- Çikiş Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    dikdortgenAlan();
                    break;
                case 9:
                    dikdortgenCevre();
                    break;        
                case 0:
                    break;
                default:
                    System.out.println("Yanliş bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}