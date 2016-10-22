package com.mangolab.onechain.dagger.components.modules;

import java.util.List;

/**
 * Created by rajforhad on 22/10/2016.
 */

public interface IDagger {
    void injectNewItem();
    List<String> allInjectedItems();
    List<String> allUnInjectedItems();
    void generateNewItem();
    void newToken();
}
