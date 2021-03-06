/*
 * Jordan Tatum
 * 
 * program description - 
 * 
 * 
 * polymorphism - polymorphism literally means a state of having many shapes, or the capacity to
 * take on different forms. In Java, it describes a language's ability to process objects of various
 * types and classes through a single, uniform interface. For example, a woman can be a wife, an
 * employee, and a mother meaning the same person can have different behaviors depending on the
 * situation.
 * 
 * inheritance - in Java inheritance is the mechanism in java by which one class is allow to inherit
 * the features of another class. a subclass inherits fields and methods from a superclass, but a
 * subclass can add its own methods and fields to make it unique. The benefit of inheritance is the
 * ability to reuse code so a child class does not have to be rewritten with its parents methods &
 * fields
 */

// This imports our packages
import java.lang.Math;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/** A driver class for a Java knowledge demonstration Program.
 * @author Jordan Tatum
 *
 */
public class Main {
  /** This tells my program to begin execution here.
   * @param args Stores everything from main.
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to my Integration Project. Below is a demonstration of what "
        + "I have learned\rso far in this course.  ");
    boolean loopControl = true;
    do {
      System.out.println("\n Type a number 1-19 to see examples, or any other " + "number to exit");
      // Exception handling
      int userInput = 0;
      boolean exceptionControl = false;
      do {
        try {
          userInput = scan.nextInt();
          exceptionControl = false;
        } catch (InputMismatchException e) {
          System.out.println("Please enter a number between 1-19.");
          scan.nextLine();
          exceptionControl = true;
        } catch (Exception e) {
          e.printStackTrace();
        }
      } while (exceptionControl);

      int rootSum = root();
      int randSum = ranSum();

      switch (userInput) {
        case 1:
          // this is our argument (argument values)
          int sum = add(28, 32);
          System.out.println("1)  This is a method demonstration: " + sum);
          break;

        case 2:
          System.out.println("2)  This is a method demonstration of adding two randomly "
              + "generated numbers between 1-50:  " + randSum);
          break;

        case 3:
          System.out.println("3)  This is a method demonstration of adding two "
              + "square rooted numbers: " + rootSum);
          break;

        case 4:
          // This if else statement evaluates the randSum & rootSum and prints out higher values
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
          System.out.println("6) This is an example of printing numbers using a while loop "
              + "with a break statment at 4:\n ");
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
          System.out.println("7) This is an example of printing 5 numbers using a for loop "
              + "with a continue" + " statment at 4:\n ");
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
          System.out.println("8) This is an example of comparing the two string objects \"pizza\", "
              + "\"mouse\" and \"keyboard\": \n");
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
              "9) This is an example of using Java's Arithmatic Operators using two variables "
                  + "x & y that both equal 2: \n");
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
          System.out.print(x %= y);
          System.out.print("\n");

          break;

        case 10:
          /*
           * This pulls from my milestone 1 Class and displays the variables I created, notice that
           * the fields are private members.
           */
          System.out.println("10) This is an example of all the data types in Java"
              + " using an external class: ");
          JavaVariables variableExample = new JavaVariables();
          variableExample.variablesPrint();

          break;

        case 11:
          /*
           * This is an example of creating an external class that contains getters, setters, and a
           * constructor with & without parameters. I will be using a simple Car example with the
           * fields make model and top speed. See the Cars.java file for the external class.
           */
          System.out.println("11) Below is an example of using an external class to create objects "
              + "with unique fields:\n ");
          Car car1 = new Car();
          Car car2 = new Car("Toyota", "Tacoma", 90);

          System.out.println(car1.getCarMake());
          System.out.println(car1.getcarModel());
          System.out.println(car1.getCarTopSpeed() + " Mph");
          System.out.println(" ");
          System.out.println(car2.getCarMake());
          System.out.println(car2.getcarModel());
          System.out.println(car2.getCarTopSpeed() + " Mph");

          break;

        case 12:
          // example of an overloaded method
          System.out.println(
              "12) Below is an example of using an overloaded method to " + "add two ints:\n");
          System.out.println(overload(12, 12));
          // even though we are using a double with the same method since we have an overloaded
          // method it accepts the input
          System.out.println(overload(12.0, 12.0));
          break;

        case 13:
          // example of a one dimensional array that is declared, instantiated, initialized.
          System.out.println(
              "13) Below is an array containing 5 integers printed using" + " a for loop:\n ");
          // Declaration
          int[] arr;
          // Initialization
          arr = new int[] {6, 12, 26, 43, 15};
          // For loop to print each element within the array
          for (int a = 0; a < 5; a++) {
            System.out.println(arr[a]);
          }

          break;

        case 14:
          // example of an enhanced for loop
          System.out.println(
              "14) This is an example of using an enhanced for loop to print" + " an array:\n ");
          int[] array = {6, 12, 26, 43, 15};
          for (Integer elements : array) {
            System.out.println(elements);
          }

          break;

        case 15:
          // This is an example of how to find the minimum value in an array using a method
          System.out.println("15) This is an example of finding the minimum " + "in an array:\n ");
          int[] array2 = {56, 112, -33, 74, 32, 221};
          System.out.print("Minimum value: ");
          System.out.print(getMinValue(array2));

          break;

        case 16:
          // This is an example of getting a sum of the values in an array using an accumulator.
          System.out.println(
              "16) This is an example of getting the sum of all the elements " + "in an array: \n");
          System.out.println("The array: {1,2,3,4,5}\n");
          int[] a = {1, 2, 3, 4, 5};
          System.out.print("Total: ");
          System.out.println(sumOfElements(a)); // should print 15

          break;

        case 17:
          // This is an example of searching an array and identifying the index where a value was
          System.out.println(
              "17) This is an example of finding the index of the element 1 " + "in an array:\n ");
          int[] values = {45, 123, 34, 1, 234};
          int index = 0;
          for (int iteration = 0; iteration < values.length; iteration++) {
            if (values[iteration] == 1) {
              index = iteration;
            }
          }
          System.out.println("index: " + index);

          break;

        case 18:
          /*
           * This is an example of a two dimensional array, and how to Search the array to identify
           * the coordinates where a value was found
           */
          System.out.println("18) Below is an example of finding a value in a 2D array: \n");
          int[][] twoDimensionArray = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
          
          /*
           * The line in our print statement calls our array and locates the element in row 1
           * column2, it is important to note that when we index an array it always starts with 0.
           */

          for (int row = 0; row < twoDimensionArray.length; row++) {
            for (int column = 0; column < twoDimensionArray[row].length; column++) {
              if (twoDimensionArray[row][column] == 9) {
                System.out.print("Row: " + row + " Column: " + column);
              }
            }
          }

          break;

        case 19:
          // This is an example of an ArrayList
          System.out.println("19) Below is an example of creating and adding objects"
              + " from our car class to an ArrayList: \n");
          // This creates an ArrayList of type cars
          ArrayList<Car> cars = new ArrayList<Car>();
          // builds car objects for ArrayList
          Car car3 = new Car("Bugatti", "Veyron", 253);
          Car car4 = new Car("Koenigsegg", "Agera", 277);
          Car car5 = new Car("Bugatti", "Chiron", 304);
          // appends to car list
          cars.add(car3);
          cars.add(car4);
          cars.add(car5);

          // prints the object list
          for (Car c : cars) {
            System.out.println(c);
          }
          break;

        default:
          loopControl = false;
          scan.close(); 
          break;
      }
    } while (loopControl);
  }

  // This is a method header with a parameter list within the parenthesis
  public static int add(int i, int j) {
    // This is our return value
    return i + j;
  }

  // Example of an overloaded method (Same name different signature)
  public static int overload(int one, int two) {
    return one + two;
    // note the different signature
  }

  public static int overload(double one, double two) {
    return (int) (one + two);
  }

  /** A method to add two random integers between 0 to 50. 
   * @return
   */
  public static int ranSum() {
    // This is my demonstration of using the Random class
    Random rand = new Random();
    // The + before the rand.nextInt allows us to start from 1 instead of 0 making it 1-50
    int randOne = +rand.nextInt(50);
    int randTwo = +rand.nextInt(50);
    return randOne + randTwo;
  }

  /** A method that adds the square root of variables num1 & num2.
   * @return
   */
  public static int root() {
    double num1 = 24;
    double num2 = 64;
    /*
     * This is an example of using the Math class to return the sum of two square roots while also
     * casting the sum from a double to an integer.
     */
    return (int) (Math.sqrt(num1) + Math.sqrt(num2));
  }

  /** A method to return the smallest value in an array.
   * @param num This is the array we are using.
   * @return Returns the smallest value.
   */
  public static int getMinValue(int[] num) {
    int minValue = num[0];

    for (int i = 0; i < num.length; i++) {
      {
        {
          if (minValue > num[i]) {
            minValue = num[i];
          }
        }
      }
    }
    return minValue;
  }

  /** This is the sum of the elements in an array.
   * @param array Specifies the array.
   * @return Returns the sum.
   */
  public static int sumOfElements(int[] array) {

    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }

}
