package com.michalenok.basepatterns.creational.factory.developerFactory;

import com.michalenok.basepatterns.creational.factory.developer.CppDeveloper;
import com.michalenok.basepatterns.creational.factory.developer.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
