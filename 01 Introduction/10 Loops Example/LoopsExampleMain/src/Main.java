import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
         * Usage: When we have a *fixed* amount of times
         *
         * 10.2.1 The syntax of a for loop
         * The syntax in For statement is the following
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
        for(int i = 100; i > 0; i--){
            System.out.println(i);
            System.out.println(i);
        }
         */

        /**
         * 10.3 For-each statement
         * Similarly to the for loop, we can use a for-each loop to iterate
         * over elements on a sequence or list.
         * Usage: To iterate over elements in a list or sequence.
         *
         * 10.3.1 The syntax of a for-each loop
         * The syntax to use a for-each loop is the following:
         * for(iterator_variable : sequence){
         * 	statement(s)
         * }
         *
         * Notice: In the for-each loop, we are iterating over *elements* rather than indices.
         */


        //Example 4. Print the total goals that your favorite soccer team scored
        int[] totalGoals = {43, 71, 28, 55, 51, 89, 55, 29};

        /*
        for(int goal: totalGoals){
            System.out.println(goal);
        }



        for(int ind = 0; ind < totalGoals.length; ind++){
            System.out.println(totalGoals[ind]);
        }



        //Exercise 2. Given the previous array, print the index followed by the amount
        // 0, 43, 1, 71, 2, 28, ..., 7, 29
        // 0 - 43
        // 1 - 71

        // 7 - 29

        for(int ind = 0; ind < totalGoals.length; ind++){
            System.out.println(ind + " - " + totalGoals[ind]);
        }

         */


        /**
         * 10.4 The While statement
         * Another kind of loop that is similar to the for loop.
         * Usage: When we don't know when the loop will end.
         *
         * 10.4.1. The syntax of a while loop
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



        //Example 6. When user selects option 4
        int option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an option between 1 and 4");
        option = scanner.nextInt();

        while(option != 4){
            System.out.println("You chose option #" + option);
            System.out.println("Give me an option between 1 and 4");
            option = scanner.nextInt();
        }



        //Exercise 3. Asking the user for their age

        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age?: ");
        age = scanner.nextInt();

        while(age <= 18){
            System.out.println("Your age is " + age);
            System.out.println("Age?: ");
            age = scanner.nextInt();
        }

         */

        /**
         * 10.5 Do-while statement
         * Similar to the While statement, but the main difference between a While and
         * the Do-while is that the core in the Do-while is executed at least *once*.
         * Usage: For validation.
         *
         * 10.5.1. The syntax of a Do-While
         * do {
         * 	statement(s)
         * 	update of variable that meets condition
         * } while(condition);
         */

        //Example 7. Printing at least one time

        /*
        int j = 6;

        do {
            System.out.println("The value of j is: " + j);
            j++;
        } while(j < 6);

        int i = 6;
        while(i < 6){
            System.out.println("The value of i is: " + i);
            i++;
        }

        /**
         * For. Cuando tenemos una cantidad fija de elementos. Imprimir los primeros 10 numeros
         * For-each. Cuando tenemos una lista o secuencia. Imprimir elementos de mi lista.
         * While. Cuando no sabemos cuando va a terminar nuestro programa. Juego.
         * Do-while. Validacion. Preguntar al usuario por su password.
         */



        //Example 8. Validation
        /*
        int nip = 21;

        do{
            System.out.println(nip);
            nip++;
        } while(nip != 28);

         */

        //Exercise 4. Ask the user for a nip and give them only three opportunities. (9871)

        int nip, opp;
        opp = 3;
        Scanner scanner = new Scanner(System.in);
        /*
        do {
            System.out.println("Digita tu nip");
            nip = scanner.nextInt();
            opp--;
            System.out.println("Te quedan " + opp + " oportunidades");
        }while(opp > 0 && nip != 9871);

        //Cuando el while es True continua con las siguientes lineas



        System.out.println("Digita tu nip");
        nip = scanner.nextInt();

        while(opp > 0 && nip != 9871){
            opp--;
            System.out.println("Te quedan " + opp + " oportunidades");
            System.out.println("Digita tu nip");
            nip = scanner.nextInt();
            //Entra siempre que se cumpla la condicion
        }

        if(nip == 9871){
            System.out.println("Bienvenido a tu Banco");
        } else{
            System.out.println("Cuenta bloqueada. Intenta más tarde");
        }


        for(int i = 1; i <= 10; i++){
            if(i == 5) break;
            System.out.println(i + " ");
        }



        int calificacion;
        calificacion = scanner.nextInt();

        while(true){
            if(calificacion < 0 || calificacion > 10) continue;
            System.out.println("Calificacion: " + calificacion);
            calificacion = scanner.nextInt();
        }

        for (int i = 0; i < 5; i ++){
            for(int j = 5; j < 10; j++){
                if(j == 7) break;
                System.out.println(i + ", " + j);
            }
        }
        */
         for(int i = 1; i <= 20; i += 2){
             System.out.println(i + " ");
         }

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

         a) A game that ask the user for a number and the game only responds whether you are right or not.
         b) Give some hints to the user, so he can determine if the given number is greater or less than the number to guess.
         c) Set the number to guess as a random number.
         d) Give only 6 chances to the user to guess the number.
         e) Si pierde, decirle cual era el numero que tenia que adivinar
         */
    }
}