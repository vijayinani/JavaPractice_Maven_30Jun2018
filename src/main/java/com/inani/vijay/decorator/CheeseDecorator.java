package com.inani.vijay.decorator;

import java.math.BigDecimal;

public class CheeseDecorator extends SandWichDecorator {
    Sandwich currentSandwich;

    public CheeseDecorator(Sandwich sw) {
        currentSandwich = sw;
    }

    @Override
    public String getDescription() {
        return currentSandwich.getDescription() + ", Cheese";
    }

    @Override
    public BigDecimal price() {
        return currentSandwich.price().add(new BigDecimal("0.50"));
    }

}