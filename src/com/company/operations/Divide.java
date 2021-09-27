package com.company.operations;

import java.time.LocalDateTime;

public class Divide implements Operation {

    private final LocalDateTime timeOfOperation;


    public Divide(LocalDateTime localDateTime) {
        this.timeOfOperation = localDateTime;
    }

    @Override
    public Integer calculate(Integer a, Integer b) {
        System.out.println("Time of operation: " + this.timeOfOperation);
//        int c = 0;
//        try {
//            c = a / b;
//        } catch (Exception e) {
//      //      System.out.println(e);
//            e.printStackTrace();
//        }
        return a / b;
    }

    @Override
    public Double calculate(Double a, Double b) {
        System.out.println("Time of operation: " + this.timeOfOperation);
//        double c = 0;
//        try {
//            c = a / b;
//        } catch (Exception e) {
//            System.out.println(e);
//            e.printStackTrace();
//        }
        return a / b;
    }
}
