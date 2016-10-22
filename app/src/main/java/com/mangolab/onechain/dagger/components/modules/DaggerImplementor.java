package com.mangolab.onechain.dagger.components.modules;

import java.util.List;

/**
 * Created by rajforhad on 22/10/2016.
 */

public class DaggerImplementor implements IDagger {
    @Override
    public void injectNewItem() {
        System.out.println("Inject new item !");
    }

    @Override
    public List<String> allInjectedItems() {
        return null;
    }

    @Override
    public List<String> allUnInjectedItems() {
        return null;
    }

    @Override
    public void generateNewItem() {
        System.out.println("Generate new item !");
    }

    private void generateToken(){
        System.out.println("Generate token!");
    }

    private void invalidateToken(){
        System.out.println("Invalidate token!");
    }

    private void invalidateOldToken(){
        System.out.println("Invalid token!");
    }
}
