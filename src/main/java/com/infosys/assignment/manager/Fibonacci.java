package com.infosys.assignment.manager;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {

    public int getNthNumber(int n) {
        if(n <= 1)
            return 0;

        int first = 0;
        int second = 1;

        for(int i = 3; i <= n; ++i) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }
}
