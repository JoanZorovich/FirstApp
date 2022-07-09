import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        // //// First Hello world
        // System.out.println("Hello, World!");
        // System.out.println("Hola 2");
        




        // int variable
        // variable = 6*365;
        // System.out.println(variable);






        // // enter a value by console
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter value 1");
        // int value1 = scanner.nextInt();

        // System.out.println("Enter value 2");
        // int value2 = scanner.nextInt();

        // int result = value1 + value2;

        // System.out.println("The result is " + result);

        // ////Control Structures

        // if(result>=50){
        //     System.out.println("The result is greater than 50");
        // }else{
        //     System.out.println("The result is less than 50");
        // }






      //     //Arrays
      
      // String lastname = "Perez";

      // //Array os strings 

      // String[] lastnames = new String[5];

      // lastnames[0] ="Rodriguez";
      // lastnames[1] ="Garcia";
      // lastnames[2] ="Arias";
      // lastnames[3] ="Zorovich";
      // lastnames[4] ="Delgadillo";
      
      // System.out.println(lastnames[3]);

      // for (int i=0; i < lastnames.length; i++){
      //   System.out.println(lastnames[i]);
      // }


      //fill an array with diferents prices that a user enter
      Scanner scanner = new Scanner(System.in);
      int[] prices = new int[3];

      for(int i=0; i < prices.length; i++){
        System.out.println("Enter price " + i);
        prices[i] = scanner.nextInt();
      }

      System.out.println("The second price is " + prices[1]);

      //Array Operations
      int totalPrice = 0;
      for(int i=0; i < prices.length; i++){
        totalPrice += prices[i];
      }

      System.out.println("The total price is " + totalPrice);

      double average = totalPrice / prices.length;

      System.out.println("The average is " + average);
    }
}
