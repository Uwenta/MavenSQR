package ru.netology.sqr;

public class SQRService {
    public int calculate(int a, int b) {
        int i = 0;
        for (int x = 10; x < 100; x++) {
            if ((x * x >= a) & (x * x <= b)) {
                i++;
            }
        }
        return i;
    }

}
