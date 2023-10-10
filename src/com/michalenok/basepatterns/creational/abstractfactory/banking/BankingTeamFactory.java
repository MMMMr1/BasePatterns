package com.michalenok.basepatterns.creational.abstractfactory.banking;

import com.michalenok.basepatterns.creational.abstractfactory.Developer;
import com.michalenok.basepatterns.creational.abstractfactory.ProjectManager;
import com.michalenok.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import com.michalenok.basepatterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
