import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {

        //Introducing the Currency class
        //System.out.println(Currency.getAvailableCurrencies());



        /**
         * 1. A simple conversion. Using an amount, and an exchange rate fixed,
         * We are making a conversion from dollars to mexican pesos.
         */
        /*
        double amount, exchange_rate;
        amount = 178;
        exchange_rate = 19.13;

        System.out.println("You gave me " + amount + " USD and that would be " + amount * exchange_rate + " MXN");
        */

        /**
         * 2. A double-way conversion.
         * We are having now the possibility to convert from mexican pesos to dollars or vice versa.
         */

        /*
        String moneda = "mxn";

        if(moneda == "mxn")
            System.out.println("You gave me " + amount + " USD and that would be " + amount / exchange_rate + " MXN");
        else if(moneda == "usd")
            System.out.println("You gave me " + amount + " USD and that would be " + amount * exchange_rate + " MXN");
        else
            System.out.println("That's not a valid currency!");
        */


        /**
         * 3. Asking the user for information
         * Instead of having the amount, the exchange rate, and the currency fixed,
         * we can now ask the user for this information.
         */

     /*
        Scanner sc = new Scanner(System.in);
        String currency;
        Double amount, exchange_rate;

        System.out.println("What currency do you want to change from?");
        currency = sc.nextLine();
        System.out.println("How much do you want to change?");
        amount = sc.nextDouble();
        System.out.println("What's today exchange rate for " + currency);
        exchange_rate = sc.nextDouble();


        if(currency == "mxn")
            System.out.println("You gave me " + amount + " USD and that would be " + amount / exchange_rate + " MXN");
        else if(currency == "usd")
            System.out.println("You gave me " + amount + " USD and that would be " + amount * exchange_rate + " MXN");
        else
            System.out.println("That's not a valid currency!");

*/

        /**
         * 4. Making multiple conversions.
         * We can now ask the user for multiple conversions, and not just one.
         */

        /*
        Scanner sc = new Scanner(System.in);
        String currency;
        int total_conversions;
        Double amount, exchange_rate;

        System.out.println("How many conversions do you want to do today");
        total_conversions = sc.nextInt();

        for (int i = 0; i < total_conversions; i++) {
            System.out.println("What currency do you want to change from?");
            currency = sc.nextLine();
            System.out.println("How much do you want to change?");
            amount = sc.nextDouble();
            System.out.println("What's today exchange rate for " + currency);
            exchange_rate = sc.nextDouble();


            if(currency == "mxn")
                System.out.println("You gave me " + amount + " USD and that would be " + amount / exchange_rate + " MXN");
            else if(currency == "usd")
                System.out.println("You gave me " + amount + " USD and that would be " + amount * exchange_rate + " MXN");
            else
                System.out.println("That's not a valid currency!");
        }
        */


        /**
         * 5. Making the program error-free.
         * We can use validation to prevent the user from making mistakes.
         * For instance, the amount and exchange rate cannot be negative or zero.
         */

        //llamo a la funcion 1
        // llamo a la funcion 2
        // ...
/*

        //Inicializacion de variables
        Scanner sc = new Scanner(System.in);
        String currency;
        int total_conversions;
        Double amount, exchange_rate;

        // Pedir total de conversiones
        System.out.println("How many conversions do you want to do today");
        total_conversions = sc.nextInt();

        // Validacion de conversiones
        while(total_conversions < 1){
            System.out.println("Thats not a valid option");
            System.out.println("How many conversions do you want to do today");
            total_conversions = sc.nextInt();
        }


        // Realizar n cantidad de conversiones
        for (int i = 0; i < total_conversions; i++) {

            //Pedir la divisa
            System.out.println("What currency do you want to change from?");
            currency = sc.nextLine();

            //Validacion de cantidad
            while(true){
                System.out.println("How much do you want to change?");
                amount = sc.nextDouble();
                if(amount < 1){
                    System.out.println("Not a valid option. Please give me a positive number");
                } else {
                    break;
                }
            }

            //Pedir el exchange rate
            System.out.println("What's today exchange rate for " + currency);
            exchange_rate = sc.nextDouble();


            //Conversion
            if(currency == "mxn")
                System.out.println("You gave me " + amount + " USD and that would be " + amount / exchange_rate + " MXN");
            else if(currency == "usd")
                System.out.println("You gave me " + amount + " USD and that would be " + amount * exchange_rate + " MXN");
            else
                System.out.println("That's not a valid currency!");
        }

*/


        /**
         * 6. Modularize the program.
         * We can use methods or functions, to modularize the different features in our project.
         */



    }
}