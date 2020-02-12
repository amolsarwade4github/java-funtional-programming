package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int number = incrementByOne(1);

        System.out.println(number);

        int number2 = incrementByOneFunction.apply(1);

        System.out.println(number2);

        int number3 = multiplyBy10Function.apply(number2);

        System.out.println(number3);

        Integer number4 = addBy1AndThenMultiplyBy10.apply(1);

        System.out.println(number4);

    }

    private static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    private static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    private static Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

    private static int incrementByOne(int number) {
        return number + 1;
    }

}
