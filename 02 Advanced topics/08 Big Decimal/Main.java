import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /**
         * 08 Big Decimal
         * If we want to maintain the precision of values, we must use a Big Decimal value.
         * To work with a big decimal, we have first to create a String object
         */

        //Example 1. Working with non-precise double values
        double firstDouble = 0.012;
        double sumOfValues = firstDouble + firstDouble + firstDouble;

        System.out.println("Double value:  " + sumOfValues);

        //Example 2. Creating a Big Decimal value
        String stringValue = "0.012";
        BigDecimal bigValue = new BigDecimal(stringValue);
        BigDecimal sumOfBigDecimals = bigValue.add(bigValue).add(bigValue);
        System.out.println("Big Decimal value: " + sumOfBigDecimals);
    }

}
