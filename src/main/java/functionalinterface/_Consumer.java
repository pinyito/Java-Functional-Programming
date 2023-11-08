package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
       Customer customer = new Customer("Maria", "6412332403");
        // Normal Java function: consumer
        greetCustomer(customer);

        // Functional interface: Consumer
        greetCustomerConsumer.accept(customer);

    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(String.format("Hello %s thanks for registering phone number %s", customer.customerName, customer.customerPhoneNumber));

    static void greetCustomer(Customer customer){
        System.out.println(String.format("Hello %s thanks for registering phone number %s", customer.customerName, customer.customerPhoneNumber));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
