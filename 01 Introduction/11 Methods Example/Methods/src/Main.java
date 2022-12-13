public class Main {
    public static void main(String[] args) {

        /**
         * To use a function, we can "call" or invoke the function
         * by its name. For example, to call the function in the example 1
         * we can do the following:
         */

        //Example 1. Printing a message twice
        print_twice("Hello!");

        //Example 2. Say hello to someone
        say_name("Juan!");

        // Example 3. Say hello multiple times
        hello_three_times("Peter");

        //Example 4. Converting from celsius degrees to fahrenheit.
        System.out.println(celsius_to_fahr(38.5));

        //Example 5. Printing ten asterisks
        print_ten_asterisks();

        //Example 6. Adding two numbers
        System.out.println(sumOfTwoNumbers(8, 7));

        //Example 7. Compute the maximum of three numbers
        System.out.println(max_of_three(8, 10, 18));

        /**
         * 11.6 Function composition
         * We can take small blocks of code and compose them.
         * That is, we can use the return value of a function as an
         * argument of another function.
         */
        //Example 8. Function composition
        max_of_three(sumOfTwoNumbers(8, 5), sumOfTwoNumbers(10, 5), 8);

        /**
         * 11.7 Exercises call of functions
         */

    }
    /**
     *  11.1 Why Functions?
     *  There are several reasons of why using functions:
     *  1. Creating a function gives you the opportunity to name a group of statements,
     *     which makes your program easier to read and debug.
     *  2. Functions make a program smaller by eliminating repetitive code.
     *  3. Once you write and debug one, you can reuse it.
     *
     *  11.2 Functions
     *  f(x) = x + 3
     *
     *  A function is a set of instructions to perform a specific task.
     *  The syntax of a function is the following
     *
     *  <Return type> <Name of the function> (Parameter(s) (optional)){
     *         Body of the function
     *  }
     *  If we don't want to return any type, the keyword used is "void".
     */

    //Example 1. Printing a message twice
    static void print_twice(String message){
        System.out.println(message);
        System.out.println(message);
    }

    //Example 2. Say hello to someone
    static void say_name(String name){
        System.out.println("Hello, " + name);
    }

    /**
     * 11.3 Calling functions from another function
     * Not only can we call a function from any part of our code,
     * but we can call a function within another function.
     *
     */
    // Example 3. Say hello multiple times
    static void hello_three_times(String name){
        for (int i = 0; i < 3; i++) {
            say_name(name);
        }
    }

    /**
     * 11.4 Return type
     * We can return different values from a function.
     * And we can return all the types seen in section 06Variables
     */

    // Example 4. Converting from celsius degrees to fahrenheit.
    static double celsius_to_fahr(double celsius){
        return 9/5 * celsius + 32;
    }
    /**
     * 11.5 Multiple parameters
     * So far we have seen examples of functions that have only one parameter, but
     * we can have zero, one, two or more parameters.
     */

    // Example 5. Printing ten asterisks
    static void print_ten_asterisks(){
        System.out.println("**********");
    }

    // Example 6. Adding two numbers
    static int sumOfTwoNumbers(int firstNum, int secondNum){
        int sum = firstNum + secondNum;
        return sum;
    }

    // Example 7. Compute the maximum of three numbers
    static int max_of_three(int firstNum, int secondNum, int thirdNum){
        int max_value = Integer.MIN_VALUE;

        if(firstNum > secondNum && firstNum > thirdNum){
            max_value = firstNum;
        } else if(secondNum > thirdNum){
            max_value = secondNum;
        } else {
            max_value = thirdNum;
        }
        return max_value;
    }
/**
 *
 * 11.7 Exercises.

 1. Make a function that converts from hours to minutes.
 Example. 28 hours to minutes.

 2. Make a function that computes the area of a triangle
 A = base * height / 2

 3. Make a function that converts from degrees to radians
 Formula: radians = π * degrees / 180

 4. Make a function that asks the user for a radius, so that we can return the area.
 Formula: A = π * r^2

 5. Given three numbers, make a function that returns the minimum value of them.

 6. Given the following scores, make a function that returns the average of them:
 scores = [8, 7, 9, 8, 10, 5, 8]

 7. Create a function to print any multiplication table between 1 and 12

 8. Make a function that computes the distance between two points in the Cartesian plane.
 Formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)

 9. Make a function that displays a menu with the following options:
 1. Add two numbers
 2. Subtract two numbers
 3. Multiply two numbers
 4. Divide two numbers.
 5. Exit

 10. Make a function to compute the factorial of a number
 Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120.

*/

 }