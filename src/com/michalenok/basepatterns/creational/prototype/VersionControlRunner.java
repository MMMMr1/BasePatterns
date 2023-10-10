package com.michalenok.basepatterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project superProject = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();\n");
        System.out.println(superProject);
        ProjectFactory projectFactory = new ProjectFactory(superProject);
        Project project = projectFactory.cloneProject();
        System.out.println(project);
    }
}
