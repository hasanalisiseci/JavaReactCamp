package Abstracts;

import Entities.GameCustomer;

public class BaseGameCustomerManager implements GameCustomerService{
    @Override
    public void addCustomer(GameCustomer gameCustomer) {
        System.out.println(gameCustomer.getUserName() + " kullanıcı adı ile yeni bir kullanıcı oluşturulmuştur. Bakiyeniz: " + gameCustomer.getWallet()+ "₺");
    }

    @Override
    public void updateCustomer(GameCustomer gameCustomer) {
        System.out.println(gameCustomer.getUserName() + " kullanıcı adının bilgileri güncellenmiştir.Bakiyeniz: " + gameCustomer.getWallet()+ "₺");
    }

    @Override
    public void deleteCustomer(GameCustomer gameCustomer) {
        System.out.println(gameCustomer.getUserName() + " kullanıcı adlı hesap silinmiştir.");
    }
}
