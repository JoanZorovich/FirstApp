import java.util.Scanner;

public class JavaPow{
    public static void main(String[] args) throws Exception {
    
      /// make a multiplication without using the multiplication operator

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the first number to multiply");
      int number1= scanner.nextInt();

      System.out.println("Enter the second number to multiply");
      int number2= scanner.nextInt();


      int counter = 0;
      int power = 1;


      for (int i = 1; i <= number2; i++){
        counter+= number1;

        power = power * number1;
      }

      System.out.println(number1 + " X " + number2 + " = " + counter);
      System.out.println(number1 + " to the power of " + number2 + " is " + power);
    }
}
