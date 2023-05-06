import java.util.Scanner;

public class VucutKitleIndex
{
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) girin: ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu (kilogram cinsinden) girin: ");
        double kilo = input.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
