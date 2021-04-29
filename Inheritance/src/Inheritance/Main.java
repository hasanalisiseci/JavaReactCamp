package Inheritance;

public class Main {
    public static void main (String [] args) {
        IndividualCustomer hasanali = new IndividualCustomer();
        hasanali.customerNumber = "12345";

        CorporateCustomer trendyol = new CorporateCustomer();
        trendyol.customerNumber = "78910";

        UnionCustomer unionCustomer = new UnionCustomer();
        unionCustomer.customerNumber = "9999";

        CustomerManager customerManager = new CustomerManager();
        Customer[] customers = {hasanali,trendyol,unionCustomer};
        customerManager.addMultiple(customers);
    }
}
