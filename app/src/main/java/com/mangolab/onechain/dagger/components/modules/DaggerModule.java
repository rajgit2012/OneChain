package com.mangolab.onechain.dagger.components.modules;

import java.util.List;

/**
 * Created by rajforhad on 22/10/2016.
 */

public class DaggerModule {

    private List<String> usersList;
    private void provideApi(){
    }
    private boolean isApiEndPointAvailable(){
       return false;
    }

    private void injectModule(){

    }
    private List<String> getUsers(){
        return usersList;
    }
}
