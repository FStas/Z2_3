
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    
    System.out.println("5 random numbers between 0 and 100:");
    for (int i = 0; i < 5; i++) {
      int number = random.nextInt(101); // generates number from 0 to 100 inclusive
      System.out.println(number);
    }
  }
}
