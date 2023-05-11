import java.util.Scanner;

public class Desene {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : " );
        int number = scan.nextInt();
        int ilkdgr = number;
        fonk1(number, ilkdgr);
    }
    static int fonk1(int number, int ilkdgr) {
        if (number > 0) {
            System.out.print(number + " ");
           return fonk1(number - 5, ilkdgr);
        } else if (number <= 0) {
           return fonk2(number, ilkdgr);
        }
        return 0;
    }
    static int fonk2(int number, int ilkdgr) {
        if (ilkdgr >= number) {
            System.out.print(number + " ");
           return fonk2(number + 5, ilkdgr);
        }else  return 1;
        
    }
    
}
