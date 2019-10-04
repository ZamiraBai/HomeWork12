package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        for (int i = 2; i < 5; i++) {

            Runner r = new Runner();

            System.out.println("Runner "+ --i + " Берет палочку ");
            System.out.println("Runner "+ i + " Бежит к Runner " + ++i);
            r.start();
            r.join();
            Thread.sleep(5000);
        }
        System.out.println("Runner 5 бежит к финишу");

        for (int i =5; i >1; i--) {
            Runner r = new Runner();

            System.out.println("Runner " + i + " Бежит к Runner " + --i);
            System.out.println("Runner "+ i + " Берет палочку ");
            r.start();
            r.join();
            Thread.sleep(5000);
        }
    }
}
