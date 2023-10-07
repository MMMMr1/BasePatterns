package com.michalenok.basepatterns.structural.bridge.developer;

import com.michalenok.basepatterns.structural.bridge.developer.api.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code ...");
    }
}
