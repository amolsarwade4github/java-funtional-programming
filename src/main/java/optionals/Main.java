package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Object value = Optional.ofNullable("Maria")
                .orElseGet(() -> "Default value");
        System.out.println(value);

        Object value1 = Optional.ofNullable(null)
                .orElseGet(() -> "Default value");
        System.out.println(value1);

        Object value2 = Optional.ofNullable(null)
                .orElse("Default value");
        System.out.println(value2);

        Optional.ofNullable("Alex")
                .ifPresent(name -> System.out.println(name));

        Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalArgumentException("Empty name not allowed."));
    }
}
