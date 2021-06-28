package com.inani.vijay;

import java.lang.reflect.Constructor;

public class SingletonReflection {

    public static void main(String[] args) {
        Singleton one = Singleton._instance;
        Singleton two = null;

        try {

            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor c : constructors) {
                c.setAccessible(true);
                two = (Singleton) c.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
    }

}

class Singleton {

    public static Singleton _instance = new Singleton();

    private Singleton() {
    }
}
