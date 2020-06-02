// Jordan Tatum

// This imports our math & random packages
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;


public class integration {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println(
        "Welcome to the integration project, Below is a demonstration of what I have learned this semester. ");


    do {
      System.out.println("\n Press 1-6 to see examples, or 7 to exit");
      int userInput = scan.nextInt();

      int rootSum = root();
      int randSum = ranSum();

      switch (userInput) {
        case 1:
          // this is our argument (argument values)
          int sum = add(28, 32);
          System.out.println("1)  This is a method deomonstration: " + sum);
          break;

        case 2:
          System.out.println(
              "2)  This is a method deomonstration of adding two randomly generated numbers between 1-50:  "
                  + randSum);
          break;

        case 3:
          System.out.println(
              "3)  This is a method demonstration of adding two square rooted numbers: " + rootSum);
          break;

        case 4:
          // This if else statement evaluates the randSum & rootSum and prints out the greater value
          if (rootSum > randSum) {
            System.out.println("4) Example two has a larger sum then example 1");
          } else {
            System.out.println("4) Example one as a larger sum then example 2");
          }
          break;

        case 5:
          // this is an example of using a ternary construct
          int max = randSum >= rootSum ? randSum : rootSum;
          System.out.println("5) Java Ternary example: " + max);
          break;

        case 6:

          System.out.println("6) This is an example of printing 5 numbers using a while loop: ");
          int i = 0;
          while (i < 5) {
            System.out.println(i);
            // The i++ works as a tool for us to increment our loop
            i++;
          }

          break;

        case 7:
          System.exit(0);
      }


    } while (true);


  }



  // This is a method header with a parameter list within the parenthesis
  public static int add(int i, int j) {
    // This is our return value
    return i + j;

  }

  public static int ranSum() {
    // This is my demonstration of using the Random class
    Random rand = new Random();
    // The + before the rand.nextInt allows us to start from 1 instead of 0 making it 1-50 
    int randOne = +rand.nextInt(50);
    int randTwo = +rand.nextInt(50);
    return randOne + randTwo;
  }

  public static int root() {
    double num1 = 24;
    double num2 = 64;
    /*
     * This is an example of using the Math class to return the sum of two square roots while also
     * casting the sum from a double to an integer.
     */
    return (int) (Math.sqrt(num1) + Math.sqrt(num2));
  }


}
