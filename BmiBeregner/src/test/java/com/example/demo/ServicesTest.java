package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicesTest {

    @Test
    void beregnBmiValidNumbers(){
        Services service = new Services();
        double result = service.bmiBeregner2(75,1.8);
        assertEquals(23.15,result);
    }
}