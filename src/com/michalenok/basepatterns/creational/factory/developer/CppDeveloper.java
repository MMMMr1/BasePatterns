package com.michalenok.basepatterns.creational.factory.developer;

import com.michalenok.basepatterns.creational.factory.developer.Developer;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("C++ developer writes code ...");
    }
}
