package com.michalenok.basepatterns.creational.factory;

import com.michalenok.basepatterns.creational.factory.developer.Developer;
import com.michalenok.basepatterns.creational.factory.developerFactory.CppDeveloperFactory;
import com.michalenok.basepatterns.creational.factory.developerFactory.DeveloperFactory;
import com.michalenok.basepatterns.creational.factory.developerFactory.JavaDeveloperFactory;
import com.michalenok.basepatterns.creational.factory.developerFactory.PhpDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("C++")){
            return new CppDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
