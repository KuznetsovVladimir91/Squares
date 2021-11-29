package ru.netology.sqr;

public class SQRService {

    public int calculationSquares(int minimumLimit, int maximumLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= minimumLimit && i * i <= maximumLimit) {
                counter++;
            }
        return counter;

    }

}
