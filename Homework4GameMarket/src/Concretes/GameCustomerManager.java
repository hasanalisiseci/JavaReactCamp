package Concretes;

import Abstracts.BaseGameCustomerManager;
import Abstracts.GameCustomerCheckService;
import Entities.GameCustomer;

public class GameCustomerManager extends BaseGameCustomerManager {

    GameCustomerCheckService gameCustomerCheckService;

    public GameCustomerManager(GameCustomerCheckService gameCustomerCheckService) {
        this.gameCustomerCheckService = gameCustomerCheckService;
    }

    @Override
    public void addCustomer(GameCustomer gameCustomer) {
        if (gameCustomerCheckService.checkIfRealPerson(gameCustomer)) {
            super.addCustomer(gameCustomer);
        } else {
            System.out.println("Kimliğiniz e-devlet tarafından doğrulanamadı");
        }
    }
}
