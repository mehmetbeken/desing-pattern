package com.desingpattern.example.singleton;

public class Main {

    public static void main(String[] args) {

        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        singletonExample1.increaseValue(1);
        singletonExample2.increaseValue(5);

        System.out.println(singletonExample1.getValue());
        System.out.println(singletonExample1 == singletonExample2);
    }
}
