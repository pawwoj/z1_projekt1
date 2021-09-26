package com.company.operations;

import java.time.LocalDateTime;

public class Add implements Operation{
    private LocalDateTime timeOfOperation;

    public Add(LocalDateTime localDateTime){
        this.timeOfOperation = localDateTime;
    }

    @Override
    public Integer calculate(Integer a, Integer b) {
        System.out.println("Time of operation: " + this.timeOfOperation);
        return a + b;
    }
}
