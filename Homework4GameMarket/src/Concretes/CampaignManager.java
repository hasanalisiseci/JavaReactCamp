package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {
    @Override
    public void addCampaign(Game game, Campaign campaign) {
        if (game.getPrice() == 0) {
            System.out.printf("İndirim uygulamaya çalıştığınız ürün (%s) zaten ücretsiz! İşleminiz geçersiz!\n", game.getGameName());
        } else {
            game.setPercentageOfDiscount(campaign.getPercentageOfDiscount());
            double newPrice = game.getPrice() * (100 - campaign.getPercentageOfDiscount()) / 100;
            game.setPrice(newPrice);
            System.out.printf("\"%s\" kampanyası ile %s oyununun %%%s indirimli yeni fiyatı %s₺'dir.\n",campaign.getName(), game.getGameName(), game.getPercentageOfDiscount(), newPrice);
        }
          }

    @Override
    public void updateCampaign(Game game, Campaign campaign) {
        if (game.getPrice() == 0) {
            System.out.printf("İndirim uygulamaya çalıştığınız ürün (%s) zaten ücretsiz! İşleminiz geçersiz!\n", game.getGameName());
        } else {
            double firstPrice = (100 * game.getPrice()) / (100 - game.getPercentageOfDiscount());
            double newPrice = firstPrice * (100 - campaign.getPercentageOfDiscount()) / 100;
            game.setPrice(newPrice);
            game.setPercentageOfDiscount(campaign.getPercentageOfDiscount());
            System.out.printf("\"%s\" kampanyası ile %s oyununun yeni indirim oranı olan %%%s indirimli yeni fiyatı %s₺'dir.\n",campaign.getName(), game.getGameName(), game.getPercentageOfDiscount(), newPrice);
        }
    }

    @Override
    public void deleteCampaign(Game game) {
        if (game.getPercentageOfDiscount() == 0) {
            System.out.printf("%s oyununda herhangi bir indirim bulunmamaktadır. Bu yüzden işleminiz geçersizdir!\n", game.getGameName());
        } else {
            double oldPrice = (100 * game.getPrice()) / (100 - game.getPercentageOfDiscount());
            System.out.printf("%s oyunundaki %%%s kampanyası kaldırılmıştır. Yeni fiyatı %s ₺'dir.\n", game.getGameName(), game.getPercentageOfDiscount(), oldPrice);
            game.setPrice(oldPrice);
            game.setPercentageOfDiscount(0);
        }
    }
}
