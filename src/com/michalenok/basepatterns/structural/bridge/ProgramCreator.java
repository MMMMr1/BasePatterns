package com.michalenok.basepatterns.structural.bridge;

import com.michalenok.basepatterns.structural.bridge.developer.CppDeveloper;
import com.michalenok.basepatterns.structural.bridge.program.BankSystem;
import com.michalenok.basepatterns.structural.bridge.program.Program;
import com.michalenok.basepatterns.structural.bridge.program.StockExchange;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new CppDeveloper())
        };
// мы хотим чтобы все программы выполнялись
        for (Program program : programs){
            program.developProgram();
        }
    }
}

