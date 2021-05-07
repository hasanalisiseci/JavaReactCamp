package Concretes;

import Abstracts.GameCustomerCheckService;
import Entities.GameCustomer;

public class GameCustomerCheckManager implements GameCustomerCheckService {
    @Override
    public boolean checkIfRealPerson(GameCustomer gameCustomer) {
        return gameCustomer.getNationalityId().length() == 11;
    }
}
