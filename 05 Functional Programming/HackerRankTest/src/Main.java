import java.util.List;
import java.util.Currency;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String currency;
        Double amount, exchangeRate;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a currency: \n");
        currency = sc.next();

        //Sending all to upperCase
        currency = currency.toUpperCase();


        // We are trying to see if the given currency is in the Set
        if(Currency.getAvailableCurrencies().contains(Currency.getInstance(currency))){
            System.out.println("Let's go. Currency Available.");
            if(currency.equals("MXN")){
                System.out.println("Give me an amount?\n");
                amount = sc.nextDouble();
                System.out.println("What's today exchange rate?\n");
                exchangeRate = sc.nextDouble();
            }

        } else {
            System.out.println("That's a shame. Currency not available.");
        }



    }
}