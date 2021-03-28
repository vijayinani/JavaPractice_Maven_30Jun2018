package com.inani.vijay.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    public int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}
