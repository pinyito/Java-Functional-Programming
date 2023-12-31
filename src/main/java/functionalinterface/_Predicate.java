package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("070000000"));
        System.out.println(isPhoneNumberValid("04560031578"));

        // Predicate
        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("04560031578"));

        //Chaining Predicates
        System.out.println("With chained predicates");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000030000"));
        // We can also use OR if we only need one condition to be true
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
    static boolean isPhoneNumberValid(String phoneNumber){
        // Not real validation
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
