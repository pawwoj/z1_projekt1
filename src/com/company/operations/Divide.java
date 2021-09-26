package com.company.operations;

import java.time.LocalDateTime;

public class Divide implements Operation{

    private LocalDateTime localDateTime;

    public  Divide(LocalDateTime localDateTime){
        this.localDateTime = localDateTime;
    }
    @Override
    public Integer calculate(Integer a, Integer b) {
        System.out.println("Time of operation: " + this.localDateTime);
        int c =0;
        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
return c;
    }
}
