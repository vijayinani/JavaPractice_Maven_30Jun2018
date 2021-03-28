package com.inani.vijay.management;

import java.lang.management.ManagementFactory;

public class ManagementOptions {
    public static void main(String[] args) {
        System.out.println(ManagementFactory.getThreadMXBean().getThreadCount());
    }
}
