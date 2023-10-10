package com.michalenok.basepatterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = manager.buildWebsite();
        System.out.println(website);
    }
}
