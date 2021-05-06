package Interfaces;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[]args) {
        Customer customer = new Customer(1354,"Hasan","Ali");
        Logger[] loggers = {new EmailLogger(), new FileLogger(), new DatabaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        customerManager.add(customer);
    }
}
