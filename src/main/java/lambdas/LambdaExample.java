package lambdas;

import java.util.function.Function;

public class LambdaExample {

    public static void main(String[] args) {

        Function<String, String> upperCase = name -> name.toUpperCase();

//        Function<String, String> upperCaseVariation1 = name -> {
//            //logic
//            if (name.isEmpty()) throw new IllegalArgumentException("Invalid argument");
//            return name.toUpperCase();
//        };
//
//        Function<String, String> upperCaseVariation2 = String::toUpperCase;

        String upperCaseName = upperCase.apply("Alex");

        System.out.println(upperCaseName);
    }
}
