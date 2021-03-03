package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "1234567890");
        greetCustomer(maria);
        greetCustomerConsumer.accept(maria);


        greetCustomerConsumerV2.accept(maria,true);

        greetCustomerConsumerV2.accept(maria,false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, isAllowedToShowNumber) -> System.out.println("Hello " + customer.customerName +
            ", thank you for registering your number "
            + ( isAllowedToShowNumber ? customer.customerPhoneNumber: "#########"));

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName +
            ", thank you for registering your number "
            + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thank you for registering your number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
