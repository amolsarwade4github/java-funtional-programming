package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        String phone = "07626126124";

        System.out.println(String.format("%s is valid phone: %b", phone, isValidPhone(phone)));

        System.out.println(String.format("%s is valid phone: %b", phone, isValidPhonePredicate.test(phone)));

        //Multiple predicates
        System.out.println(
                String.format("%s is valid phone and contains 3: %b",
                        phone, isValidPhonePredicate.and(containsNumber3Predicate).test(phone)));

        System.out.println(
                String.format("%s is valid phone or contains 3: %b",
                        phone, isValidPhonePredicate.or(containsNumber3Predicate).test(phone)));
    }

    private static Predicate<String> isValidPhonePredicate = phone -> phone.startsWith("07") && phone.length() == 11;

    private static Predicate<String> containsNumber3Predicate = phone -> phone.contains("3");

    private static boolean isValidPhone(String phone) {
        return phone.startsWith("07") && phone.length() == 11;
    }

}
