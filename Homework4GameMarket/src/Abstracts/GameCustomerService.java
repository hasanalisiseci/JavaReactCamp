package Abstracts;

import Entities.GameCustomer;

public interface GameCustomerService {
    void addCustomer(GameCustomer gameCustomer);
    void updateCustomer(GameCustomer gameCustomer);
    void deleteCustomer(GameCustomer gameCustomer);
}
