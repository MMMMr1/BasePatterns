package com.michalenok.basepatterns.creational.factory.developerFactory;

import com.michalenok.basepatterns.creational.factory.developer.Developer;
import com.michalenok.basepatterns.creational.factory.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
