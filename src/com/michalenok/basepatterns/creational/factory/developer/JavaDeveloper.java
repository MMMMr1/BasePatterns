package com.michalenok.basepatterns.creational.factory.developer;

import com.michalenok.basepatterns.creational.factory.developer.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes code ...");
    }
}
