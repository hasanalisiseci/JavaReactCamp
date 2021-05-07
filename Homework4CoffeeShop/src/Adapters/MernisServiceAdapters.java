package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapters implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return customer.getNationalityId().length() == 11;
    }
}
