package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> upperCase = name -> name.toUpperCase();

        // If you need some extra logic with your Lambda function then add curly braces
        Function<String, String> upperCase2 = name -> {
            //logic
            if(name.isBlank()) throw new IllegalStateException("Name not provided");
            return name.toUpperCase();
        }; //need semicolon here, after the body of teh lambda

        // If you have more than one argument, it is mandatory to enclose them in parentheses
        BiFunction<String, Integer, String> upperCasePrintAge = (name, age) -> {
            System.out.println(age);
            return name.toUpperCase();
        };

        String upperCasedName = upperCasePrintAge.apply("Alex", 36);
        System.out.println(upperCasedName);
    }
}
