package combinatorpattern;

import java.time.LocalDate;
import  static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alica@gmail.com",
                "07589802679",
                LocalDate.of(1988,7,7)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        // Using the combinator pattern: this provides a flexible approach to add and remove validators
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);
        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
