package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "0843523234234",
                LocalDate.of(1991, 8, 20));

        //CustomerValidatorService validatorService = new CustomerValidatorService();
        //boolean valid = validatorService.isValid(customer);
        //System.out.println(valid);

        //Using combinator patter
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

        //customerRegistrationValidator is lazy nothing executes
        CustomerRegistrationValidator customerRegistrationValidator = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult());
    }
}
