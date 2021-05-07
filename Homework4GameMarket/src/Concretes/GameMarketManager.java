package Concretes;

import Abstracts.GameMarketService;
import Entities.Game;
import Entities.GameCustomer;

public class GameMarketManager implements GameMarketService {
    @Override
    public void buyGame(Game game, GameCustomer gameCustomer) {
        if (gameCustomer.getWallet() >= game.getPrice()) {
            System.out.println(game.getGameName() + " adlı oyun kütüphanenize eklenmiştir!");
            gameCustomer.setWallet(gameCustomer.getWallet()-game.getPrice());
            gameCustomer.games.add(game);
        } else {
            System.out.println(game.getGameName() + " adlı oyun kütüphanenize eklenemedi! Lütfen bakiyenizi kontrol edin.");
            System.out.println("Güncel Bakiyeniz: " + gameCustomer.getWallet());
        }
    }

    @Override
    public void giveBackGame(Game game, GameCustomer gameCustomer) {
        boolean isIn = false;
        for (Game g: gameCustomer.games) {
            if (g == game) {
                isIn = true;
                gameCustomer.games.remove(game);
                System.out.println("Oyununuz kütüphanenizden kaldırılmış ve ücreti iade edilmiştir.");
                gameCustomer.setWallet(gameCustomer.getWallet()+game.getPrice());
            } else {
                System.out.println("İade etmek istediğiniz oyuna sahip değilsiniz!");
            }
        }

    }
}
