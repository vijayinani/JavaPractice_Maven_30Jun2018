package com.inani.vijay.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        //serialize();
        System.out.println(deserialize());
    }

    private static Object deserialize() throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.ser"));
        return objectInputStream.readObject();
    }

    private static void serialize() throws Exception {
        Employee employee = new Employee();
        employee.id = 1;
        //employee.name = "vijay";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.ser"));
        objectOutputStream.writeObject(employee);
    }
}
