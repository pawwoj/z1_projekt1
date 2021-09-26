package com.company.operations;

import java.time.LocalDateTime;

public class Subtract implements Operation {
    private final LocalDateTime timeOfOperation;

    public Subtract(LocalDateTime localDateTime) {
        this.timeOfOperation = localDateTime;
    }

    @Override
    public Integer calculate(Integer a, Integer b) {
        System.out.println("Time of operation:" + this.timeOfOperation);
        return a - b;
    }


}
