package functionalinterface;

import java.util.function.BiPredicate;

public class _BiPredicate {

    public static void main(String[] args) {
        System.out.println(isValidPhoneAndContains("07000000033", "3"));

        System.out.println(isValidPhoneAndContainsPredicate.test("07000000033", "3"));
    }

    private static BiPredicate<String, String> isValidPhoneAndContainsPredicate =
            (phone, containsNumber)
                    -> phone.startsWith("07") &&
                       phone.length() == 11 &&
                       phone.contains(containsNumber);

    private static Boolean isValidPhoneAndContains(String phone, String containsNumber) {
        return phone.startsWith("07") && phone.length() == 11 && phone.contains(containsNumber);
    }
}
