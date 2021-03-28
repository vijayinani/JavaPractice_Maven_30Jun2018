package com.inani.vijay.dummy;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CCLoader extends ClassLoader {

    public CCLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public Class loadClass(String name) throws ClassNotFoundException {
        System.out.println("Loading Class '" + name + "'");
        if (name.startsWith("com.inani.vijay")) {
            System.out.println("Loading Class using CCLoader");
            try {
                return getClass(name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.loadClass(name);
    }

    private Class getClass(String name) throws IOException {
        String file = name.replace('.', File.separatorChar) + ".class";
        byte[] b = null;
        try {
            b = loadClassFileData(file);
            Class c = defineClass(name, b, 0, b.length);
            resolveClass(c);
            return c;
        } finally {

        }
    }

    private byte[] loadClassFileData(String name) throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(name);
        int size = stream.available();
        byte buff[] = new byte[size];
        DataInputStream in = new DataInputStream(stream);
        in.readFully(buff);
        in.close();
        return buff;
    }
}
