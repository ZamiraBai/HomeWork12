package com.company;

public class Runner extends Thread {

private  Runner runner;

    public Runner() {
    }

    public Runner(String name, Runner runner) {
        super(name);
        this.runner = runner;
    }
}
