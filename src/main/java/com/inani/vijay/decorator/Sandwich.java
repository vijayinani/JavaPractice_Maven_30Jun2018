package com.inani.vijay.decorator;

import java.math.BigDecimal;

public abstract class Sandwich {
    protected String description = "Sandwich";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal price();
}
