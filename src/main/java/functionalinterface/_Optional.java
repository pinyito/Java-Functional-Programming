package functionalinterface;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional.ofNullable("elifancio@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email")
                );
    }
}
