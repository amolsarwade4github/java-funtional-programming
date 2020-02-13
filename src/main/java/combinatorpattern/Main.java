package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0843523234234",
                LocalDate.of(1991, 8, 20));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        boolean valid = validatorService.isValid(customer);
        System.out.println(valid);
    }
}
