package functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {

    public static void main(String[] args) {

        int number1 = incrementByOneAndMultiply(4, 100);

        System.out.println(number1);

        Integer number2 = incrementByOneAndMultiplyBiFunction.apply(4, 100);

        System.out.println(number2);

    }

    private static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    private static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
