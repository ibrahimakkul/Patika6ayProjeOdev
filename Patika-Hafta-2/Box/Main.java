import java.util.Random;


public class Main {
    public static void main(String[] args) {
       Random rand = new Random();
       int randomNumber = rand.nextInt(2) + 1;

      Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
      Ring r = new Ring(marc,alex , 90 , 100);
      r.run(randomNumber);
    }
}