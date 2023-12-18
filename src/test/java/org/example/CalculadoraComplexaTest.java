package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraComplexaTest {

    @org.junit.jupiter.api.Test
    void somaReais() {
        double real1 = 2;
        double real2 = 4;
        double soma = real1+real2;
        assertEquals(6, soma);
    }

    @org.junit.jupiter.api.Test
    void somaImaginario() {
        double imaginario1 = 2;
        double imaginario2 = 4;
        double soma = imaginario1+imaginario2;
        assertEquals(6, soma);
    }

    @org.junit.jupiter.api.Test
    void subtReais() {
        double real1 = 2;
        double real2 = 4;
        double sub = real1-real2;
        assertEquals(-2, sub);
    }

    @org.junit.jupiter.api.Test
    void subtImaginario() {
        double imaginario1 = 2;
        double imaginario2 = 4;
        double sub = imaginario1-imaginario2;
        assertEquals(-2, sub);
    }

    @org.junit.jupiter.api.Test
    void modulo(){
        double numReal1 = 1;
        double imaginario1 = 2;
        double result2 = (Math.sqrt(Math.pow(numReal1,2)) + (Math.pow(imaginario1,2)));
        result2 = (Math.sqrt(result2));
        assertEquals(Math.sqrt(Math.sqrt(Math.pow(numReal1,2)) + (Math.pow(imaginario1,2))), result2);
    }
}