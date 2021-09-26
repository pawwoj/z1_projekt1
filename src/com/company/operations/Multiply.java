package com.company.operations;

import java.time.LocalDateTime;

public class Multiply implements Operation {
    private final LocalDateTime timeOfOperation;

    public Multiply(LocalDateTime localDateTime) {
        this.timeOfOperation = localDateTime;
    }

    @Override
    public Integer calculate(Integer a, Integer b) {
        System.out.println("Time of operation: " + this.timeOfOperation);
        return a * b;
    }

    @Override
    public Double calculate(Double a, Double b) {
        System.out.println("Time of operation: " + this.timeOfOperation);
        return a * b;
    }
}
