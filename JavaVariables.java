// Jordan Tatum

// This imports our math & random packages
import java.lang.Math;
import java.util.Random;

public class HelloWorld {
  public static void main(String[] args) {

    // this is our argument (argument values)
    int sum = add(28, 32);
    System.out.println("Ex1)  This is a method deomonstration: " + sum);

    // this uses our ranSum method to demonstrate how we can use a method to add two random
    // integers.
    int randSum = ranSum();
    System.out.println(
        "Ex2)  This is a method deomonstration of adding two randomly generated numbers between 1-50: "
            + randSum);

    int rootSum = root();
    System.out.println(
        "Ex3)  This is a method demonstration of adding two square rooted numbers: " + rootSum);

    // This if else statement evaluates the randSum & rootSum and prints out the greater value
    if (rootSum > randSum) {
      System.out.println("Example two has a larger sum then example 1");
    } else {
      System.out.println("Example one as a larger sum then example 2");
    }

    // this is an example of using a ternary construct
    int max = randSum >= rootSum ? randSum : rootSum;
    System.out.println("Java Ternary example: " + max);

  }

  // This is a method header with a parameter list within the parenthesis
  public static int add(int i, int j) {
    // This is our return value
    return i + j;

  }

  public static int ranSum() {
    // This is my demonstration of using the Random class
    Random rand = new Random();
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
