package com.infosys.assignment.service;

import com.infosys.assignment.manager.Fibonacci;
import com.infosys.assignment.manager.TriangleManager;
import com.infosys.assignment.manager.WordManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {

    @Autowired
    private Fibonacci fibonacci;

    @Autowired
    private WordManager wordManager;

    @Autowired
    private TriangleManager triangleManager;

    public int getNthNumber(int n) {
        return fibonacci.getNthNumber(n);
    }

    public String reverseWords(String str) {
        return wordManager.reverseWords(str);
    }

    public String getTriangleType(int a, int b, int c) {
        return triangleManager.getTriangleType(a, b, c);
    }
}
