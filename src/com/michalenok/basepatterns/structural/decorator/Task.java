package com.michalenok.basepatterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer javaDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(javaDeveloper.makeJob());
        System.out.println("---------------------------------------");
        Developer javaTeamLead = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(javaTeamLead.makeJob());
    }
}
