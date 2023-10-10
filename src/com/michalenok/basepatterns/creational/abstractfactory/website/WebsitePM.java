package com.michalenok.basepatterns.creational.abstractfactory.website;

import com.michalenok.basepatterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project ...");
    }
}
