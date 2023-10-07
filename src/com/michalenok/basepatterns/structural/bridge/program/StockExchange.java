package com.michalenok.basepatterns.structural.bridge.program;

import com.michalenok.basepatterns.structural.bridge.developer.api.Developer;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange developer in progress ...");
        developer.writeCode();
    }
}
