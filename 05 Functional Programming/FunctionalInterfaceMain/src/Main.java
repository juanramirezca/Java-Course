import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer>{
    @Override
    public boolean test(Integer number){
        return number % 2 == 0;
    }
}

class PrintingConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer number){
        System.out.println(number);
    }
}

class NumberSquareMapper implements Function<Integer, Integer>{
    @Override
    public Integer apply(Integer number){
        return number * number;
    }
}

public class Main {
    public static void main(String[] args) {

        /**
         * 1. Functional Interface.
         * A Functional Interface is an interface that contains only one abstract method.
         * However, they can include any quantity of default and static methods.
         * The most important functional interfaces are the following:
         *
         * 1.1 Predicate interface.
         * Evaluates this predicate on the given argument.
         * And it only has one method called test that has no definition.
         * Notice we can make an implementation of this test method.
         *
         */

        //Example 1. Printing only the even values.
        List.of(23, 43, 34, 45, 84, 72).stream()
                .filter(n -> n % 2 == 0)
                .forEach(e -> System.out.println(e));

        //Stream<T> filter(Predicate<? super T> predicate);
        //boolean test(T t);

        //Example 2. Using the new EvenNumberPredicate class

        List.of(23, 43, 34, 45, 84, 72).stream()
                .filter(new EvenNumberPredicate())
                .forEach(e -> System.out.println(e));


        /**
         * 1.2 Consumer interface
         * Performs this operation on the given argument.
         */

        // void forEach(Consumer<? super T> action);
        // void accept(T t);

        //Example 3. Printing with the new PrintingConsumer class
        List.of(23, 43, 34, 45, 84, 72).stream()
                .filter(new EvenNumberPredicate())
                .forEach(new PrintingConsumer());

        /**
         * 1.3 Stream interface
         * Returns an IntStream consisting of the results of applying
         * the given function to the elements of this stream.
         */

        //Example 4. Using map method.
        List.of(23, 43, 34, 45, 84, 72).stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(e -> System.out.println(e));

        //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
        // R apply(T t);

        //Example 5. Using the new NumberSquareMapper class
        List.of(23, 43, 34, 45, 84, 72).stream()
                .filter(n -> n % 2 == 0)
                .map(new NumberSquareMapper())
                .forEach(e -> System.out.println(e));
    }

    /**
     * 2. Exercises
     *
     *      1. Using a new class, and considering a list of animals,
     *      print each animal's name in lowercase.
     *      2. Using a new class, and considering a list of positive and negative
     *      numbers, print all element's positive values.
     *      3. Given an array of scores, add one to each element.
     *      Notice that we cannot add an extra point to scores > 10
     *
     */
}