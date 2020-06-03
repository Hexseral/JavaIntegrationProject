// Jordan Tatum

// This imports our packages
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;


public class integration {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);

    System.out.println(
        "Welcome to my Integration Project. Below is a demonstration of what I have learned so far this semester. ");


    do {
      System.out.println("\n Press 1-9 to see examples, or 0 to exit");
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
          System.out.println(
              "6) This is an example of printing numbers using a while loop with a break statment at 4:\n ");
          int i = 1;
          while (i < 6) {
            System.out.println(i);
            /*
             * The code below is a break which breaks the loop when i is 4 after the 4th increment
             * of the loop
             */
            if (i == 4) {
              break;
            }
            // The i++ works as a tool for us to increment our loop
            i++;
          }

          break;

        case 7:
          System.out.println(
              "7) This is an example of printing 5 numbers using a for loop with a continue statment at 4:\n ");
          for (int f = 1; f < 6; f++) {
            /*
             * This is an example of a continue within a loop using the condition if f = 4. it will
             * then exclude that from the loop output (note that we cannot use =, so we use == which
             * is a relational operator)
             */
            if (f == 4) {
              continue;
            }
            System.out.println(f);
          }

          break;

        case 8:
          /*
           * Notice the use of String formatting to include quotes within the print statement
           * without running into a syntax error
           */
          System.out.println(
              "8) This is an example of comparing the two string objects \"pizza\", \"mouse\" and \"keyboard\": \n");
          String pizza = "pizza";
          String keyboard = "keyboard";
          String mouse = "mouse";

          /*
           * This uses the compares to method and gives us a negative because the strings are not
           * equal
           */
          int var3 = keyboard.compareTo(pizza);
          System.out.println(var3);

          /*
           * This uses the .equals method to compare two strings and since the characters do not
           * match it returns false. Notice we are not using ==, because the == operator only
           * compares object references. So when comparing strings we must use .equals
           */
          System.out.println(pizza.equals(mouse));



          break;

        case 9:
          System.out.println(
              "9) This is an example of using Java's Arithmatic Operators using two variables x & y that both equal 2: \n");
          int x = 2;
          int y = 2;
          System.out.print(" x + y = ");
          System.out.print(x += y);
          System.out.print("\n x - y = ");
          System.out.print(x -= y);
          System.out.print("\n x * y = ");
          System.out.print(x *= y);
          System.out.print("\n x / y = ");
          System.out.print(x /= y);
          System.out.print("\n");

          break;
        case 0:
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
