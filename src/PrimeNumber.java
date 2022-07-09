import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Give me a number, please!");
      int number = scanner.nextInt();

      int counter = 0;

      for(int i=1; i < number; i++) {
        if (number%i==0) {
          counter++;
        }
      }

      if (counter<=2) {
        System.out.println(number + " is a prime number");
      }else {
        System.out.println(number + " isn´t a prime number");
      }
      
    }
}
