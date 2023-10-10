package com.michalenok.basepatterns.creational.abstractfactory.banking;

import com.michalenok.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code ...");
    }
}
