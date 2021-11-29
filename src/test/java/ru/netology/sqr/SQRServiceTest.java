package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSquaresOfNumbersInARange() {
        SQRService sqrService = new SQRService();

        int minimumLimit = 200;
        int maximumLimit = 300;
        int expected = 3;

        int actual = sqrService.calculationSquares(minimumLimit, maximumLimit);

        assertEquals(expected, actual);
    }
}
