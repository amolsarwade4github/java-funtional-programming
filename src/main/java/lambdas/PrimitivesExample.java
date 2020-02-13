package lambdas;

import java.util.function.Function;

public class PrimitivesExample {

    public static void main(String[] args) {

        //Primitives are not allowed in functional interfaces
        //Function<int, int> incrementByOne = number -> number + 1;

        Function<Integer, Integer> incrementByOne = number -> number + 1;

        Integer number = incrementByOne.apply(10);
        System.out.println(number);

    }
}
