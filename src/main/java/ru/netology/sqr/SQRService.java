package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {
        int i = 0;
        for (int x = 10; x < 100; x++) {
            if ((x * x >= min) & (x * x <= max)) {
                i++;
            }
        }
        return i;
    }

}
