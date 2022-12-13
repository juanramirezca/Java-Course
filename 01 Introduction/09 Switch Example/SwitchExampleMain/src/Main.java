import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** 9.1 Switch Statement
         * We can use a switch statement when we have multiple if-else nested.
         * It makes much easier to read the code.
         *
         * 9.2 Syntax
         *  The syntax for a switch statement is the following:
         *  switch(variable){
         * 	case 1: statement(s); break;
         * 	case 2: statement(s); break;
         * 	case n: statement(s); break;
         * 	default: statement(s); break;
         * }
         */

        // Example 1. Switch example

        /*
        int option = -1;
        switch (option){
            case 1:
                System.out.println("You chose option #" + option);
                break;
            case 2:
                System.out.println("You chose option #" + option);
                break;
            case 3:
                System.out.println("You chose option #" + option);
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }

         */

        /** 9.3 Break statement
         * The break statement help us to exit a selected option in a switch statement.
         * In case we do not use a break statement, it will fall through the following condition.
         *
         */

        /*
        //Example 2. Use of a break
        int option;
        option = 1;
        switch (option){
            case 1:
                System.out.println("You chose option #" + option);
            case 2:
                System.out.println("You chose option #" + option);
            case 3:
                System.out.println("You chose option #" + option);
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }

         */


        /**
         * 9.4 Using multiple cases
         * We can use what we have learned about the break statement to consider more than one option
         * for a case, and perform the same statement for these cases.
         */

        //Example 3. Enhancing the previous block of code
        int option;
        option = -1;
        switch (option){
            case 1:
            case 2:
            case 3:
                System.out.println("You chose option #" + option);
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }

        int age = -1;

        switch (age){
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("You are a teenager");
                break;
            default:
                System.out.println("You are a NOT a teenager");

        }

        String clima = "nevando";

        switch (clima){
            case "soleado":
                System.out.println("Usa bloqueador");
                break;
            case "nublado":
                System.out.println("Carga un paraguas");
                break;
            default:
                System.out.println("No es un clima valido");
        }




        /** 9.5 Exercises
         * 1. Given a student's score, retrieve him a feedback.
         * For instance.
         * 0 - 5. Study harder next time.
         * 6. Approved.
         * 7. Regular.
         * 8. Good.
         * 9. Very good.
         * 10. Excellent
         *
         *
         *
         * 2. Make a menu using a switch statement.
         *          Option 1. Make a conversion from USD to MXN
         *          Option 2. Make a conversion from MXN to USD
         *          Option 3. Show menu again.
         *          Option 4. Exit
         *
         */
    }
}