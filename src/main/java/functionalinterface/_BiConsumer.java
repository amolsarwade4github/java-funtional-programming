package functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "999999");

        greetCustomer(maria,true);

        greetCustomer(maria,false);

        greetCustomerBiConsumer.accept(maria, true);

        greetCustomerBiConsumer.accept(maria, false);
    }

    private static BiConsumer<Customer, Boolean> greetCustomerBiConsumer =
            (customer, showPhone) ->
                    System.out.println(String.format("Hello %s, thanks for registering phone number %s",
                    customer.name, showPhone? customer.phone: "******"));

    private static void greetCustomer(Customer customer, boolean showPhone) {
        System.out.println(String.format("Hello %s, thanks for registering phone number %s",
                customer.name, showPhone? customer.phone: "******"));
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
