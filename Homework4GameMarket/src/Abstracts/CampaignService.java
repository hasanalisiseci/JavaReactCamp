package Abstracts;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
    void addCampaign(Game game, Campaign campaign);
    void updateCampaign(Game game, Campaign campaign);
    void deleteCampaign(Game game);
}
