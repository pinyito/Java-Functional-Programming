package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
       Customer customer = new Customer("Maria", "6412332403");
        // Normal Java function: consumer
        greetCustomer(customer);
        greetCustomerV2(customer, false);

        // Functional interface: Consumer
        greetCustomerConsumer.accept(customer);
        greetCustomerBiConsumer.accept(customer, false);

    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(String.format("Hello %s thanks for registering phone number %s", customer.customerName, customer.customerPhoneNumber));
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> System.out.println(String.format("Hello %s thanks for registering phone number %s", customer.customerName, (showPhoneNumber? customer.customerPhoneNumber:"**********")));

    static void greetCustomer(Customer customer){
        System.out.println(String.format("Hello %s thanks for registering phone number %s", customer.customerName, customer.customerPhoneNumber));
    }
    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber){
        System.out.println(String.format("Hello %s thanks for registering phone number %s", customer.customerName, (showPhoneNumber? customer.customerPhoneNumber:"**********")));
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
