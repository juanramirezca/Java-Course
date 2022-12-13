import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        /**
         * 1. Printing a list of elements with functional programming.
         */
        /*
        Example 1. Print a list of elements
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");

        //Printing with for-each loop

        printWithFP(list);


        Exercise 1. Create a list of numbers and print all of them.
        Solution:
        1) Using Imperative Programming (IP).

        List<Double> scores = List.of(8.4, 6.6, 7.5, 9.1, 10.0);

        for(double sc : scores){
            System.out.println(sc);
        }

        2) Using Functional Programming (FP).
        scores.stream().forEach(sc -> System.out.println(sc));

        */

        /**
         * 2. Adding logic to our program.
         * In this step we will introduce the function called filter(),
         * which filters elements from a list given some logic.
         *
         */

        /*

        //Example 2. Print elements that ends with the string "at".

        List<String> animals = List.of("Apple", "Bat", "Cat", "Dog");
        printWithFPFiltering(animals);

        // Exercise 2. Create a list of integers and filter only the odd numbers

        List<Integer> numbers = List.of(7, 8, 10, 9, 8);

        numbers.stream()
                .filter(element -> element % 2 == 0)
                .forEach(element -> System.out.println(element));



        // Exercise 3. Create a list of integers and filter only the even numbers


        */


        /**
         * 3. The reduce() function.
         * We can use this function to "reduce" a pair of numbers into one.
         * That means, for each pair of elements, x and y, we want to do a computation
         * with these elements (+, -, *, /, etc.)
         */


        /*
        // Example 3. Add all the elements of a list

        // Solution 1. Using IP
        int suma_imp = 0;

        for (int e : numbers) {
            suma_imp += e;
        }
        System.out.println("The sum using IP is: " + suma_imp);


        // Solution 2. Using FP

        suma = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println("The sum using FP is:" + suma);

        */

        /**
         * 4. Functional Programming Concepts
         * 4.1 Lambda expression. We can see a lambda expression as a shortcut of a method, where we have parameters and
         * a return value. Inside a lambda expression we can have multiple instructions, and for that we MUST use braces {}
         *
         */

        //Example 4. Multiple instructions inside a lambda expression
        List<Integer> scores = List.of(8, 8, 7, 10, 5, 6, 10, 9);
        //fpSum(scores);

        //Exercise 4. Given the previous scores, compute the average using IP and FP

        /**
         * 4.2 Intermediate Operations.
         * There are many intermediate Operations that can be performed using FP.
         * These operations perform and action over a stream and returns also a stream value.
         *
         * 4.2.1 The sorted() function
         * We can use this function to sort a list of values.
         */

        //Example 5. Sorting elements of a list
        //scores.stream().sorted().forEach(e -> System.out.println(e));

        /**
         * 4.2.2 The distinct() function
         * This function let us know only the distinct numbers within a list.
         */

        //Example 6. Obtaining the different values of a list
        scores.stream().distinct().sorted().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

        /**
         * 4.2.3. The map() function
         * Returns a stream of the results after applying a given function.
         */

        //Example 7. Everyone gets an extra point.
        System.out.println("Original scores: ");
        scores.stream().forEach(e -> System.out.print(e + " "));
        System.out.println("\nAdding an extra point: ");
        scores.stream().map(e -> e + 1).forEach(e -> System.out.print(e + " "));

        //Exercise 5. Given an array of scores, add one to each element.
        //Notice that we cannot add an extra point to scores > 10

        /**
         * 4.3 Terminal Operations
         * 4.3.1. The collect() function.
         * Accumulates the elements of a stream in a List.
         */

        /*
        System.out.println("\n***Terminal Operations***");
        //Example 8. Returning only odd elements
        List.of(25, 33, 18).stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println(e));

        //Example 9. Using collect() terminal operation
        System.out.println(List.of(25, 33, 18).stream().filter(e -> e % 2 == 1).collect(Collectors.toList()));

         */

        /**
         * 5. Exercises
         * All the following exercises, solve using FP
         * 1. Print the first 10 numbers. Hint: Use the IntStream.range() function
         * 2. Print the first 5 numbers raised by 3
         * 3. Print the first 10 even square numbers
         * 4. Given a list of animals: "Ant", "Bat", "Cat", "Dolphin",
         * print all the elements in lowercase
         * 5. Given the previous list of animals, print the length of each element
         *
         */
        /*
        System.out.println("\n\n***EXERCISES***");
        System.out.println("Exercise 1");

        System.out.println("Exercise 2");

        System.out.println("Exercise 3");


        List<String> animals = List.of("Ant", "Bat", "Cat", "Dolphin");
        System.out.println("Exercise 4");

        System.out.println("Exercise 5");
         */



        /**
         * Funciones que me regresan un flujo (stream)
         * 1. Stream()
         * 2. Filter()
         * 3. Sorted()
         * 4. Distinct()
         * 5. Map()
         *
         * Funciones que nos regresan un elemento
         * 1. Reduce
         * 2. For-each
         */

    }

    private static void printWithFP(List <String> list){
        /**
         * We will see a lambda expression, and we can use the
         * -> operator to make a lambda expression.
         */

        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printWithLoop(List <String> list){
        for(String s: list){
            System.out.println(s);
        }
    }

    private static void printWithFiltering(List <String> list){
        for(String s: list){
            if(s.endsWith("at"))
                System.out.println(s);
        }
    }
    private static void printWithFPFiltering(List <String> list) {

        // [Apple", "Bat", "Cat", "Dog]
        // apple, bat, cat, dog
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));
    }

    private static Integer fpSum(List<Integer> scores) {
        return scores.stream() // Convertimos nuestra lista en un flujo
                .reduce(0, (num1, num2) -> {
                    System.out.println(num1 + " + " +  num2 + " = "  + (num1 + num2)); // 8 + 5 = 13
                    return num1 + num2;
                });
    }



}