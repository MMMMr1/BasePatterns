package com.michalenok.basepatterns.creational.factory.developerFactory;

import com.michalenok.basepatterns.creational.factory.developer.Developer;
import com.michalenok.basepatterns.creational.factory.developer.JavaDeveloper;
import com.michalenok.basepatterns.creational.factory.developer.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
