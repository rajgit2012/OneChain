package com.mangolab.onechain.dagger.components;

import com.mangolab.onechain.MainActivity;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by rajforhad on 22/10/2016.
 */

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
}
