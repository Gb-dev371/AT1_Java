package org.example;

public class CalculadoraComplexa {
    public static double somaReais(double numReal1, double numReal2){
        double result1;
        result1 = numReal1 + numReal2;
        return result1;
    }


    public static double somaImaginario(double imaginario1, double imaginario2){
        double result2;
        result2 = imaginario1 + imaginario2;
        return result2;
    }

    public static double subtReais(double numReal1, double numReal2){
        double result1;
        result1 = numReal1 - numReal2;
        return result1;
    }


    public static double subtImaginario(double imaginario1, double imaginario2){
        double result2;
        result2 = imaginario1 - imaginario2;
        return result2;
    }

    public static double modulo(double numReal1, double imaginario1){
        double  result2;
        result2 = (Math.sqrt(Math.pow(numReal1,2)) + (Math.pow(imaginario1,2)));
        result2 = (Math.sqrt(result2));
        return (result2);
    }
}
