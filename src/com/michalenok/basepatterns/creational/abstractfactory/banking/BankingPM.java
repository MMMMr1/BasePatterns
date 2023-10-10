package com.michalenok.basepatterns.creational.abstractfactory.banking;

import com.michalenok.basepatterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project ...");
    }
}
