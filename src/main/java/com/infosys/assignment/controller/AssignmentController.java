package com.infosys.assignment.controller;


import com.infosys.assignment.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @GetMapping(value = "/Fibonacci")
    public ResponseEntity<Integer> getNthNumber(int n) {
        return ResponseEntity
                .ok()
                .cacheControl(CacheControl.noCache())
                .body(assignmentService.getNthNumber(n));
    }

    @GetMapping(value = "/TriangleType")
    public ResponseEntity<String> getTriangleType(int a, int b, int c) {
        return ResponseEntity
                .ok()
                .cacheControl(CacheControl.noCache())
                .body(assignmentService.getTriangleType(a, b, c));
    }

    @GetMapping(value = "/ReverseWords")
    public ResponseEntity<String> reverseWords(String str) {
        return ResponseEntity
                .ok()
                .cacheControl(CacheControl.noCache())
                .body(assignmentService.reverseWords(str));
    }
}
