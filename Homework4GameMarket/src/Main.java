import Concretes.CampaignManager;
import Concretes.GameCustomerCheckManager;
import Concretes.GameCustomerManager;
import Concretes.GameMarketManager;
import Entities.Campaign;
import Entities.Game;
import Entities.GameCustomer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args) {

        List<Game> gamesList1 = new ArrayList<Game>();
        GameCustomer customer1 = new GameCustomer(1354,"Hasan Ali","Şişeci","battleedebiyati",
                "16.09.2000", "12312312312",gamesList1,100);

        Game csgo = new Game(1,"Counter Strike Global Offensive",30,29.90);
        Game gta5 = new Game(2,"Grand Theft Auto 5",120,99.90);
        Game valo = new Game(3,"Valorant",40,0);
        Game pes21 = new Game(4,"Pro Evolution Soccer 2021", 60, 120.0);

        Campaign campaign1 = new Campaign(1,"Açılış İndirimi", 30);
        Campaign campaign2 = new Campaign(2, "Karne İndirimi", 40);

        GameCustomerManager gameCustomerManager = new GameCustomerManager(new GameCustomerCheckManager());
        GameMarketManager gameMarketManager = new GameMarketManager();
        CampaignManager campaignManager = new CampaignManager();


        gameCustomerManager.addCustomer(customer1);
        gameMarketManager.buyGame(csgo, customer1);
        gameMarketManager.buyGame(gta5,customer1);
        gameMarketManager.giveBackGame(valo,customer1);
        customer1.setWallet(customer1.getWallet() + 50);
        gameMarketManager.buyGame(gta5,customer1);

        campaignManager.addCampaign(valo,campaign1);
        campaignManager.addCampaign(csgo, campaign1);
        campaignManager.updateCampaign(csgo, campaign2);
        campaignManager.deleteCampaign(csgo);
        campaignManager.deleteCampaign(pes21);


    }
}
