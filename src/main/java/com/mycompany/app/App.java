package com.mycompany.app;

import java.util.Date;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }

    public String getCurrentTimestamp() {
        return (new Date()).toString();
    }
}
