package Homework5NLayered.core.concretes;

import Homework5NLayered.GoogleUser.GoogleUserManager;
import Homework5NLayered.core.abstracts.OuterService;

public class GoogleUserManagerAdapter implements OuterService {

    @Override
    public void registerWOS() {
        GoogleUserManager manager = new GoogleUserManager();
        manager.register();

    }

}
