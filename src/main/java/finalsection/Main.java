package finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        System.out.println("With the last name:");
        hello("Eria Othieno", "Pinyi", value -> {
            System.out.println("No last name provided");
        });

        System.out.println("Without the last name:");
        hello("Eria Othieno", null, value -> {
            System.out.println("No last name provided");
        });

        //Using the Runnable
        System.out.println("Using Runnable");
        hello2(
                "James",
                null,
                () -> System.out.println("No last name provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }else{
            callback.accept(firstName);
        }
    }

    // Alternatively if you do not wish to take in a default value for your callback
    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }else{
            callback.run();
        }
    }

    // Borrowing from JavaScript
//    function hello(firstName, lastName, callback) {
//        console.log(firstName)
//        if(lastName){
//            console.log(lastName)
//        }else{
//            callback()
//        }
//    }
}
