package com.michalenok.basepatterns.behavioral.chainofresponsibility;

public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {

    }
}
