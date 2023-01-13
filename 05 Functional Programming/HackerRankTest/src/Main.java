import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Currency;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        String currency;

        // Reading currency from user
        /**
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Give me a currency: ");
         * currency = sc.next();
         * currency = currency.toUpperCase();
         */


        //Avoiding user mistakes



        //Webscrapping the exchange rate
        URL url = new URL("https://www.banamex.com/economia-finanzas/es/mercado-de-divisas/index.html");

        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line = null;

            // read each line and write to System.out
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

        //Doing a simple conversion.
        //simpleConversion(sc, currency);



    }

    public static void simpleConversion(Scanner sc, String currency){
        Double amount, exchangeRate;
        // We are trying to see if the given currency is in the Set
        if(Currency.getAvailableCurrencies().contains(Currency.getInstance(currency))){
            System.out.println("Let's go. Currency Available.");
            if(currency.equals("MXN")){
                System.out.println("Give me an amount?");
                amount = sc.nextDouble();
                System.out.println("What's today exchange rate?");
                exchangeRate = sc.nextDouble();
                System.out.println("You gave me" + amount + " " + currency + "and today the exchange rate is " +
                        exchangeRate + " and you will receive" +
                        String.format("%.2f", amount/exchangeRate));
            }

        } else {
            System.out.println("That's a shame. Currency not available.");
        }
    }
}