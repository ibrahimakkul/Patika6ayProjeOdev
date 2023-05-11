import java.util.Scanner;

public class ÜcgenAlnHipotens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Alan hesaplamak istiyorsaniz 1 girin");
        int deger=scanner.nextInt();


        if(deger==1){
        System.out.print("Birinci kenar uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();
        System.out.print("İkinci kenar uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();
        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        double kenar3 = scanner.nextDouble();

        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Alan: " + alan);}
        else{
        System.out.print("Birinci dik kenar uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();
        System.out.print("İkinci dik kenar uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        double hipotenus = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);

        System.out.println("Hipotenüs: " + hipotenus);
        }
    }
}