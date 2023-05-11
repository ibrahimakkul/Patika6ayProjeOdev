import java.util.Scanner;

public class ATM {
public static void main(String[] args) {
String userName, password;
Scanner input = new Scanner(System.in);
int right = 3;
int balance = 1500;
int select;

    while (right > 0) {
        System.out.print("Kullanici Adiniz :");
        userName = input.nextLine();
        System.out.print("Parolaniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba, Kodluyoruz Bankasina Hoşgeldiniz!");
            do {
                System.out.println("1-Para yatirma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çikiş Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Para miktari : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para miktari : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem seçtiniz. Lütfen tekrar deneyiniz.");
                        break;
                }
            } while (select != 4);
            break;
        } else {
            right--;
            System.out.println("Hatali kullanici adi veya şifre. Tekrar deneyiniz.");
            if (right == 0) {
                System.out.println("Hesabiniz bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Hakkiniz : " + right);
            }
        }
    }
}
}