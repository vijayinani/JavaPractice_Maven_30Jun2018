package com.inani.vijay.dummy;

import java.io.*;

public class MySingletonDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton);
        MySingleton clonedSingleton = (MySingleton) mySingleton.clone();
        System.out.println(clonedSingleton);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        objectOutputStream.writeObject(mySingleton);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton.ser"));
        MySingleton singletonDeserialized = (MySingleton) objectInputStream.readObject();
        System.out.println(singletonDeserialized);
    }
}
