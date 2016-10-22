package com.mangolab.onechain.dagger.components.modules;

import java.util.List;

/**
 * Created by rajforhad on 22/10/2016.
 */

public class DaggerImplementor implements IDagger {
    @Override
    public void injectNewItem() {

    }

    @Override
    public List<String> allInjectedItems() {
        return null;
    }

    @Override
    public List<String> allUnInjectedItems() {
        return null;
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
