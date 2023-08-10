package com.desingpattern.example.singleton;

public class SingletonExample {

    private static SingletonExample singletonExample = null;
    private static int deger = 0;
    private SingletonExample(){

    }
    public static SingletonExample getInstance(){
        if (singletonExample == null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public int getValue() {
        return deger;
    }

    public int increaseValue(int i){
        return deger = deger + i ;
    }
}
