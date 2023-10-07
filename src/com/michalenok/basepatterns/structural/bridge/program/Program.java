package com.michalenok.basepatterns.structural.bridge.program;

import com.michalenok.basepatterns.structural.bridge.developer.api.Developer;


public abstract class Program {
    public Developer developer;
    public Program(Developer developer) {
        this.developer = developer;
    }
    public abstract void developProgram();
}
