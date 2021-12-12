package ru.netology.sqr;

public class SQRService {
    public int getCountSQR(int from, int to) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i*i >= from && i*i <= to) {
                count ++;
            }
        }
        return count;
    }
}
