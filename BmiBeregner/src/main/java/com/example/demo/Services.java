package com.example.demo;

public class Services {
    public double bmiBeregner(int højde, int vægt) {
        boolean højdeOk, vægtOk;
        double bmi = 0;

        if (højde > 0) {
            højdeOk = true;
        } else {
            højdeOk = false;
            throw new IllegalArgumentException("du er en idiot!");
        }

        if (vægt > 0) {
            vægtOk = true;
        } else {
            vægtOk = false;
        }

        if (vægtOk && højdeOk) {
            bmi = vægt / (højde * højde);

        }
        return bmi;
    }
}
