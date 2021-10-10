package com.infosys.assignment.manager;

import org.springframework.stereotype.Component;

@Component
public class TriangleManager {

    public String getTriangleType(int a, int b, int c) {
        if(a == b && a == c)
            return "Equilateral";

        if(a == b || a == c || b == c)
            return "Isosceles";

        return "Scalene";
    }
}
