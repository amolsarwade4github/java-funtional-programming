package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "999999");

        greetCustomer(maria);

        greetCustomerConsumer.accept(maria);

    }

    private static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(String.format("Hello %s, thanks for registering phone number %s", customer.name, customer.phone));

    private static void greetCustomer(Customer customer) {
        System.out.println(String.format("Hello %s, thanks for registering phone number %s", customer.name, customer.phone));
    }

    static class Customer {
        private final String name;
        private final String phone;

        Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
