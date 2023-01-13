import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 10.1 Loops in Java
         * Loops are used when we have repetitive tasks to be performed.
         * In Java, there are four kind of loops that we can use:
         * 1. For statement.
         * 2. For-each statement.
         * 3. While.
         * 4. Do While.
         *
         * 10.2 For statement
         * The first loop that we will see, and it is used to perform repetitive tasks.
         * Usage: When we have a *fixed* amount of times.
         *
         * 10.2.1 Syntax For statement
         * The syntax in For statement is the following:
         *
         * for(initialization; condition; update){
         *      statement(s);
         * }
         *
         */

        /*
        //Example 1. Print the first ten natural numbers
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //Example 2. Print the first numbers with a step
        for(int i = 5; i <= 20; i += ){
            System.out.println(i);
        }

        //Example 3. Using a decrement in the update
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        //Exercise 1. Print the first 100 first numbers backwards (100, 99, 98, ..., 1)

        */

        /**
         * 10.3 For-each statement
         * Similarly to the for loop, we can use a for-each loop to iterate
         * over elements on a sequence or list.
         * Usage: To iterate over elements in a list or sequence.
         *
         * 10.3.1 Syntax For-each statement
         * The syntax to use a for-each loop is the following:
         *
         * for(variable iterator : sequence){
         * 	statement(s)
         * }
         *
         * Notice: In the for-each loop, we are iterating over *elements* rather than indices.
         */

        /*
        //Example 4. Print the total goals that your favorite soccer team scored

        int[] totalGoals = {43, 71, 28, 55, 51, 89, 55, 29};

        for(int goal: totalGoals){
            System.out.println(goal);
        }

        /*
        Exercise 2. Given the previous array, print the index of the array followed by value of that index
        Example:
        0 - 43
        1 - 71
        ...
        7 - 29
        */

        /**
         * 10.4 The While statement
         * Another kind of loop that is similar to the for loop.
         * Usage: When we do not know exactly when the loop will end.
         *
         * 10.4.1. Syntax While statement
         *
         * variable to be evaluated in condition.
         * while(condition){
         * 	statement(s)
         * 	update of variable that meets condition
         * }
         */

        //Example 5. Using a while as a for loop
        /*
        int i = 1;

        while (i <= 10){
            System.out.println(i);
            i++;
        }



        //Example 6. Selecting an option of a menu
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me an option between 1 and 4");
        option = sc.nextInt();

        while(option != 4){
            System.out.println("You chose option #" + option);
            System.out.println("Give me an option between 1 and 4");
            option = sc.nextInt();
        }



        //Exercise 3. Asking the user for scores until a non-valid answer is given

         */

        /**
         * 10.5 Do-while statement
         * Similar to the While statement, but the main difference between a While and
         * the Do-while is that the core in the Do-while is executed at least *once*,
         * even if the condition is false.
         * Usage: For validation.
         *
         * 10.5.1. Syntax Do-While statement
         * do {
         * 	statement(s)
         * 	update of variable that meets condition
         * } while(condition);
         */

        //Example 7. Printing at least one time

        /*
        System.out.println("Evaluating Do-While statement");
        int j = 6;

        do {
            System.out.println("The value of j is: " + j);
            j++;
        } while(j < 6);


        System.out.println("Evaluating While statement");
        int i = 6;
        while(i < 6){
            System.out.println("The value of i is: " + i);
            i++;
        }
        */

        //Example 8. A password validation example

        String my_pass = "myPassword8";
        String user_pass;

        do{
            System.out.println("Password: ");
            user_pass = sc.next();
        } while(!my_pass.equals(user_pass));

        //Exercise 4. Ask the user for a nip and give him only three opportunities.


        /**
         * 10.6 Infinite Loops
         * When we are using any kind of loop, we need to update the variable
         * that is tested in the condition. Otherwise, we will have an infinite loop.
         */

        /*
        //Example 9. Infinite loop using a while statement
        int n = 0;
        while(n < 10){
            System.out.println(n);
        }
        */

        //Exercise 5. Modify the following code to make it work

        int grade;
        System.out.println("Give me your final grade");
        grade = sc.nextInt();

        while(grade > 0 || grade < 10){
            System.out.println("Your final score is " + grade);
        }

        /**
         * 10.7 Break and continue
         * There is a keyword in Java called break, that help us to go out
         * completely from a loop.
         * Also, the keyword continue is present in Java, and let us continue
         * with the next value of the loop.
         */

        //Example 10. Printing only half of loop

        for(int i = 1; i <= 10; i++){
            if(i == 5) break;
            System.out.println(i + " ");
        }

        //Example 11. Printing valid scores only
        int calificacion;
        calificacion = sc.nextInt();

        while(true){
            if(calificacion < 0 || calificacion > 10) continue;
            System.out.println("Calificacion: " + calificacion);
            calificacion = sc.nextInt();
        }


        /**
         * 10.8 Nested loops
         * Let us see an example that will help us understand the importance of
         * a nested loop.
         */










        /**
         * 2 x 1 = 2
         * 2 x 2 = 4
         * 2 x 3 = 6
         * ...
         * 2 x 12 = 24
         *
         * ...
         * ...
         *
         * 12 x 1 = 2
         * 12 x 2 = 24
         * ...
         * 12 x 12 = 144
         */






        /**
        Exercises.
         1. Print numbers from 1 to 10.

         2. Print numbers form 10 to 1.

         3. Print the first ten odd numbers.

         4. Print the multiplication table with 7.

         5. Given the following numbers, print if the number is even or odd: 8, 7, 5, 1, 3, 4.

         6. Given the following scores, print their average: 8.3, 7.9, 5.7, 10, 9.1.

         7. Determine the divisors of a number.

         8. Determine if a number is prime.

         9. Given two sorted arrays, find the elements of the intersection between them.
         *Example 1:*
         $ a = [1, 2, 2, 4, 5],  b = [0, 2, 2, 4, 4, 4, 6, 9]$
         **The intersection is $[2, 4]$**
         * [2, 2, 4, 4, 4]
         * [2, 4]

         *Example 2:*
         $ a = [4, 6, 8], b = [5, 7, 9]$
         **The intersection is $[]$**

         10. Make a "game" that determines if a user has guessed a number between 1 and 100.
         For this exercise we will follow the next steps:

         1. The game should ask the gamer for a number and only respond whether he/she is right or not.
         2. Some hints should be given to the user, so the gamer can determine if the given number is greater or less than the number to guess.
         3. The number to guess should be a random number.
         4. Give only 6 chances to the user to guess the number.
         5. The user should be informed if he lost and what was the correct number.
         */


        /**
         * EXTRA EXERCISES.
         * 1. Print the following pyramids
         * ****
         * ***
         * **
         * *
         *
         * 2.
         * *
         * **
         * ***
         * ****
         *
         * 3.
         *      *
         *     **
         *    ***
         *   ****
         *
         *   4.
         *   ****
         *    ***
         *     **
         *      *
         */
    }
}