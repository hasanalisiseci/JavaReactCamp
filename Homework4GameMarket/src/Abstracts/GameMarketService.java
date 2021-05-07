package Abstracts;

import Entities.Game;
import Entities.GameCustomer;

public interface GameMarketService {
    void buyGame(Game game, GameCustomer gameCustomer);
    void giveBackGame(Game game, GameCustomer gameCustomer);
}
