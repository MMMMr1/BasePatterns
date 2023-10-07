package com.michalenok.basepatterns.structural.bridge.developer;

import com.michalenok.basepatterns.structural.bridge.developer.api.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code ...");
    }
}
