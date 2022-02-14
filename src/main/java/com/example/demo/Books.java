package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Books {
    public int numberOfBooks(){
        return 100;
    }
}
