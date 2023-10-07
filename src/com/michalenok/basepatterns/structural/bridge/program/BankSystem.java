package com.michalenok.basepatterns.structural.bridge.program;

import com.michalenok.basepatterns.structural.bridge.developer.api.Developer;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system developer in progress ...");
        developer.writeCode();
    }
}
