package com.mangolab.onechain.dagger.components.modules;

import java.util.List;

/**
 * Created by rajforhad on 22/10/2016.
 */

public class DaggerImplementor implements IDagger {
    @Override
    public void injectNewItem() {
        System.out.println("Inject new item test going on!");
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
        System.out.println("Generate new items!");
    }

    @Override
    public void newToken() {

    }

    @Override
    public void reloadToken() {
        System.out.println("Token reloaded!");
    }

    private void generateToken(){
        System.out.println("Generate token updated!");
    }

    private void invalidateToken(){
        System.out.println("Invalidate token!");
    }

    private void invalidateOldToken(){
        System.out.println("Invalid token!");
    }
}
