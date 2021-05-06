package Interfaces;

public class CustomerManager {
    private final Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        super();
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.printf("Müşteri eklendi: %s %s\n", customer.getFirstName(), customer.getLastName());
        Utils.runLoggers(loggers, customer.getFirstName()+customer.getLastName()+"#"+customer.getId());
    }

    public void delete(Customer customer) {
        System.out.printf("Müşteri silindi: %s %s", customer.getFirstName(), customer.getLastName());
        Utils.runLoggers(loggers, customer.getFirstName()+customer.getLastName()+"#"+customer.getId());
    }
}
