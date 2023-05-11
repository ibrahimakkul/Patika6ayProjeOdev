import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yariçapini giriniz: ");
        double r = input.nextDouble();

      
        double alan = Math.PI * r * r;
        System.out.println("Dairenin alani: " + alan);

        
        double cevre = 2 * Math.PI * r;
        System.out.println("Dairenin çevresi: " + cevre);

        System.out.print("Merkez açisinin ölçüsünü giriniz: ");
        double aci = input.nextDouble();
        double dilimAlan = (Math.PI * (r * r) * aci) / 360;
        System.out.println("Daire diliminin alani: " + dilimAlan);
    }
}