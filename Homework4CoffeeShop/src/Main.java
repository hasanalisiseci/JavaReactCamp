import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String [] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapters());
        customerManager.save(new Customer(1354,"Hasan Ali","Şişeci", new Date(2000, Calendar.SEPTEMBER,16),"10019469538"));


    }
}
