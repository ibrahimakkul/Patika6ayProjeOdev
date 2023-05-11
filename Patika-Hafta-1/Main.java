import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    
    String password = "password123";
    
    
    System.out.print("Lütfen şifrenizi girin: ");
    String userPassword = input.nextLine();
    
    
    if (userPassword.equals(password)) {
        System.out.println("Giriş başarili!");
    } 
   
    else {
        System.out.println("Şifre yanliş!");
        
       
        System.out.print("Şifrenizi sifirlamak ister misiniz? (E/H): ");
        String resetChoice = input.nextLine();
        
        
        if (resetChoice.equalsIgnoreCase("E")) {
            System.out.print("Yeni şifrenizi girin: ");
            String newPassword = input.nextLine();
            
            
            if (newPassword.equals(userPassword)) {
                System.out.println("Şifre oluşturulamadi, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şifre oluşturuldu.");
            }
        }
    }
}
}




