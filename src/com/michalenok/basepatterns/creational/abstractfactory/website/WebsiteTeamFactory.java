package com.michalenok.basepatterns.creational.abstractfactory.website;

import com.michalenok.basepatterns.creational.abstractfactory.Developer;
import com.michalenok.basepatterns.creational.abstractfactory.ProjectManager;
import com.michalenok.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import com.michalenok.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
