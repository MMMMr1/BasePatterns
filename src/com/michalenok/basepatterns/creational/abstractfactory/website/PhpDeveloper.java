package com.michalenok.basepatterns.creational.abstractfactory.website;

import com.michalenok.basepatterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code ...");
    }
}
