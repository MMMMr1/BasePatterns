package com.michalenok.basepatterns.creational.abstractfactory.website;

import com.michalenok.basepatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code ...");
    }
}
