public class Asal {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;
        
        for (i = 2; i <= 100; i++) {
            isPrime = true;
            
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
           
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}