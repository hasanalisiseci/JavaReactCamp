package Abstracts;

import Entities.GameCustomer;

public interface GameCustomerCheckService {
    boolean checkIfRealPerson(GameCustomer gameCustomer);
}
