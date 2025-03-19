
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    double wynik = 0;
    
    for (int i = 0; i < 5; i++) {
      int liczba = random.nextInt(101);
      wynik += Math.pow(liczba,2);
    }
    System.out.println(wynik);
  }
}
