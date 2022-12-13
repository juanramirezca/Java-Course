public class Main {
    public static void main(String[] args) {
        /**
         * 12.1 Strings in Java.
         * In Java there is a class called String, and we can have instances of that class.
         */

        //Example 1. A simple string
        String str1 = "Test";

        /**
         * 12.2 Useful functions
         * There are some useful functions in this String class, that can be helpful
         * to perform some specific tasks.
         *
         * 12.2.1 charAt()
         * This method returns the index of a character within a string.
         */

        //Example2. Using the charAt() method.
        System.out.println("String at index 0 " + str1.charAt(0));
        System.out.println("String at index 3 " + str1.charAt(3));
        //System.out.println("String at index 4 " + str1.charAt(4));

        /**
         * 12.2.2 substring() method
         * Returns a string that is a substring of another string.
         * The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
         * Thus, the length of the substring is endIndex-beginIndex.
         *
         */


        String longString = "This is a long string";
        System.out.println("Substring of " + longString + "using only beginIndex: " + longString.substring(2));
        System.out.println("Substring of " + longString + "using begin and end Index: " + longString.substring(1, 4));

     /**
      * 12.2.3 length() method
      * Returns the number of characters in a string.
      */

     System.out.println("The length of the string " + longString + " is: " + longString.length());


        /*
         * 12.1.4 indexOf()
         * Returns de index of a character within a string
         *
         * str1.indexOf('T');
         * str1.indexOf('i');
         *
         * 12.1.5 contains()
         * This is a method that let us know if a substring is in a string. If it is in the strings returns true, otherwise returns false.
         *
         * str1.contains("Te");
         *
         * 12.1.6 isEmpty()
         * The method returns true if a string is empty, otherwise returns false.
         *
         * int str = "";
         * str1.isEmpty();
         * str.isEmpty();
         *
         *
         * 12.1.7 equals()
         * A method that returns true if two strings are the same, otherwise it returns a false.
         *
         * int newStr = " ";
         *
         * newStr.equals(str);
         *
         * 12.2 Concatenation
         * There are two ways to concatenate strings in Java.
         * One is by using the '+' operator.
         * And the other is with the method concat()
         *
         * Examples:
         * "1" + "2"
         *
         * "2".concat("3")
         *
         * 12.3 More methods.
         * If we would like to see a list of all the methods that the class String have we can use the dot notation follow by the tab button.
         *
         * Example.
         * String st = "";
         * st.<tab>
         *
         * 12.4 Jata String Alternatives
         * There are two classes alternatives to create strings in Java: StringBuffer and StringBuilder. We use them when we want multiple instances of a String.
         *
         * 12.4.1 StringBuffer
         * Another class used in Java to create String. The main difference is that StringBuffer is mutable, while the String class is immutable.
         * We use StringBuffer when we are talking about threading
         *
         * Example
         * StringBuffer sb = new StringBuffer("Test");
         * sb.append(" #2")
         *
         * 12.4.2 StringBuilder
         * Another class used to create instances of a String.
         *
         * StringBuilder sb = new StringBuilder("test1");
         */
    }
}